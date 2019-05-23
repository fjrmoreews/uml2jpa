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
public class ClassicPCR extends Pcr {
 //declarations
	    /******************
	     *0 !!!info actualAmpliconSize 
	   *1 @has unit: bp KISS
	  
	   *2 public Integer actualAmpliconSize;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration actualAmpliconSize
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: bp */ 
	      @CustomUnit(value="bp" )
	      @Info(description=" TailleReelAmplicon")
	      public Integer actualAmpliconSize;
  
//getter
 
	    /**
	     * Gets the value of actualAmpliconSize
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@66ac5762 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getActualAmpliconSize() {
		return this.actualAmpliconSize;
	}
      
//setter
   
	    /**
	     * Sets the value of actualAmpliconSize
	     */
	public void setActualAmpliconSize(Integer actualAmpliconSize) {
		this.actualAmpliconSize = actualAmpliconSize;
	}
      
}

