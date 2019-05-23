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
public class TwoDGelElectrophoresis extends GelElectrophoresis {
 //declarations
	    /******************
	     *0 !!!info stripIdentification 
	   *1 @min=1 KISS
	  
	   *2 public Integer stripIdentification;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration stripIdentification
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @min=1 */ 
	      @Size(min = 1 )
	      
	      public Integer stripIdentification;
  
	    /******************
	     *0 !!!info scanIdentification 
	  
	   *2 public String scanIdentification;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration scanIdentification
	   
	     */ 
	   
	      
	      
	      public String scanIdentification;
  
	    /******************
	     *0 !!!info gelIdentification 
	  
	   *2 public String gelIdentification;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration gelIdentification
	   
	     */ 
	   
	      
	      
	      public String gelIdentification;
  
	    /******************
	     *0 !!!info proteinExtractionProcedure 
	  
	   *2 public String proteinExtractionProcedure;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration proteinExtractionProcedure
	   
	     */ 
	   
	      
	      
	      public String proteinExtractionProcedure;
  
	    /******************
	     *0 !!!info imageResolution 
	  
	   *2 public String imageResolution;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration imageResolution
	   
	     */ 
	   
	      
	      
	      public String imageResolution;
  
	    /******************
	     *0 !!!info result 
	  
	   *2 public EFloat result;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result
	   
	     */ 
	   
	      
	      
	      public Float result;
  
	    /******************
	     *0 !!!info staining 
	  
	   *2 public String staining;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration staining
	   
	     */ 
	   
	      
	      
	      public String staining;
  
//getter
 
	    /**
	     * Gets the value of stripIdentification
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@56aaaecd (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getStripIdentification() {
		return this.stripIdentification;
	}
      
 
	    /**
	     * Gets the value of scanIdentification
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@35390ee3 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getScanIdentification() {
		return this.scanIdentification;
	}
      
 
	    /**
	     * Gets the value of gelIdentification
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5ddea849 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getGelIdentification() {
		return this.gelIdentification;
	}
      
 
	    /**
	     * Gets the value of proteinExtractionProcedure
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@23d1e5d0 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getProteinExtractionProcedure() {
		return this.proteinExtractionProcedure;
	}
      
 
	    /**
	     * Gets the value of imageResolution
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@58fb7731 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getImageResolution() {
		return this.imageResolution;
	}
      
 
	    /**
	     * Gets the value of result
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@37ddb69a (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult() {
		return this.result;
	}
      
 
	    /**
	     * Gets the value of staining
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@dfddc9a (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getStaining() {
		return this.staining;
	}
      
//setter
   
	    /**
	     * Sets the value of stripIdentification
	     */
	public void setStripIdentification(Integer stripIdentification) {
		this.stripIdentification = stripIdentification;
	}
      
   
	    /**
	     * Sets the value of scanIdentification
	     */
	public void setScanIdentification(String scanIdentification) {
		this.scanIdentification = scanIdentification;
	}
      
   
	    /**
	     * Sets the value of gelIdentification
	     */
	public void setGelIdentification(String gelIdentification) {
		this.gelIdentification = gelIdentification;
	}
      
   
	    /**
	     * Sets the value of proteinExtractionProcedure
	     */
	public void setProteinExtractionProcedure(String proteinExtractionProcedure) {
		this.proteinExtractionProcedure = proteinExtractionProcedure;
	}
      
   
	    /**
	     * Sets the value of imageResolution
	     */
	public void setImageResolution(String imageResolution) {
		this.imageResolution = imageResolution;
	}
      
   
	    /**
	     * Sets the value of result
	     */
	public void setResult(Float result) {
		this.result = result;
	}
      
   
	    /**
	     * Sets the value of staining
	     */
	public void setStaining(String staining) {
		this.staining = staining;
	}
      
}

