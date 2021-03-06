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
import uml2rdf.utils.*;
 
	
@Namespace("http://inra/pegase#")
public class NorthernBlot  {
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
	public String transfertype;
  
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
	public String transfercondition;
  
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
	     *0 !!!info probeName 
	  
	   *2 public String probeName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration probeName
	     */ 
	public String probename;
  
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
	public String labeltype;
  
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
	public String imageacquisitionparameters;
  
	    /******************
	     *0 !!!info resultMolecularWeight 
	   *1 @has unit: kb KISS
	  
	   *2 public EFloat resultMolecularWeight;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration resultMolecularWeight
	     */ 
	@has unit: kb
	public Float resultmolecularweight;
  
	    /******************
	     *0 !!!info resultQuantity 
	   *1 @has unit : µg KISS
	  
	   *2 public EFloat resultQuantity;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration resultQuantity
	     */ 
	@has unit : µg
	public Float resultquantity;
  
//getter
 
	    /**
	     * Gets the value of transferType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7d61eccf (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTransfertype() {
		return this.transfertype;
	}
      
 
	    /**
	     * Gets the value of transferCondition
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@52350abb (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTransfercondition() {
		return this.transfercondition;
	}
      
 
	    /**
	     * Gets the value of buffer
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1a6f2363 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getBuffer() {
		return this.buffer;
	}
      
 
	    /**
	     * Gets the value of membrane
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5ebd56e9 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getMembrane() {
		return this.membrane;
	}
      
 
	    /**
	     * Gets the value of probeName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@641856 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getProbename() {
		return this.probename;
	}
      
 
	    /**
	     * Gets the value of labelType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2f66e802 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getLabeltype() {
		return this.labeltype;
	}
      
 
	    /**
	     * Gets the value of imageAcquisitionParameters
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@76318a7d (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getImageacquisitionparameters() {
		return this.imageacquisitionparameters;
	}
      
 
	    /**
	     * Gets the value of resultMolecularWeight
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3277e499 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResultmolecularweight() {
		return this.resultmolecularweight;
	}
      
 
	    /**
	     * Gets the value of resultQuantity
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@22c01ab0 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResultquantity() {
		return this.resultquantity;
	}
      
//setter
   
	    /**
	     * Sets the value of transferType
	     */
	public void setTransfertype(String transfertype) {
		this.transfertype = transfertype;
	}
      
   
	    /**
	     * Sets the value of transferCondition
	     */
	public void setTransfercondition(String transfercondition) {
		this.transfercondition = transfercondition;
	}
      
   
	    /**
	     * Sets the value of buffer
	     */
	public void setBuffer(String buffer) {
		this.buffer = buffer;
	}
      
   
	    /**
	     * Sets the value of membrane
	     */
	public void setMembrane(String membrane) {
		this.membrane = membrane;
	}
      
   
	    /**
	     * Sets the value of probeName
	     */
	public void setProbename(String probename) {
		this.probename = probename;
	}
      
   
	    /**
	     * Sets the value of labelType
	     */
	public void setLabeltype(String labeltype) {
		this.labeltype = labeltype;
	}
      
   
	    /**
	     * Sets the value of imageAcquisitionParameters
	     */
	public void setImageacquisitionparameters(String imageacquisitionparameters) {
		this.imageacquisitionparameters = imageacquisitionparameters;
	}
      
   
	    /**
	     * Sets the value of resultMolecularWeight
	     */
	public void setResultmolecularweight(Float resultmolecularweight) {
		this.resultmolecularweight = resultmolecularweight;
	}
      
   
	    /**
	     * Sets the value of resultQuantity
	     */
	public void setResultquantity(Float resultquantity) {
		this.resultquantity = resultquantity;
	}
      
}

