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
public class Pcr extends ClassicPcr {
 //declarations
	    /******************
	     *0 !!!info targetSequenceName 
	  
	   *2 public String targetSequenceName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration targetSequenceName
	     */ 
	public String targetsequencename;
  
	    /******************
	     *0 !!!info forwardPrimerName 
	  
	   *2 public String forwardPrimerName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration forwardPrimerName
	     */ 
	public String forwardprimername;
  
	    /******************
	     *0 !!!info forwardPrimerSequence 
	  
	   *2 public String forwardPrimerSequence;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration forwardPrimerSequence
	     */ 
	public String forwardprimersequence;
  
	    /******************
	     *0 !!!info reversePrimerName 
	  
	   *2 public String reversePrimerName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration reversePrimerName
	     */ 
	public String reverseprimername;
  
	    /******************
	     *0 !!!info reversePrimerSequence 
	  
	   *2 public String reversePrimerSequence;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration reversePrimerSequence
	     */ 
	public String reverseprimersequence;
  
	    /******************
	     *0 !!!info pcrProgram 
	  
	   *2 public String pcrProgram;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration pcrProgram
	     */ 
	public String pcrprogram;
  
	    /******************
	     *0 !!!info sampleQuantity 
	  
	   *2 public String sampleQuantity;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration sampleQuantity
	     */ 
	public String samplequantity;
  
	    /******************
	     *0 !!!info ampliconSize 
	   *1 @has unit: bp KISS
	  
	   *2 public Integer ampliconSize;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration ampliconSize
	     */ 
	@has unit: bp
	public Integer ampliconsize;
  
//getter
 
	    /**
	     * Gets the value of targetSequenceName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4b4dd216 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTargetsequencename() {
		return this.targetsequencename;
	}
      
 
	    /**
	     * Gets the value of forwardPrimerName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5a62b2a4 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getForwardprimername() {
		return this.forwardprimername;
	}
      
 
	    /**
	     * Gets the value of forwardPrimerSequence
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@35293c05 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getForwardprimersequence() {
		return this.forwardprimersequence;
	}
      
 
	    /**
	     * Gets the value of reversePrimerName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2db2dd9d (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getReverseprimername() {
		return this.reverseprimername;
	}
      
 
	    /**
	     * Gets the value of reversePrimerSequence
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4d411036 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getReverseprimersequence() {
		return this.reverseprimersequence;
	}
      
 
	    /**
	     * Gets the value of pcrProgram
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@41beb473 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getPcrprogram() {
		return this.pcrprogram;
	}
      
 
	    /**
	     * Gets the value of sampleQuantity
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@13006998 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSamplequantity() {
		return this.samplequantity;
	}
      
 
	    /**
	     * Gets the value of ampliconSize
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@352c308 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getAmpliconsize() {
		return this.ampliconsize;
	}
      
//setter
   
	    /**
	     * Sets the value of targetSequenceName
	     */
	public void setTargetsequencename(String targetsequencename) {
		this.targetsequencename = targetsequencename;
	}
      
   
	    /**
	     * Sets the value of forwardPrimerName
	     */
	public void setForwardprimername(String forwardprimername) {
		this.forwardprimername = forwardprimername;
	}
      
   
	    /**
	     * Sets the value of forwardPrimerSequence
	     */
	public void setForwardprimersequence(String forwardprimersequence) {
		this.forwardprimersequence = forwardprimersequence;
	}
      
   
	    /**
	     * Sets the value of reversePrimerName
	     */
	public void setReverseprimername(String reverseprimername) {
		this.reverseprimername = reverseprimername;
	}
      
   
	    /**
	     * Sets the value of reversePrimerSequence
	     */
	public void setReverseprimersequence(String reverseprimersequence) {
		this.reverseprimersequence = reverseprimersequence;
	}
      
   
	    /**
	     * Sets the value of pcrProgram
	     */
	public void setPcrprogram(String pcrprogram) {
		this.pcrprogram = pcrprogram;
	}
      
   
	    /**
	     * Sets the value of sampleQuantity
	     */
	public void setSamplequantity(String samplequantity) {
		this.samplequantity = samplequantity;
	}
      
   
	    /**
	     * Sets the value of ampliconSize
	     */
	public void setAmpliconsize(Integer ampliconsize) {
		this.ampliconsize = ampliconsize;
	}
      
}

