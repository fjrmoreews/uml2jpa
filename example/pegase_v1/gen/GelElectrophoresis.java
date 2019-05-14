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
 //120 ==TEST_HERE== TEST_A_TEST
	
@Namespace("http://inra/pegase#")
public class GelElectrophoresis extends TwoDGelElectrophoresis {
 //declarations
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
	     *0 !!!info electrophoresisCondition 
	  
	   *2 public String electrophoresisCondition;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration electrophoresisCondition
	     */ 
	   
	      
	      
	      public String electrophoresiscondition;
  
	    /******************
	     *0 !!!info gelType 
	  
	   *2 public String gelType;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration gelType
	     */ 
	   
	      
	      
	      public String geltype;
  
	    /******************
	     *0 !!!info ladderName 
	  
	   *2 public String ladderName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration ladderName
	     */ 
	   
	      
	      
	      public String laddername;
  
	    /******************
	     *0 !!!info sampleLoadingAmount 
	   *1 @has unit : µg KISS
	  
	   *2 public Integer sampleLoadingAmount;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration sampleLoadingAmount
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit : µg */ 
	      //@has unit : µg
	      
	      public Integer sampleloadingamount;
  
	    /******************
	     *0 !!!info sampleType 
	  
	   *2 public String sampleType;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration sampleType
	     */ 
	   
	      
	      
	      public String sampletype;
  
//getter
 
	    /**
	     * Gets the value of buffer
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@16c63f5 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getBuffer() {
		return this.buffer;
	}
      
 
	    /**
	     * Gets the value of electrophoresisCondition
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@b1712f3 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getElectrophoresiscondition() {
		return this.electrophoresiscondition;
	}
      
 
	    /**
	     * Gets the value of gelType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4879dfad (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getGeltype() {
		return this.geltype;
	}
      
 
	    /**
	     * Gets the value of ladderName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@74eb909f (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getLaddername() {
		return this.laddername;
	}
      
 
	    /**
	     * Gets the value of sampleLoadingAmount
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2da59753 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getSampleloadingamount() {
		return this.sampleloadingamount;
	}
      
 
	    /**
	     * Gets the value of sampleType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4df5bcb4 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSampletype() {
		return this.sampletype;
	}
      
//setter
   
	    /**
	     * Sets the value of buffer
	     */
	public void setBuffer(String buffer) {
		this.buffer = buffer;
	}
      
   
	    /**
	     * Sets the value of electrophoresisCondition
	     */
	public void setElectrophoresiscondition(String electrophoresiscondition) {
		this.electrophoresiscondition = electrophoresiscondition;
	}
      
   
	    /**
	     * Sets the value of gelType
	     */
	public void setGeltype(String geltype) {
		this.geltype = geltype;
	}
      
   
	    /**
	     * Sets the value of ladderName
	     */
	public void setLaddername(String laddername) {
		this.laddername = laddername;
	}
      
   
	    /**
	     * Sets the value of sampleLoadingAmount
	     */
	public void setSampleloadingamount(Integer sampleloadingamount) {
		this.sampleloadingamount = sampleloadingamount;
	}
      
   
	    /**
	     * Sets the value of sampleType
	     */
	public void setSampletype(String sampletype) {
		this.sampletype = sampletype;
	}
      
}

