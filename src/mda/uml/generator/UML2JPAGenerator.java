package mda.uml.generator;

import java.io.File;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.uml.UmlModel;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.internal.impl.ConstraintImpl;
import org.eclipse.uml2.uml.internal.impl.LiteralStringImpl;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.internal.impl.PropertyImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

/**
 * simple and flexible model driven custom JPA Class generator 
 * using UML class diagram (xmi format) and Epsilon EGL 
 * tested with modelio  
 * @author
 *     Francois Moreews  + Kevin Courtet - 2018 
 */


public class UML2JPAGenerator {
	
	@Option(name="-m",usage="UML model file (xmi)")
	private String modelFile;
	//    warning to xmi tag (must be  often changed )
	@Option(name="-x",usage="egx epsilon file") 
	private String egxFile ;

	@Argument
	private List<String> arguments = new ArrayList<String>();

	public static void main(String[] args) throws  Exception {
		new UML2JPAGenerator().doMain(args);
	}

	@SuppressWarnings("deprecation")
	public void doMain(String[] args) throws Exception {
		CmdLineParser parser = new CmdLineParser(this);

		try {
			// parse the arguments and writes a message in case of errors
			parser.parseArgument(args);
			if( modelFile ==null  && egxFile==null ){
				throw new CmdLineException(parser,"No argument is given");
			}
			if( modelFile ==null   ){
				throw new CmdLineException(parser, "No argument -m ");
			}
			else {
				File f = new File(modelFile);
				if(! f.exists()){
					throw new CmdLineException(parser, String .format("uml file not found (%s)", f.getAbsolutePath() ));
				}
			}
			if( egxFile==null ){
				throw new CmdLineException(parser,"No argument -x ");
			}
			else {
				File f = new File(egxFile);
				if(! f.exists()){
					throw new CmdLineException(parser, String .format("egx file not found (%s)", f.getAbsolutePath() ));
				}
			}

		} 
		catch( CmdLineException e ) {

			System.err.println(e.getMessage());
			System.err.println("java generator.GenerateJPAapp [options...] arguments...");

			parser.printUsage(System.err);
			System.err.println();

			return;
		}

		System.out.println("execute:start"); // replace debug for the moment
		
		// use epsilon-core.jar to create a new module Egx
		EgxModule module = new EgxModule(new EglFileGeneratingTemplateFactory()); 
		
		// use egxFile (codegen.egx) who use codegen.egl (template for final java class)
		module.parse(new File(egxFile).getAbsoluteFile());
		// check if the module is correct
		if (!module.getParseProblems().isEmpty()) {
			System.out.println("Syntax errors found. Exiting.");
			return;
		}
		
		// create a new UmlModel with modelFile and stock him in tmp file (see generate_test1.sh)
		UmlModel model = new UmlModel();

		model.setModelFile(modelFile); 
		model.setName("L");
		model.load();

		describe(model); // describe the model with the function under 

		System.out.println(model.getMetamodelFiles());
		// generate final class in .java
		module.getContext().getModelRepository().addModel(model);
		module.execute();

		System.out.println("execute:end");
	}

	// display information about model content and sorting the model elements by instance and property
	// use lot of method of espilon-core.jar and other epsilon-xxx.jar
	private void describe(UmlModel model) {
		Collection<EObject> ct = model.allContents();
		for(EObject eo:ct){
			System.out.println("==> "+eo.getClass().getSimpleName()+"");
			if(eo instanceof ModelImpl){
				ModelImpl mi = (ModelImpl) eo;
			}
			if(eo instanceof ConstraintImpl){
				ConstraintImpl mi = (ConstraintImpl) eo;
				EList<Element> oel = mi.allOwnedElements();

				for(Element el:oel){
					if(el instanceof LiteralStringImpl){
						LiteralStringImpl li = (LiteralStringImpl) el;
						System.out.println("\t\tconstraint1:"+el.toString());
						// String cst=el.toString();
						if(li.getValue()!=null  ){
							Property p = UMLFactory.eINSTANCE.createProperty();
							String n="";
							if(li.getValue().equals("required")){

								n="NotNull";

							}
							else{
								n=li.getValue();
							}
							p.setName(n);
							applyProp(mi, p);
						}
					}
				}
			}
		}
	}
	private void applyProp(ConstraintImpl mi, Property required) {
		EList<Element> coel =mi.getConstrainedElements();
		for(Element el1:coel){

			System.out.println("\t\tgetConstrainedElements:"+el1);
			System.out.println("\t\tgetConstrainedElements:"+el1.getClass().getSimpleName());

			if(el1 instanceof PropertyImpl){
				PropertyImpl elp = (PropertyImpl) el1;
				elp.getRedefinedProperties().add(required);
			}
		}
	}
}