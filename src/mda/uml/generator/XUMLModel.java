package mda.uml.generator;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.uml.UmlModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.ConstraintImpl;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.uml2.uml.util.UMLUtil;

public class XUMLModel  extends UmlModel {
		
	
	private static   ResourceSet resourceSet;
	private static   Profile profile ;
	
	 
	@Override
	public void load() throws EolModelLoadingException {
		
		super.load();
		Collection<EObject> ct = this.allContents();
		 for(EObject eo:ct){
			 System.out.println("==> "+eo.getClass().getSimpleName()+"");
			 if(eo instanceof ModelImpl){
				 ModelImpl mi = (ModelImpl) eo;
				 mi.applyProfile(profile);
			 }
			 if(eo instanceof ConstraintImpl){
				 ConstraintImpl mi = (ConstraintImpl) eo;
				 EList<Element> oel = mi.allOwnedElements();
				 for(Element el:oel){
					 el.getAppliedStereotypes();
				 }
			 }
		 }
		//c.applyStereotype(st);
		//Class system = (Class) this.get
	// this.packages
		
	}
	
		@Override
		protected ResourceSet createResourceSet() {
			System.out.println("createResourceSet");
			
		
			
			  resourceSet = super.createResourceSet();
			  //test
			  UMLResourcesUtil.init(resourceSet);
			  //test
			UMLUtil.init(resourceSet);
			resourceSet.getPackageRegistry().put(UMLPackage.eINSTANCE.getNsURI(), UMLPackage.eINSTANCE);
		//--mod test fm 
			Map<URI,URI> uriMap = resourceSet.getURIConverter().getURIMap();
			//final URI uri2 = URI.createURI("jar:file:D:/.../plugins/org.eclipse.uml2.uml.resources_4.1.0.v20130506-1015.jar!/");
			
			//URI uri = URI.createFileURI("D:/.../MyModel.uml");
			/*
			uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uri2.appendSegment("libraries").appendSegment(""));
			uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri2.appendSegment("metamodels").appendSegment(""));
			uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri2.appendSegment("profiles").appendSegment(""));
			*/
			//uriMap.put(URI.createURI("pathmap://Papyrus.profile.uml"),URI.createURI("file:/D:/.../Papyrus.profile.uml/"));
			
			uriMap.put(URI.createURI("pathmap:LocalProfile.profile.xmi#_3ot3VzjdEeiUQ7ykTWw2ww"),URI.createURI("file:/home/fmoreews/Documents/workspace/xmi/example/LocalProfile.profile.xmi#_3ot3VzjdEeiUQ7ykTWw2ww"));
			
	//URIConverter.URI_MAP		
			
				//test
		/*		
	URI baseUri = URI.createURI(
			"jar:file:/home/fmoreews/Desktop/eclipse-epsilon/plugins/org.eclipse.uml2.uml.resources_5.2.0.v20160822-0739.jar!/"
			);
	uriMap.put(URI.createURI( UMLResource.LIBRARIES_PATHMAP ),baseUri.appendSegment( "libraries" ).appendSegment( "" ));
	uriMap.put(URI.createURI( UMLResource.METAMODELS_PATHMAP
	), baseUri.appendSegment( "metamodels" ).appendSegment( "" ));
	uriMap.put(URI.createURI( UMLResource.PROFILES_PATHMAP ),
	baseUri.appendSegment( "profiles" ).appendSegment( "" ));
	*/
			
			
			 profile = UMLFactory.eINSTANCE.createProfile();
		    //profileRes.getContents().add(profile);
		    profile.setName("MyProfile");
		    profile.setURI("file:/home/fmoreews/Documents/workspace/xmi/example/LocalProfile.profile.xmi#_3ot3VzjdEeiUQ7ykTWw2ww");
		    
		 //  profile.define();
		    
		//    System.out.println( profile.getApplicableStereotypes());
		 //   Stereotype conceptStereotype =profile.getOwnedStereotype("stereoone");
		  
		    
		    
		boolean isAbstract=false;
	
		Stereotype conceptStereotype = profile.createOwnedStereotype("stereoone", isAbstract);
		
	PrimitiveType stringPrimitiveType = (PrimitiveType) profile.createOwnedPrimitiveType("String");
	Property base_Element = createAttribute( conceptStereotype, "base_Element", stringPrimitiveType,0, 1, null);
		 
		
	//	Profile ecoreProfile = createProfile("ecore", "http://www.eclipse.org/schema/UML2/examples/ecore");
		
	//	PrimitiveType stringPrimitiveType = importPrimitiveType(ecoreProfile, "String");
		
		
		
		  // Property base_Element = UMLFactory.eINSTANCE.createProperty();
		   //base_Element.setName("base_Element");
		   // profile.createDependency("");
		   // Element propEl;
			  UMLUtil.setBaseElement(conceptStereotype, base_Element);
		    //Property prop = Property.
		//	 conceptStereotype.allAttributes().clear();
		 	 
		//	 conceptStereotype.allAttributes().add(base_Element);
		    System.out.println(conceptStereotype);
		 //  System.exit(0);;
		    	//http://schema.omg.org/spec/UML/2.1.1
		    EPackage p = profile.define();
		    resourceSet.getPackageRegistry().put(p.getNsURI(), p);
		    
		    EPackage.Registry.INSTANCE.put("http:///schemas/LocalProfile/_3otQWjjdEeiUQ7ykTWw2ww/0", p);
		    
		    
		    //c.applyStereotype(st);
		    
		  //  uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uri.appendSegment("libraries").appendSegment(""));
		//    uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri.appendSegment("metamodels").appendSegment(""));
		//    uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri.appendSegment("profiles").appendSegment(""));
 
		     /*
		    XMIResourceImpl resource = new XMIResourceImpl();
		   
		    File source = new File("/home/fmoreews/Documents/workspace/xmi/example/LocalProfile.profile.xmi");
		    try {
				HashMap<Object, Object> hashMap = new HashMap<Object,Object>();
				resource.load(new FileInputStream(source), hashMap);
				System.out.println(hashMap);
				
				System.out.println("@@@@@@@@@@@@@@@@");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
		    
		    
			System.out.println(p);
			/*
			EPackage.Registry.INSTANCE.put("D:/.../MyModel.uml",UMLPackage.eINSTANCE);
			Resource resource = resourceSet.createResource(uri);
			try {
				resource.load(null);
				System.out.println("Model: load complete");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			Model m = (Model) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.MODEL);
			if(m==null){
				System.err.println("Model: load failed!");
				System.exit(1);
			}
			
			EList<Element> list = m.allOwnedElements();
	                //count number of Elements with at least one stereotype
			int stereo = 0;
			for(int i=0;i<list.size();i++){
				if(list.get(i).getAppliedStereotypes().size() > 0){
					stereo++;
				}
			}
			
			*/
			
			 
			UMLResourcesUtil.init(resourceSet);
		//-	
			return resourceSet;
		}
		
		
		protected static org.eclipse.uml2.uml.Package load(URI uri) {
			org.eclipse.uml2.uml.Package package_ = null;

			try {
				// Load the requested resource
				 org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(uri, true);

				// Get the first (should be only) package from it
				package_ = (org.eclipse.uml2.uml.Package) EcoreUtil
					.getObjectByType(resource.getContents(),UMLPackage.Literals.PACKAGE);
			} catch (WrappedException we) {
				System.err.println(we.getMessage());
				System.exit(1);
			}

			return package_;
	}
		
