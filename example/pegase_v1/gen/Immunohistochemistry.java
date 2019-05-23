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
public class Immunohistochemistry extends Histology {
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
	     *0 !!!info dyeExposureTime 
	  
	   *2 public Integer dyeExposureTime;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration dyeExposureTime
	   
	     */ 
	   
	      
	      @Info(description="TempsExpositionColorant")
	      public Integer dyeExposureTime;
  
	    /******************
	     *0 !!!info primaryAntibodyName 
	  
	   *2 public String primaryAntibodyName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration primaryAntibodyName
	   
	     */ 
	   
	      
	      @Info(description="AnticorpsPrimaire")
	      public String primaryAntibodyName;
  
	    /******************
	     *0 !!!info primaryAntibodyReference 
	  
	   *2 public String primaryAntibodyReference;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration primaryAntibodyReference
	   
	     */ 
	   
	      
	      @Info(description="ReferenceAnticorpsPrimaire")
	      public String primaryAntibodyReference;
  
	    /******************
	     *0 !!!info primaryAntibodyDilutionFactor 
	  
	   *2 public Integer primaryAntibodyDilutionFactor;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration primaryAntibodyDilutionFactor
	   
	     */ 
	   
	      
	      @Info(description="DilutionAnticorpsPrimaire")
	      public Integer primaryAntibodyDilutionFactor;
  
	    /******************
	     *0 !!!info secondaryAntibodyName 
	  
	   *2 public String secondaryAntibodyName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondaryAntibodyName
	   
	     */ 
	   
	      
	      @Info(description="AnticorpsSecondaire")
	      public String secondaryAntibodyName;
  
	    /******************
	     *0 !!!info secondaryAntibodyReference 
	  
	   *2 public String secondaryAntibodyReference;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondaryAntibodyReference
	   
	     */ 
	   
	      
	      @Info(description="ReferenceAnticorpsSecondaire")
	      public String secondaryAntibodyReference;
  
	    /******************
	     *0 !!!info secondaryAntibodyDilutionFactor 
	  
	   *2 public Integer secondaryAntibodyDilutionFactor;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondaryAntibodyDilutionFactor
	   
	     */ 
	   
	      
	      @Info(description="DilutionAnticorpsSecondaire")
	      public Integer secondaryAntibodyDilutionFactor;
  
	    /******************
	     *0 !!!info secondaryAntibodyExposureTime 
	  
	   *2 public String secondaryAntibodyExposureTime;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondaryAntibodyExposureTime
	   
	     */ 
	   
	      
	      
	      public String secondaryAntibodyExposureTime;
  
	    /******************
	     *0 !!!info totalNuclearCellTreshold 
	   *1 @has unit: µm² KISS
	  
	   *2 public Integer totalNuclearCellTreshold;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration totalNuclearCellTreshold
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µm² */ 
	      @CustomUnit(value="µm²" )
	      @Info(description="SeuilCellulesNuclees")
	      public Integer totalNuclearCellTreshold;
  
	    /******************
	     *0 !!!info resultTotalNuclearCellCount 
	  
	   *2 public Integer resultTotalNuclearCellCount;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration resultTotalNuclearCellCount
	   
	     */ 
	   
	      
	      
	      public Integer resultTotalNuclearCellCount;
  
	    /******************
	     *0 !!!info labelledCellTreshold 
	   *1 @has unit: µm² KISS
	  
	   *2 public Integer labelledCellTreshold;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration labelledCellTreshold
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µm² */ 
	      @CustomUnit(value="µm²" )
	      @Info(description="SeuilCellulesMarquees")
	      public Integer labelledCellTreshold;
  
	    /******************
	     *0 !!!info particleDiameterRange 
	  
	   *2 public String particleDiameterRange;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration particleDiameterRange
	   
	     */ 
	   
	      
	      
	      public String particleDiameterRange;
  
	    /******************
	     *0 !!!info labelledNuclearCellCount 
	  
	   *2 public Integer labelledNuclearCellCount;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration labelledNuclearCellCount
	   
	     */ 
	   
	      
	      
	      public Integer labelledNuclearCellCount;
  
//getter
 
