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
public class CellMicroscopy  {
 //declarations
	    /******************
	     *0 !!!info dilutionFactor 
	  
	   *2 public String dilutionFactor;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration dilutionFactor
	     */ 
	public String dilutionfactor;
  
	    /******************
	     *0 !!!info resultLivingCellCount 
	  
	   *2 public Integer resultLivingCellCount;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration resultLivingCellCount
	     */ 
	public Integer resultlivingcellcount;
  
//getter
 
	    /**
	     * Gets the value of dilutionFactor
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4b6166aa (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getDilutionfactor() {
		return this.dilutionfactor;
	}
      
 
	    /**
	     * Gets the value of resultLivingCellCount
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4fd4cae3 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getResultlivingcellcount() {
		return this.resultlivingcellcount;
	}
      
//setter
   
	    /**
	     * Sets the value of dilutionFactor
	     */
	public void setDilutionfactor(String dilutionfactor) {
		this.dilutionfactor = dilutionfactor;
	}
      
   
	    /**
	     * Sets the value of resultLivingCellCount
	     */
	public void setResultlivingcellcount(Integer resultlivingcellcount) {
		this.resultlivingcellcount = resultlivingcellcount;
	}
      
}