		protected static PrimitiveType importPrimitiveType(
				org.eclipse.uml2.uml.Package package_, String name) {

			org.eclipse.uml2.uml.Package umlLibrary = (org.eclipse.uml2.uml.Package) load(URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI));

			PrimitiveType primitiveType = (PrimitiveType) umlLibrary
				.getOwnedType(name);

			package_.createElementImport(primitiveType);

		//	out("Primitive type '%s' imported.", primitiveType.getQualifiedName());

			return primitiveType;
	}
		
		protected static Profile createProfile(String name, String nsURI) {
			Profile profile = UMLFactory.eINSTANCE.createProfile();
			profile.setName(name);
			profile.setURI(nsURI);

			//out("Profile '%s' created.", profile.getQualifiedName());

			return profile;
	}
		
		protected static Property createAttribute(
				org.eclipse.uml2.uml.Class class_, String name, Type type,
				int lowerBound, int upperBound, Object defaultValue) {

			Property attribute = class_.createOwnedAttribute(name, type,
				lowerBound, upperBound);

			if (defaultValue instanceof Boolean) {
				LiteralBoolean literal = (LiteralBoolean) attribute
					.createDefaultValue(null, null,
						UMLPackage.Literals.LITERAL_BOOLEAN);
				literal.setValue(((Boolean) defaultValue).booleanValue());
			} else if (defaultValue instanceof String) {
				if (type instanceof Enumeration) {
					InstanceValue value = (InstanceValue) attribute
						.createDefaultValue(null, null,
							UMLPackage.Literals.INSTANCE_VALUE);
					value.setInstance(((Enumeration) type)
						.getOwnedLiteral((String) defaultValue));
				} else {
					LiteralString literal = (LiteralString) attribute
						.createDefaultValue(null, null,
							UMLPackage.Literals.LITERAL_STRING);
					literal.setValue((String) defaultValue);
				}
			}
/*
			out("Attribute '%s' : %s [%s..%s]%s created.", //
				attribute.getQualifiedName(), // attribute name
				type.getQualifiedName(), // type name
				lowerBound, // no special case for multiplicity lower bound
				(upperBound == LiteralUnlimitedNatural.UNLIMITED)
					? "*" // special case for unlimited bound
					: upperBound, // finite upper bound
				(defaultValue == null)
					? "" // no default value (use type's intrinsic default)
					: String.format(" = %s", defaultValue));
*/
			return attribute;
	}
		
		
		
		void test() {
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		/*
		resourceSet.getPackageRegistry().put(SysmlPackage.eNS_URI, SysmlPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(BlocksPackage.eNS_URI, BlocksPackage.eINSTANCE);
		*/
		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		/*
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(MyProfilePackage.eNS_URI, MyProfilePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(resourceSet.getResourceFactoryRegistry().DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		*/
		Map<URI,URI> uriMap = resourceSet.getURIConverter().getURIMap();



		
		UMLResourcesUtil.init(resourceSet);

		final URI uri2 = URI.createURI("jar:file:D:/.../plugins/org.eclipse.uml2.uml.resources_4.1.0.v20130506-1015.jar!/");
		
		URI uri = URI.createFileURI("D:/.../MyModel.uml");
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uri2.appendSegment("libraries").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri2.appendSegment("metamodels").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri2.appendSegment("profiles").appendSegment(""));
		uriMap.put(URI.createURI("pathmap://Papyrus.profile.uml"),URI.createURI("file:/D:/.../Papyrus.profile.uml/"));
		
		
		
		/*
		EPackage.Registry.INSTANCE.put("D:/.../MyModel.uml",UMLPackage.eINSTANCE);
		Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			System.out.println("Model: load complete");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		Model m = (Model) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.MODEL);
		if(m==null){
			System.err.println("Model: load failed!");
			System.exit(1);
		}
		
		EList<Element> list = m.allOwnedElements();
                //count number of Elements with at least one stereotype
		int stereo = 0;
		for(int i=0;i<list.size();i++){
			if(list.get(i).getAppliedStereotypes().size() > 0){
				stereo++;
			}
		}*/
}
		/*
		 * 
		 */
 }
 
