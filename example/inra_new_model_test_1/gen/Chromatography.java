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
public class Chromatography extends Hplc {
 //declarations
	    /******************
	     *0 !!!info samplePortion 
	   *1 @has unit: µL or mg KISS
	  
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
	@has unit: µL or mg
	public Float sampleportion;
  
	    /******************
	     *0 !!!info extractionType 
	  
	   *2 public String extractionType;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration extractionType
	     */ 
	public String extractiontype;
  
//getter
 
	    /**
	     * Gets the value of samplePortion
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@cdc3aae (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getSampleportion() {
		return this.sampleportion;
	}
      
 
	    /**
	     * Gets the value of extractionType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5dcbb60 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getExtractiontype() {
		return this.extractiontype;
	}
      
//setter
   
	    /**
	     * Sets the value of samplePortion
	     */
	public void setSampleportion(Float sampleportion) {
		this.sampleportion = sampleportion;
	}
      
   
	    /**
	     * Sets the value of extractionType
	     */
	public void setExtractiontype(String extractiontype) {
		this.extractiontype = extractiontype;
	}
      
}

