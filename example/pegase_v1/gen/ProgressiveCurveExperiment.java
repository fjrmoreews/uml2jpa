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
public class ProgressiveCurveExperiment  {
 //declarations
	    /******************
	     *0 !!!info measuredEnzyme 
	  
	   *2 public String measuredEnzyme;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration measuredEnzyme
	     */ 
	   
	      
	      
	      public String measuredenzyme;
  
	    /******************
	     *0 !!!info unit 
	   *1 @<Enter constraint text here> KISS
	   *1 @has unit: mmol/L or mg/L or µmol/L or g/L KISS
	  
	   *2 public String unit;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration unit
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @<Enter constraint text here> */ 
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: mmol/L or mg/L or µmol/L or g/L */ 
	      @CustomUnit(value="mmol/lormg/lorµmol/lorg/l" )
	      
	      public String unit;
  
//getter
 
	    /**
	     * Gets the value of measuredEnzyme
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3a6f2de3 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getMeasuredenzyme() {
		return this.measuredenzyme;
	}
      
 
	    /**
	     * Gets the value of unit
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4b2a01d4 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getUnit() {
		return this.unit;
	}
      
//setter
   
	    /**
	     * Sets the value of measuredEnzyme
	     */
	public void setMeasuredenzyme(String measuredenzyme) {
		this.measuredenzyme = measuredenzyme;
	}
      
   
	    /**
	     * Sets the value of unit
	     */
	public void setUnit(String unit) {
		this.unit = unit;
	}
      
}

