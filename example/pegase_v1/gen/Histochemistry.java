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
public class Histochemistry extends Histology {
 //declarations
	    /******************
	     *0 !!!info dye 
	   *1 @Ordered (index=11) KISS
	  
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
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @Ordered (index=11) */ 
	      @Ordered (index=11)
	      @Info(description="Colorant")
	      public String dye;
  
	    /******************
	     *0 !!!info dyeReference 
	   *1 @Ordered (index=12) KISS
	  
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
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @Ordered (index=12) */ 
	      @Ordered (index=12)
	      @Info(description="ReferenceColorant")
	      public String dyeReference;
  
	    /******************
	     *0 !!!info totalAreaThreshold 
	  
	   *2 public Integer totalAreaThreshold;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration totalAreaThreshold
	   
	     */ 
	   
	      
	      @Info(description="SeuilSurfaceTotale")
	      public Integer totalAreaThreshold;
  
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
	      @Info(description="SurfaceTotale")
	      public Float resultTotalArea;
  
	    /******************
	     *0 !!!info secetoryCellTreshold 
	  
	   *2 public Integer secetoryCellTreshold;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secetoryCellTreshold
	   
	     */ 
	   
	      
	      @Info(description="SeuilCellulesSecretrices")
	      public Integer secetoryCellTreshold;
  
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
	      @Info(description="SurfaceCellulesSecretrices")
	      public Float secretoryCellArea;
  
	    /******************
	     *0 !!!info adiposeCellTreshold 
	   *1 @has unit: µm² KISS
	  
	   *2 public Integer adiposeCellTreshold;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration adiposeCellTreshold
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µm² */ 
	      @CustomUnit(value="µm²" )
	      @Info(description="SeuilCellulesAdipeuses")
	      public Integer adiposeCellTreshold;
  
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
	      @Info(description="SurfaceCellulesAdipeuses")
	      public Float adiposeCellArea;
  
	    /******************
	     *0 !!!info channelTreshold 
	   *1 @has unit: µm² KISS
	  
	   *2 public Integer channelTreshold;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration channelTreshold
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µm² */ 
	      @CustomUnit(value="µm²" )
	      @Info(description="SeuilCanaux")
	      public Integer channelTreshold;
  
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
	      @Info(description="SurfaceCanaux")
	      public Float channelArea;
  
//getter
 
	    /**
	     * Gets the value of dye
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@79351f41 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
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
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5023bb8b (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getDyeReference() {
		return this.dyeReference;
	}
      
 
	    /**
	     * Gets the value of totalAreaThreshold
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1e0f9063 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getTotalAreaThreshold() {
		return this.totalAreaThreshold;
	}
      
 
	    /**
	     * Gets the value of resultTotalArea
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5cde6747 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResultTotalArea() {
		return this.resultTotalArea;
	}
      
 
	    /**
	     * Gets the value of secetoryCellTreshold
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3ed242a4 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getSecetoryCellTreshold() {
		return this.secetoryCellTreshold;
	}
      
 
	    /**
	     * Gets the value of secretoryCellArea
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2d96543c (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getSecretoryCellArea() {
		return this.secretoryCellArea;
	}
      
 
	    /**
	     * Gets the value of adiposeCellTreshold
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@cd1d761 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getAdiposeCellTreshold() {
		return this.adiposeCellTreshold;
	}
      
 
	    /**
	     * Gets the value of adiposeCellArea
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@69653e16 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAdiposeCellArea() {
		return this.adiposeCellArea;
	}
      
 
	    /**
	     * Gets the value of channelTreshold
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@49d3c823 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getChannelTreshold() {
		return this.channelTreshold;
	}
      
 
	    /**
	     * Gets the value of channelArea
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@37091312 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getChannelArea() {
		return this.channelArea;
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
	public void setDyeReference(String dyeReference) {
		this.dyeReference = dyeReference;
	}
      
   
	    /**
	     * Sets the value of totalAreaThreshold
	     */
	public void setTotalAreaThreshold(Integer totalAreaThreshold) {
		this.totalAreaThreshold = totalAreaThreshold;
	}
      
   
	    /**
	     * Sets the value of resultTotalArea
	     */
	public void setResultTotalArea(Float resultTotalArea) {
		this.resultTotalArea = resultTotalArea;
	}
      
   
	    /**
	     * Sets the value of secetoryCellTreshold
	     */
	public void setSecetoryCellTreshold(Integer secetoryCellTreshold) {
		this.secetoryCellTreshold = secetoryCellTreshold;
	}
      
   
	    /**
	     * Sets the value of secretoryCellArea
	     */
	public void setSecretoryCellArea(Float secretoryCellArea) {
		this.secretoryCellArea = secretoryCellArea;
	}
      
   
	    /**
	     * Sets the value of adiposeCellTreshold
	     */
	public void setAdiposeCellTreshold(Integer adiposeCellTreshold) {
		this.adiposeCellTreshold = adiposeCellTreshold;
	}
      
   
	    /**
	     * Sets the value of adiposeCellArea
	     */
	public void setAdiposeCellArea(Float adiposeCellArea) {
		this.adiposeCellArea = adiposeCellArea;
	}
      
   
	    /**
	     * Sets the value of channelTreshold
	     */
	public void setChannelTreshold(Integer channelTreshold) {
		this.channelTreshold = channelTreshold;
	}
      
   
	    /**
	     * Sets the value of channelArea
	     */
	public void setChannelArea(Float channelArea) {
		this.channelArea = channelArea;
	}
      
}

