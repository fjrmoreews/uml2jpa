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
public class QRT_PCR extends Pcr {
 //declarations
	    /******************
	     *0 !!!info rtKitName 
	  
	   *2 public String rtKitName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration rtKitName
	   
	     */ 
	   
	      
	      @Info(description="NomKitRT")
	      public String rtKitName;
  
	    /******************
	     *0 !!!info technologyType 
	  
	   *2 public String technologyType;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration technologyType
	   
	     */ 
	   
	      
	      
	      public String technologyType;
  
	    /******************
	     *0 !!!info taqManProbeSequence 
	  
	   *2 public String taqManProbeSequence;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration taqManProbeSequence
	   
	     */ 
	   
	      
	      @Info(description="SequenceSondeTaqMan")
	      public String taqManProbeSequence;
  
	    /******************
	     *0 !!!info dye 
	   *1 @<Enter constraint text here> KISS
	  
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
	       /*	   @<Enter constraint text here> */ 
	      
	      
	      public String dye;
  
	    /******************
	     *0 !!!info plateNumber 
	  
	   *2 public String plateNumber;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration plateNumber
	   
	     */ 
	   
	      
	      @Info(description="NumeroPlaque")
	      public String plateNumber;
  
	    /******************
	     *0 !!!info positionInPlateOrRawNumber 
	  
	   *2 public String positionInPlateOrRawNumber;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration positionInPlateOrRawNumber
	   
	     */ 
	   
	      
	      @Info(description="PositionDansLaPlaqueOuNumeroLigne")
	      public String positionInPlateOrRawNumber;
  
	    /******************
	     *0 !!!info columnNumber 
	  
	   *2 public Integer columnNumber;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration columnNumber
	   
	     */ 
	   
	      
	      @Info(description="NumeroDeColonne")
	      public Integer columnNumber;
  
	    /******************
	     *0 !!!info sampleID 
	   *1 @Ordered(index=2) KISS
	  
	   *2 public String sampleID;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration sampleID
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @Ordered(index=2) */ 
	      @Ordered(index=2)
	      @Info(description="Desc:IdentifiantEchantillon")
	      public String sampleID;
  
	    /******************
	     *0 !!!info resultCt 
	  
	   *2 public String resultCt;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration resultCt
	   
	     */ 
	   
	      
	      
	      public String resultCt;
  
	    /******************
	     *0 !!!info actualAmpliconTm 
	   *1 @has unit:C KISS
	  
	   *2 public Integer actualAmpliconTm;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration actualAmpliconTm
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit:C */ 
	      @CustomUnit(value="c" )
	      @Info(description="TmReelAmplicon")
	      public Integer actualAmpliconTm;
  
//getter
 
	    /**
	     * Gets the value of rtKitName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@c35172e (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getRtKitName() {
		return this.rtKitName;
	}
      
 
	    /**
	     * Gets the value of technologyType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3cc41abc (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTechnologyType() {
		return this.technologyType;
	}
      
 
	    /**
	     * Gets the value of taqManProbeSequence
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3668d4 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTaqManProbeSequence() {
		return this.taqManProbeSequence;
	}
      
 
	    /**
	     * Gets the value of dye
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7f6f61c8 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getDye() {
		return this.dye;
	}
      
 
	    /**
	     * Gets the value of plateNumber
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4097cac (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getPlateNumber() {
		return this.plateNumber;
	}
      
 
	    /**
	     * Gets the value of positionInPlateOrRawNumber
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7c1e2a2d (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getPositionInPlateOrRawNumber() {
		return this.positionInPlateOrRawNumber;
	}
      
 
	    /**
	     * Gets the value of columnNumber
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2101b44a (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getColumnNumber() {
		return this.columnNumber;
	}
      
 
	    /**
	     * Gets the value of sampleID
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@c055c54 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSampleID() {
		return this.sampleID;
	}
      
 
	    /**
	     * Gets the value of resultCt
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@35e5d0e5 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getResultCt() {
		return this.resultCt;
	}
      
 
	    /**
	     * Gets the value of actualAmpliconTm
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7e276594 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getActualAmpliconTm() {
		return this.actualAmpliconTm;
	}
      
//setter
   
	    /**
	     * Sets the value of rtKitName
	     */
	public void setRtKitName(String rtKitName) {
		this.rtKitName = rtKitName;
	}
      
   
	    /**
	     * Sets the value of technologyType
	     */
	public void setTechnologyType(String technologyType) {
		this.technologyType = technologyType;
	}
      
   
	    /**
	     * Sets the value of taqManProbeSequence
	     */
	public void setTaqManProbeSequence(String taqManProbeSequence) {
		this.taqManProbeSequence = taqManProbeSequence;
	}
      
   
	    /**
	     * Sets the value of dye
	     */
	public void setDye(String dye) {
		this.dye = dye;
	}
      
   
	    /**
	     * Sets the value of plateNumber
	     */
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
      
   
	    /**
	     * Sets the value of positionInPlateOrRawNumber
	     */
	public void setPositionInPlateOrRawNumber(String positionInPlateOrRawNumber) {
		this.positionInPlateOrRawNumber = positionInPlateOrRawNumber;
	}
      
   
	    /**
	     * Sets the value of columnNumber
	     */
	public void setColumnNumber(Integer columnNumber) {
		this.columnNumber = columnNumber;
	}
      
   
	    /**
	     * Sets the value of sampleID
	     */
	public void setSampleID(String sampleID) {
		this.sampleID = sampleID;
	}
      
   
	    /**
	     * Sets the value of resultCt
	     */
	public void setResultCt(String resultCt) {
		this.resultCt = resultCt;
	}
      
   
	    /**
	     * Sets the value of actualAmpliconTm
	     */
	public void setActualAmpliconTm(Integer actualAmpliconTm) {
		this.actualAmpliconTm = actualAmpliconTm;
	}
      
}

