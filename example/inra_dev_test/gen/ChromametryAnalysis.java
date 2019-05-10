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
public class ChromametryAnalysis extends GeneralAnalysis {
 //declarations
	    /******************
	     *0 !!!info MeasuringFieldNumber 
	  
	   *2 private Integer MeasuringFieldNumber;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration MeasuringFieldNumber
	     */ 
	private Integer measuringfieldnumber;
  
//getter
 
	    /**
	     * Gets the value of MeasuringFieldNumber
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@41fe9859 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getMeasuringfieldnumber() {
		return this.measuringfieldnumber;
	}
      
//setter
   
	    /**
	     * Sets the value of MeasuringFieldNumber
	     */
	public void setMeasuringfieldnumber(Integer measuringfieldnumber) {
		this.measuringfieldnumber = measuringfieldnumber;
	}
      
}