	    /**
	     * Gets the value of dye
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@61f05988 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
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
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@41dd05a (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getDyeReference() {
		return this.dyeReference;
	}
      
 
	    /**
	     * Gets the value of dyeExposureTime
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7103cb56 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getDyeExposureTime() {
		return this.dyeExposureTime;
	}
      
 
	    /**
	     * Gets the value of primaryAntibodyName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6ebf0f36 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getPrimaryAntibodyName() {
		return this.primaryAntibodyName;
	}
      
 
	    /**
	     * Gets the value of primaryAntibodyReference
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@72c28d64 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getPrimaryAntibodyReference() {
		return this.primaryAntibodyReference;
	}
      
 
	    /**
	     * Gets the value of primaryAntibodyDilutionFactor
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@39a8312f (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getPrimaryAntibodyDilutionFactor() {
		return this.primaryAntibodyDilutionFactor;
	}
      
 
	    /**
	     * Gets the value of secondaryAntibodyName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@294e5088 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSecondaryAntibodyName() {
		return this.secondaryAntibodyName;
	}
      
 
	    /**
	     * Gets the value of secondaryAntibodyReference
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2002348 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSecondaryAntibodyReference() {
		return this.secondaryAntibodyReference;
	}
      
 
	    /**
	     * Gets the value of secondaryAntibodyDilutionFactor
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1d470d0 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getSecondaryAntibodyDilutionFactor() {
		return this.secondaryAntibodyDilutionFactor;
	}
      
 
	    /**
	     * Gets the value of secondaryAntibodyExposureTime
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@54c62d71 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSecondaryAntibodyExposureTime() {
		return this.secondaryAntibodyExposureTime;
	}
      
 
	    /**
	     * Gets the value of totalNuclearCellTreshold
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@48d5f34e (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getTotalNuclearCellTreshold() {
		return this.totalNuclearCellTreshold;
	}
      
 
	    /**
	     * Gets the value of resultTotalNuclearCellCount
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6ff65192 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getResultTotalNuclearCellCount() {
		return this.resultTotalNuclearCellCount;
	}
      
 
	    /**
	     * Gets the value of labelledCellTreshold
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@acdb094 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getLabelledCellTreshold() {
		return this.labelledCellTreshold;
	}
      
 
	    /**
	     * Gets the value of particleDiameterRange
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2b0f373b (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getParticleDiameterRange() {
		return this.particleDiameterRange;
	}
      
 
	    /**
	     * Gets the value of labelledNuclearCellCount
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4b45dcb8 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getLabelledNuclearCellCount() {
		return this.labelledNuclearCellCount;
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
	     * Sets the value of dyeExposureTime
	     */
	public void setDyeExposureTime(Integer dyeExposureTime) {
		this.dyeExposureTime = dyeExposureTime;
	}
      
   
	    /**
	     * Sets the value of primaryAntibodyName
	     */
	public void setPrimaryAntibodyName(String primaryAntibodyName) {
		this.primaryAntibodyName = primaryAntibodyName;
	}
      
   
	    /**
	     * Sets the value of primaryAntibodyReference
	     */
	public void setPrimaryAntibodyReference(String primaryAntibodyReference) {
		this.primaryAntibodyReference = primaryAntibodyReference;
	}
      
   
	    /**
	     * Sets the value of primaryAntibodyDilutionFactor
	     */
	public void setPrimaryAntibodyDilutionFactor(Integer primaryAntibodyDilutionFactor) {
		this.primaryAntibodyDilutionFactor = primaryAntibodyDilutionFactor;
	}
      
   
	    /**
	     * Sets the value of secondaryAntibodyName
	     */
	public void setSecondaryAntibodyName(String secondaryAntibodyName) {
		this.secondaryAntibodyName = secondaryAntibodyName;
	}
      
   
	    /**
	     * Sets the value of secondaryAntibodyReference
	     */
	public void setSecondaryAntibodyReference(String secondaryAntibodyReference) {
		this.secondaryAntibodyReference = secondaryAntibodyReference;
	}
      
   
	    /**
	     * Sets the value of secondaryAntibodyDilutionFactor
	     */
	public void setSecondaryAntibodyDilutionFactor(Integer secondaryAntibodyDilutionFactor) {
		this.secondaryAntibodyDilutionFactor = secondaryAntibodyDilutionFactor;
	}
      
   
	    /**
	     * Sets the value of secondaryAntibodyExposureTime
	     */
	public void setSecondaryAntibodyExposureTime(String secondaryAntibodyExposureTime) {
		this.secondaryAntibodyExposureTime = secondaryAntibodyExposureTime;
	}
      
   
	    /**
	     * Sets the value of totalNuclearCellTreshold
	     */
	public void setTotalNuclearCellTreshold(Integer totalNuclearCellTreshold) {
		this.totalNuclearCellTreshold = totalNuclearCellTreshold;
	}
      
   
	    /**
	     * Sets the value of resultTotalNuclearCellCount
	     */
	public void setResultTotalNuclearCellCount(Integer resultTotalNuclearCellCount) {
		this.resultTotalNuclearCellCount = resultTotalNuclearCellCount;
	}
      
   
	    /**
	     * Sets the value of labelledCellTreshold
	     */
	public void setLabelledCellTreshold(Integer labelledCellTreshold) {
		this.labelledCellTreshold = labelledCellTreshold;
	}
      
   
	    /**
	     * Sets the value of particleDiameterRange
	     */
	public void setParticleDiameterRange(String particleDiameterRange) {
		this.particleDiameterRange = particleDiameterRange;
	}
      
   
	    /**
	     * Sets the value of labelledNuclearCellCount
	     */
	public void setLabelledNuclearCellCount(Integer labelledNuclearCellCount) {
		this.labelledNuclearCellCount = labelledNuclearCellCount;
	}
      
}

