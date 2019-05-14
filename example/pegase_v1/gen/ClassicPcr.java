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
public class ClassicPcr  {
 //declarations
	    /******************
	     *0 !!!info amplification 
	  
	   *2 public String amplification;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration amplification
	     */ 
	   
	      
	      
	      public String amplification;
  
	    /******************
	     *0 !!!info ampliconSize 
	   *1 @has unit: bp KISS
	  
	   *2 public Integer ampliconSize;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration ampliconSize
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: bp */ 
	      @CustomUnit(value="bp" )
	      
	      public Integer ampliconsize;
  
//getter
 
	    /**
	     * Gets the value of amplification
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6d1ef78d (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getAmplification() {
		return this.amplification;
	}
      
 
	    /**
	     * Gets the value of ampliconSize
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@77d67cf3 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getAmpliconsize() {
		return this.ampliconsize;
	}
      
//setter
   
	    /**
	     * Sets the value of amplification
	     */
	public void setAmplification(String amplification) {
		this.amplification = amplification;
	}
      
   
	    /**
	     * Sets the value of ampliconSize
	     */
	public void setAmpliconsize(Integer ampliconsize) {
		this.ampliconsize = ampliconsize;
	}
      
}

