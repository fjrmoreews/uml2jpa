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
public class Histology extends Imaging {
 //declarations
	    /******************
	     *0 !!!info embedding 
	   *1 @enum:Parafine,Frozen KISS
	  
	   *2 public String embedding;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration embedding
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @enum:Parafine,Frozen */ 
	      //@enum:Parafine,Frozen
	      @Info(description="Inclusion")
	      public String embedding;
  
	    /******************
	     *0 !!!info fixation 
	  
	   *2 public String fixation;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration fixation
	   
	     */ 
	   
	      
	      @Info(description="Fixation")
	      public String fixation;
  
	    /******************
	     *0 !!!info sliceSize 
	   *1 @has unit: µm KISS
	  
	   *2 public Integer sliceSize;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration sliceSize
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µm */ 
	      @CustomUnit(value="µm" )
	      @Info(description="EpaisseurCoupe")
	      public Integer sliceSize;
  
	    /******************
	     *0 !!!info magnification 
	  
	   *2 public EFloat magnification;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration magnification
	   
	     */ 
	   
	      
	      @Info(description="Grossissement")
	      public Float magnification;
  
	    /******************
	     *0 !!!info pictureResolution 
	   *1 @has unit: pixel/µm KISS
	  
	   *2 public Integer pictureResolution;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration pictureResolution
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: pixel/µm */ 
	      @CustomUnit(value="pixel/µm" )
	      @Info(description="ResolutionImage")
	      public Integer pictureResolution;
  
	    /******************
	     *0 !!!info numberMeasuringField 
	  
	   *2 public Integer numberMeasuringField;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration numberMeasuringField
	   
	     */ 
	   
	      
	      @Info(description="NumeroChampMesure")
	      public Integer numberMeasuringField;
  
	    /******************
	     *0 !!!info pictureNumber 
	  
	   *2 public Integer pictureNumber;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration pictureNumber
	   
	     */ 
	   
	      
	      @Info(description="MumeroImage")
	      public Integer pictureNumber;
  
	    /******************
	     *0 !!!info organelleIdentification 
	  
	   *2 public String organelleIdentification;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration organelleIdentification
	   
	     */ 
	   
	      
	      @Info(description="NomOrganite")
	      public String organelleIdentification;
  
//getter
 
	    /**
	     * Gets the value of embedding
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@584f54e6 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getEmbedding() {
		return this.embedding;
	}
      
 
	    /**
	     * Gets the value of fixation
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2dca0d64 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getFixation() {
		return this.fixation;
	}
      
 
	    /**
	     * Gets the value of sliceSize
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5ef6ae06 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getSliceSize() {
		return this.sliceSize;
	}
      
 
	    /**
	     * Gets the value of magnification
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1cdc4c27 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getMagnification() {
		return this.magnification;
	}
      
 
	    /**
	     * Gets the value of pictureResolution
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@604f2bd2 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getPictureResolution() {
		return this.pictureResolution;
	}
      
 
	    /**
	     * Gets the value of numberMeasuringField
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@628c4ac0 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getNumberMeasuringField() {
		return this.numberMeasuringField;
	}
      
 
	    /**
	     * Gets the value of pictureNumber
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@363042d7 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getPictureNumber() {
		return this.pictureNumber;
	}
      
 
	    /**
	     * Gets the value of organelleIdentification
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@56f0cc85 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getOrganelleIdentification() {
		return this.organelleIdentification;
	}
      
//setter
   
	    /**
	     * Sets the value of embedding
	     */
	public void setEmbedding(String embedding) {
		this.embedding = embedding;
	}
      
   
	    /**
	     * Sets the value of fixation
	     */
	public void setFixation(String fixation) {
		this.fixation = fixation;
	}
      
   
	    /**
	     * Sets the value of sliceSize
	     */
	public void setSliceSize(Integer sliceSize) {
		this.sliceSize = sliceSize;
	}
      
   
	    /**
	     * Sets the value of magnification
	     */
	public void setMagnification(Float magnification) {
		this.magnification = magnification;
	}
      
   
	    /**
	     * Sets the value of pictureResolution
	     */
	public void setPictureResolution(Integer pictureResolution) {
		this.pictureResolution = pictureResolution;
	}
      
   
	    /**
	     * Sets the value of numberMeasuringField
	     */
	public void setNumberMeasuringField(Integer numberMeasuringField) {
		this.numberMeasuringField = numberMeasuringField;
	}
      
   
	    /**
	     * Sets the value of pictureNumber
	     */
	public void setPictureNumber(Integer pictureNumber) {
		this.pictureNumber = pictureNumber;
	}
      
   
	    /**
	     * Sets the value of organelleIdentification
	     */
	public void setOrganelleIdentification(String organelleIdentification) {
		this.organelleIdentification = organelleIdentification;
	}
      
}

