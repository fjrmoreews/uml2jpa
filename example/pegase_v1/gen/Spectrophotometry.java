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
public class Spectrophotometry extends GeneralAnalysis {
 //declarations
	    /******************
	     *0 !!!info sampledDilution 
	  
	   *2 public Integer sampledDilution;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration sampledDilution
	     */ 
	   
	      
	      
	      public Integer sampleddilution;
  
	    /******************
	     *0 !!!info samplePortion 
	   *1 @has unit: mL or mg KISS
	  
	   *2 public EFloat samplePortion;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration samplePortion
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: mL or mg */ 
	      @CustomUnit(value="mlormg" )
	      
	      public Float sampleportion;
  
	    /******************
	     *0 !!!info wavelength 
	   *1 @has unit: nm KISS
	  
	   *2 public Integer wavelength;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration wavelength
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: nm */ 
	      @CustomUnit(value="nm" )
	      
	      public Integer wavelength;
  
	    /******************
	     *0 !!!info linearityRange 
	  
	   *2 public String linearityRange;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration linearityRange
	     */ 
	   
	      
	      
	      public String linearityrange;
  
	    /******************
	     *0 !!!info resultOpticalDensity 
	  
	   *2 public Integer resultOpticalDensity;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration resultOpticalDensity
	     */ 
	   
	      
	      
	      public Integer resultopticaldensity;
  
//getter
 
	    /**
	     * Gets the value of sampledDilution
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@42f8285e (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getSampleddilution() {
		return this.sampleddilution;
	}
      
 
	    /**
	     * Gets the value of samplePortion
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@68ead359 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getSampleportion() {
		return this.sampleportion;
	}
      
 
	    /**
	     * Gets the value of wavelength
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@a43ce46 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getWavelength() {
		return this.wavelength;
	}
      
 
	    /**
	     * Gets the value of linearityRange
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@424ebba3 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getLinearityrange() {
		return this.linearityrange;
	}
      
 
	    /**
	     * Gets the value of resultOpticalDensity
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2320fa6f (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getResultopticaldensity() {
		return this.resultopticaldensity;
	}
      
//setter
   
	    /**
	     * Sets the value of sampledDilution
	     */
	public void setSampleddilution(Integer sampleddilution) {
		this.sampleddilution = sampleddilution;
	}
      
   
	    /**
	     * Sets the value of samplePortion
	     */
	public void setSampleportion(Float sampleportion) {
		this.sampleportion = sampleportion;
	}
      
   
	    /**
	     * Sets the value of wavelength
	     */
	public void setWavelength(Integer wavelength) {
		this.wavelength = wavelength;
	}
      
   
	    /**
	     * Sets the value of linearityRange
	     */
	public void setLinearityrange(String linearityrange) {
		this.linearityrange = linearityrange;
	}
      
   
	    /**
	     * Sets the value of resultOpticalDensity
	     */
	public void setResultopticaldensity(Integer resultopticaldensity) {
		this.resultopticaldensity = resultopticaldensity;
	}
      
}

