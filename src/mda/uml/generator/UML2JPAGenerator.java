package mda.uml.generator;

import java.io.File;
 
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.uml.UmlModel;
//import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.execute.context.Variable;
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
           // parse the arguments.
           parser.parseArgument(args);
           if( modelFile ==null  && egxFile==null ){
               throw new CmdLineException(parser,"No argument is given");
           }
           if( modelFile ==null   ){
               throw new CmdLineException(parser, "No argument -m ");
           }else {
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
           
       } catch( CmdLineException e ) {
          
           System.err.println(e.getMessage());
           System.err.println("java generator.GenerateJPAapp [options...] arguments...");
          
           parser.printUsage(System.err);
           System.err.println();

 
           return;
}
	  
 
	  System.out.println("execute:start");
  
    EgxModule module = new EgxModule(new EglFileGeneratingTemplateFactory());
   
	module.parse(new File(egxFile).getAbsoluteFile());
	
    if (!module.getParseProblems().isEmpty()) {
      System.out.println("Syntax errors found. Exiting.");
      return;
    }
    
    //XUMLModel model = new XUMLModel();

   UmlModel model = new UmlModel();
  
	model.setModelFile(modelFile); 

	
	
 
    model.setName("L");
    model.load();
    
   describe(model);
 
    
    
    System.out.println(model.getMetamodelFiles());;
    
 
    module.getContext().getModelRepository().addModel(model);
    SampleTool st = new SampleTool();
    st.setName("myst");
    System.out.println("custom populate context");
	module.getContext().getFrameStack().put(
			Variable.createReadOnlyVariable(
			"testtool", test()));
	
	
	module.getContext().getFrameStack().put(
			Variable.createReadOnlyVariable(
					"test1", true));

	
	module.getContext().getFrameStack().put(
			Variable.createReadOnlyVariable(
					"formatutils", new FormatUtils()));
	
	
	/*
	module.getContext().getNativeTypeDelegates().
	  add(new ExtensionPointToolNativeTypeDelegate());
	*/
	// a=new Native();
	//
   // EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
 //	model.setMetamodelUri(EcorePackage.eINSTANCE.getNsURI());
   
    
    // ... and execute
    module.execute();
   
    System.out.println("execute:end");
    
 // UmlModel model = new UmlModel();
    
    
    
    // CDOResource profileRes = transaction.createResource(getResourcePath("/profile1.profile.uml"));
     
     //--    // create a local profile resource in the repository
     //Profile profile = UMLFactory.eINSTANCE.createProfile();
     //profileRes.getContents().add(profile);
     //profile.setName("MyProfile");
     //profile.setURI("");
     //rs.getPackageRegistry().put(profile.getNsURI(), profile);
     /*Stereotype conceptStereotype = profile.createOwnedStereotype(
             S_CONCEPT, false);*/
     /*Model uml = UML2Util.load(rset,
             URI.createURI(UMLResource.UML_METAMODEL_URI),
             UMLPackage.Literals.MODEL);*/
     /*
     Model uml  = UML2Util.load(rset,
             URI.createURI(UMLResource.UML_METAMODEL_URI),
             UMLPackage.Literals.MODEL);
     
     profile.createMetamodelReference(uml);
     conceptStereotype
             .createExtension((org.eclipse.uml2.uml.Class) uml
                     .getOwnedType("Classifier"), false);
                     */
     //EPackage definition = profile.define();
     //EPackage e = profile.getDefinition();
 /*
     // condition the Ecore definition for CDO
     CDOUtil.prepareDynamicEPackage(definition);

     // apply the profile and stereotype to the model
     umlModel.applyProfile(profile);
     */
     //--
  String   codeParseError = "";
	for (ParseProblem problem : module.getParseProblems()) {
		codeParseError += problem.toString() + "\n";
}  
	
	System.out.println(codeParseError);
  }
private Object test() {
			// TODO Auto-generated method stub
			return "==TEST_HERE==";
		}

		/*
 ==> ModelImpl
==> EAnnotationImpl
==> PropertyImpl
==> LiteralStringImpl
==> ConstraintImpl
==> LiteralStringImpl
==> ConstraintImpl
==> LiteralStringImpl
==> ClassImpl
==> PropertyImpl
==> PropertyImpl
==> PropertyImpl
==> CommentImpl
==> PropertyImpl
==> PropertyImpl
==> ClassImpl
==> GeneralizationImpl
==> PropertyImpl
==> ClassImpl
==> PropertyImpl
==> LiteralIntegerImpl
==> PropertyImpl
==> PropertyImpl
==> PropertyImpl
==> AssociationImpl
==> PropertyImpl
==> ClassImpl
==> ClassImpl
==> PrimitiveTypeImpl
 */
		private void describe(UmlModel model) {
			Collection<EObject> ct = model.allContents();
			 for(EObject eo:ct){
				 
				 System.out.println("==> "+eo.getClass().getSimpleName()+"");
				 
				 
				 if(eo instanceof ModelImpl){
					 ModelImpl mi = (ModelImpl) eo;
					// mi.applyProfile(arg0)
				 }
				 
				 
				 if(eo instanceof ConstraintImpl){
					 ConstraintImpl mi = (ConstraintImpl) eo;
					 EList<Element> oel = mi.allOwnedElements();
					 for(Element el:oel){
						// el.getAppliedStereotypes();
						 //System.out.println(el);
						 if(el instanceof LiteralStringImpl){
							 LiteralStringImpl li = (LiteralStringImpl) el;
							// System.out.println(">>n:"+li.getName());
							// System.out.println(">>v:"+li.getValue());
							 System.out.println("\t\tconstraint1:"+el.toString());
							 //value: required
						 
							// String cst=el.toString();
							 
							 if(li.getValue()!=null ){
								 Property p = UMLFactory.eINSTANCE.createProperty();
								 String n="";
								 if(li.getValue().equals("required")){
								
									 n="NotNull";
								   
								 }else{
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
				//		getConstrainedElements:org.eclipse.uml2.uml.internal.impl.PropertyImpl@7a220c9a (name: score, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: false, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
						 if(el1 instanceof PropertyImpl){
							 PropertyImpl elp = (PropertyImpl) el1;
							//elp.getEAnnotations()
							 elp.getRedefinedProperties().add(required);
						 }
				 }
		}
  
}