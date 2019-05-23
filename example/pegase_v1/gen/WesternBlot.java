package gen;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import thewebsemantic.Id;
import thewebsemantic.RdfProperty;
import thewebsemantic.Namespace;
import com.hp.hpl.jena.sparql.vocabulary.FOAF;
import thewebsemantic.binding.Jenabean;
import thewebsemantic.binding.RdfBean;
import javax.management.DescriptorKey;
import uml2rdf.utils.*;
  
	
@Namespace("http://inra/pegase#")
public class WesternBlot extends GelElectrophoresis {
 //declarations
	    /******************
	     *0 !!!info transferType 
	  
	   *2 public String transferType;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration transferType
	   
	     */ 
	   
	      
	      
	      public String transferType;
  
	    /******************
	     *0 !!!info membrane 
	  
	   *2 public String membrane;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration membrane
	   
	     */ 
	   
	      
	      
	      public String membrane;
  
	    /******************
	     *0 !!!info buffer 
	  
	   *2 public String buffer;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration buffer
	   
	     */ 
	   
	      
	      
	      public String buffer;
  
	    /******************
	     *0 !!!info transferCondition 
	  
	   *2 public String transferCondition;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration transferCondition
	   
	     */ 
	   
	      
	      
	      public String transferCondition;
  
	    /******************
	     *0 !!!info labelType 
	  
	   *2 public String labelType;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration labelType
	   
	     */ 
	   
	      
	      
	      public String labelType;
  
	    /******************
	     *0 !!!info imageAcquisitionParameters 
	  
	   *2 public String imageAcquisitionParameters;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration imageAcquisitionParameters
	   
	     */ 
	   
	      
	      
	      public String imageAcquisitionParameters;
  
	    /******************
	     *0 !!!info firstAntibodyName 
	  
	   *2 public String firstAntibodyName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration firstAntibodyName
	   
	     */ 
	   
	      
	      
	      public String firstAntibodyName;
  
	    /******************
	     *0 !!!info firstAntibodyReference 
	  
	   *2 public String firstAntibodyReference;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration firstAntibodyReference
	   
	     */ 
	   
	      
	      
	      public String firstAntibodyReference;
  
	    /******************
	     *0 !!!info firstAntibodyDilutionFactor 
	  
	   *2 public Integer firstAntibodyDilutionFactor;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration firstAntibodyDilutionFactor
	   
	     */ 
	   
	      
	      
	      public Integer firstAntibodyDilutionFactor;
  
	    /******************
	     *0 !!!info secondAntibodyName 
	  
	   *2 public String secondAntibodyName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondAntibodyName
	   
	     */ 
	   
	      
	      
	      public String secondAntibodyName;
  
	    /******************
	     *0 !!!info secondAntibodyReference 
	  
	   *2 public String secondAntibodyReference;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondAntibodyReference
	   
	     */ 
	   
	      
	      
	      public String secondAntibodyReference;
  
	    /******************
	     *0 !!!info secondAntibodyDilutionFactor 
	  
	   *2 public Integer secondAntibodyDilutionFactor;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondAntibodyDilutionFactor
	   
	     */ 
	   
	      
	      
	      public Integer secondAntibodyDilutionFactor;
  
//getter
 
	    /**
	     * Gets the value of transferType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5644dc81 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTransferType() {
		return this.transferType;
	}
      
 
	    /**
	     * Gets the value of membrane
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@278bb07e (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getMembrane() {
		return this.membrane;
	}
      
 
	    /**
	     * Gets the value of buffer
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3381b4fc (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getBuffer() {
		return this.buffer;
	}
      
 
	    /**
	     * Gets the value of transferCondition
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@11981797 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTransferCondition() {
		return this.transferCondition;
	}
      
 
	    /**
	     * Gets the value of labelType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@625abb97 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getLabelType() {
		return this.labelType;
	}
      
 
	    /**
	     * Gets the value of imageAcquisitionParameters
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@aeab9a1 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getImageAcquisitionParameters() {
		return this.imageAcquisitionParameters;
	}
      
 
	    /**
	     * Gets the value of firstAntibodyName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@774698ab (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getFirstAntibodyName() {
		return this.firstAntibodyName;
	}
      
 
	    /**
	     * Gets the value of firstAntibodyReference
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@a4ca3f6 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getFirstAntibodyReference() {
		return this.firstAntibodyReference;
	}
      
 
	    /**
	     * Gets the value of firstAntibodyDilutionFactor
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@31aa3ca5 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getFirstAntibodyDilutionFactor() {
		return this.firstAntibodyDilutionFactor;
	}
      
 
	    /**
	     * Gets the value of secondAntibodyName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2a2c13a8 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSecondAntibodyName() {
		return this.secondAntibodyName;
	}
      
 
	    /**
	     * Gets the value of secondAntibodyReference
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6b44435b (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSecondAntibodyReference() {
		return this.secondAntibodyReference;
	}
      
 
	    /**
	     * Gets the value of secondAntibodyDilutionFactor
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@66b7550d (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getSecondAntibodyDilutionFactor() {
		return this.secondAntibodyDilutionFactor;
	}
      
//setter
   
	    /**
	     * Sets the value of transferType
	     */
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
      
   
	    /**
	     * Sets the value of membrane
	     */
	public void setMembrane(String membrane) {
		this.membrane = membrane;
	}
      
   
	    /**
	     * Sets the value of buffer
	     */
	public void setBuffer(String buffer) {
		this.buffer = buffer;
	}
      
   
	    /**
	     * Sets the value of transferCondition
	     */
	public void setTransferCondition(String transferCondition) {
		this.transferCondition = transferCondition;
	}
      
   
	    /**
	     * Sets the value of labelType
	     */
	public void setLabelType(String labelType) {
		this.labelType = labelType;
	}
      
   
	    /**
	     * Sets the value of imageAcquisitionParameters
	     */
	public void setImageAcquisitionParameters(String imageAcquisitionParameters) {
		this.imageAcquisitionParameters = imageAcquisitionParameters;
	}
      
   
	    /**
	     * Sets the value of firstAntibodyName
	     */
	public void setFirstAntibodyName(String firstAntibodyName) {
		this.firstAntibodyName = firstAntibodyName;
	}
      
   
	    /**
	     * Sets the value of firstAntibodyReference
	     */
	public void setFirstAntibodyReference(String firstAntibodyReference) {
		this.firstAntibodyReference = firstAntibodyReference;
	}
      
   
	    /**
	     * Sets the value of firstAntibodyDilutionFactor
	     */
	public void setFirstAntibodyDilutionFactor(Integer firstAntibodyDilutionFactor) {
		this.firstAntibodyDilutionFactor = firstAntibodyDilutionFactor;
	}
      
   
	    /**
	     * Sets the value of secondAntibodyName
	     */
	public void setSecondAntibodyName(String secondAntibodyName) {
		this.secondAntibodyName = secondAntibodyName;
	}
      
   
	    /**
	     * Sets the value of secondAntibodyReference
	     */
	public void setSecondAntibodyReference(String secondAntibodyReference) {
		this.secondAntibodyReference = secondAntibodyReference;
	}
      
   
	    /**
	     * Sets the value of secondAntibodyDilutionFactor
	     */
	public void setSecondAntibodyDilutionFactor(Integer secondAntibodyDilutionFactor) {
		this.secondAntibodyDilutionFactor = secondAntibodyDilutionFactor;
	}
      
}

