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
public class Histochemistry  {
 //declarations
	    /******************
	     *0 !!!info dye 
	  
	   *2 public String dye;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration dye
	     */ 
	   
	      
	      
	      public String dye;
  
	    /******************
	     *0 !!!info dyeReference 
	  
	   *2 public String dyeReference;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration dyeReference
	     */ 
	   
	      
	      
	      public String dyereference;
  
	    /******************
	     *0 !!!info resultTotalArea 
	   *1 @has unit: µm² KISS
	  
	   *2 public EFloat resultTotalArea;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration resultTotalArea
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µm² */ 
	      @CustomUnit(value="µm²" )
	      
	      public Float resulttotalarea;
  
	    /******************
	     *0 !!!info secretoryCellArea 
	   *1 @has unit: µm² KISS
	  
	   *2 public EFloat secretoryCellArea;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secretoryCellArea
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µm² */ 
	      @CustomUnit(value="µm²" )
	      
	      public Float secretorycellarea;
  
	    /******************
	     *0 !!!info adiposeCellArea 
	   *1 @has unit: µm² KISS
	  
	   *2 public EFloat adiposeCellArea;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration adiposeCellArea
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µm² */ 
	      @CustomUnit(value="µm²" )
	      
	      public Float adiposecellarea;
  
	    /******************
	     *0 !!!info channelArea 
	   *1 @has unit: µm² KISS
	  
	   *2 public EFloat channelArea;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration channelArea
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µm² */ 
	      @CustomUnit(value="µm²" )
	      
	      public Float channelarea;
  
//getter
 
	    /**
	     * Gets the value of dye
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6fe1b4fb (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getDye() {
		return this.dye;
	}
      
 
	    /**
	     * Gets the value of dyeReference
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1c32386d (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getDyereference() {
		return this.dyereference;
	}
      
 
	    /**
	     * Gets the value of resultTotalArea
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5023bb8b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResulttotalarea() {
		return this.resulttotalarea;
	}
      
 
	    /**
	     * Gets the value of secretoryCellArea
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1e0f9063 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getSecretorycellarea() {
		return this.secretorycellarea;
	}
      
 
	    /**
	     * Gets the value of adiposeCellArea
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3e30646a (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAdiposecellarea() {
		return this.adiposecellarea;
	}
      
 
	    /**
	     * Gets the value of channelArea
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@37c7595 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getChannelarea() {
		return this.channelarea;
	}
      
//setter
   
	    /**
	     * Sets the value of dye
	     */
	public void setDye(String dye) {
		this.dye = dye;
	}
      
   
	    /**
	     * Sets the value of dyeReference
	     */
	public void setDyereference(String dyereference) {
		this.dyereference = dyereference;
	}
      
   
	    /**
	     * Sets the value of resultTotalArea
	     */
	public void setResulttotalarea(Float resulttotalarea) {
		this.resulttotalarea = resulttotalarea;
	}
      
   
	    /**
	     * Sets the value of secretoryCellArea
	     */
	public void setSecretorycellarea(Float secretorycellarea) {
		this.secretorycellarea = secretorycellarea;
	}
      
   
	    /**
	     * Sets the value of adiposeCellArea
	     */
	public void setAdiposecellarea(Float adiposecellarea) {
		this.adiposecellarea = adiposecellarea;
	}
      
   
	    /**
	     * Sets the value of channelArea
	     */
	public void setChannelarea(Float channelarea) {
		this.channelarea = channelarea;
	}
      
}

