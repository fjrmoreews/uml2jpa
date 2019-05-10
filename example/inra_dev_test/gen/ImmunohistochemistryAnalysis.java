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
public class ImmunohistochemistryAnalysis extends HistologyAnalysis {
 //declarations
	    /******************
	     *0 !!!info AntibodyRefDilu 
	  
	   *2 private String AntibodyRefDilu;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration AntibodyRefDilu
	     */ 
	private String antibodyrefdilu;
  
//getter
 
	    /**
	     * Gets the value of AntibodyRefDilu
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@549621f3 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getAntibodyrefdilu() {
		return this.antibodyrefdilu;
	}
      
//setter
   
	    /**
	     * Sets the value of AntibodyRefDilu
	     */
	public void setAntibodyrefdilu(String antibodyrefdilu) {
		this.antibodyrefdilu = antibodyrefdilu;
	}
      
}

