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
public class EndpointAssay  {
 //declarations
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
	@<Enter constraint text here>
	@has unit: mmol/L or mg/L or µmol/L or g/L
	public String unit;
  
	    /******************
	     *0 !!!info measuredMetabolite 
	  
	   *2 public String measuredMetabolite;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration measuredMetabolite
	     */ 
	public String measuredmetabolite;
  
//getter
 
	    /**
	     * Gets the value of unit
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@62417a16 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getUnit() {
		return this.unit;
	}
      
 
	    /**
	     * Gets the value of measuredMetabolite
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@26be6ca7 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getMeasuredmetabolite() {
		return this.measuredmetabolite;
	}
      
//setter
   
	    /**
	     * Sets the value of unit
	     */
	public void setUnit(String unit) {
		this.unit = unit;
	}
      
   
	    /**
	     * Sets the value of measuredMetabolite
	     */
	public void setMeasuredmetabolite(String measuredmetabolite) {
		this.measuredmetabolite = measuredmetabolite;
	}
      
}

