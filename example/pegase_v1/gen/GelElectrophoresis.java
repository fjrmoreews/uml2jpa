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
public class GelElectrophoresis extends Electrophoresis {
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
	   
	      
	      
	      public String electrophoresisCondition;
  
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
	   
	      
	      
	      public String gelType;
  
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
	   
	      
	      
	      public String ladderName;
  
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
	      
	      public Integer sampleLoadingAmount;
  
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
	   
	      
	      
	      public String sampleType;
  
//getter
 
	    /**
	     * Gets the value of buffer
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4879dfad (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
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
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@28ec166e (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getElectrophoresisCondition() {
		return this.electrophoresisCondition;
	}
      
 
	    /**
	     * Gets the value of gelType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2da59753 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getGelType() {
		return this.gelType;
	}
      
 
	    /**
	     * Gets the value of ladderName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4df5bcb4 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getLadderName() {
		return this.ladderName;
	}
      
 
	    /**
	     * Gets the value of sampleLoadingAmount
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2826f61 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getSampleLoadingAmount() {
		return this.sampleLoadingAmount;
	}
      
 
	    /**
	     * Gets the value of sampleType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4d9ac0b4 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSampleType() {
		return this.sampleType;
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
	public void setElectrophoresisCondition(String electrophoresisCondition) {
		this.electrophoresisCondition = electrophoresisCondition;
	}
      
   
	    /**
	     * Sets the value of gelType
	     */
	public void setGelType(String gelType) {
		this.gelType = gelType;
	}
      
   
	    /**
	     * Sets the value of ladderName
	     */
	public void setLadderName(String ladderName) {
		this.ladderName = ladderName;
	}
      
   
	    /**
	     * Sets the value of sampleLoadingAmount
	     */
	public void setSampleLoadingAmount(Integer sampleLoadingAmount) {
		this.sampleLoadingAmount = sampleLoadingAmount;
	}
      
   
	    /**
	     * Sets the value of sampleType
	     */
	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}
      
}

