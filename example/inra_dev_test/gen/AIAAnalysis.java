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
public class AIAAnalysis extends FluorescenceAnalysis {
 //declarations
	    /******************
	     *0 !!!info CalibPrecGammeBlanc 
	  
	   *2 private String CalibPrecGammeBlanc;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration CalibPrecGammeBlanc
	     */ 
	private String calibprecgammeblanc;
  
	    /******************
	     *0 !!!info SampleVol 
	  
	   *2 private EFloat SampleVol;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration SampleVol
	     */ 
	private Float samplevol;
  
	    /******************
	     *0 !!!info SampleDilution 
	  
	   *2 private EFloat SampleDilution;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration SampleDilution
	     */ 
	private Float sampledilution;
  
//getter
 
	    /**
	     * Gets the value of CalibPrecGammeBlanc
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@60b71e8f (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getCalibprecgammeblanc() {
		return this.calibprecgammeblanc;
	}
      
 
	    /**
	     * Gets the value of SampleVol
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@464649c (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getSamplevol() {
		return this.samplevol;
	}
      
 
	    /**
	     * Gets the value of SampleDilution
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5f59185e (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getSampledilution() {
		return this.sampledilution;
	}
      
//setter
   
	    /**
	     * Sets the value of CalibPrecGammeBlanc
	     */
	public void setCalibprecgammeblanc(String calibprecgammeblanc) {
		this.calibprecgammeblanc = calibprecgammeblanc;
	}
      
   
	    /**
	     * Sets the value of SampleVol
	     */
	public void setSamplevol(Float samplevol) {
		this.samplevol = samplevol;
	}
      
   
	    /**
	     * Sets the value of SampleDilution
	     */
	public void setSampledilution(Float sampledilution) {
		this.sampledilution = sampledilution;
	}
      
}

