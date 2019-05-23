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
public class GeneralAnalysis  {
 //declarations
	    /******************
	     *0 !!!info date 
	   *1 @Ordered(index=3) KISS
	  
	   *2 public EDate date;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EDate
	   *7 		date
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration date
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @Ordered(index=3) */ 
	      @Ordered(index=3)
	      @Info(description="Date")
	      public Date date;
  
	    /******************
	     *0 !!!info operator 
	   *1 @Ordered(index=1) KISS
	  
	   *2 public String operator;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration operator
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @Ordered(index=1) */ 
	      @Ordered(index=1)
	      @Info(description="Manipulateur")
	      public String operator;
  
	    /******************
	     *0 !!!info laboratoryOperatingMode 
	  
	   *2 public String laboratoryOperatingMode;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration laboratoryOperatingMode
	   
	     */ 
	   
	      
	      @Info(description="ModeOderatoireLaboratoire")
	      public String laboratoryOperatingMode;
  
	    /******************
	     *0 !!!info criticalApparatusCriticalSoftware 
	  
	   *2 public String criticalApparatusCriticalSoftware;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration criticalApparatusCriticalSoftware
	   
	     */ 
	   
	      
	      @Info(description="AppareilLogicielCritique")
	      public String criticalApparatusCriticalSoftware;
  
	    /******************
	     *0 !!!info criticalProduct 
	  
	   *2 public String criticalProduct;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration criticalProduct
	   
	     */ 
	   
	      
	      @Info(description="ProduitCritique")
	      public String criticalProduct;
  
	    /******************
	     *0 !!!info rawDataPathway 
	  
	   *2 public String rawDataPathway;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration rawDataPathway
	   
	     */ 
	   
	      
	      @Info(description="LieuStockageDonneesBrutes")
	      public String rawDataPathway;
  
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
  
//getter
 
	    /**
	     * Gets the value of date
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1e636ea3 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EDate
	      
	     */
	public Date getDate() {
		return this.date;
	}
      
 
	    /**
	     * Gets the value of operator
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@497486b3 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getOperator() {
		return this.operator;
	}
      
 
	    /**
	     * Gets the value of laboratoryOperatingMode
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6bbe2511 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getLaboratoryOperatingMode() {
		return this.laboratoryOperatingMode;
	}
      
 
	    /**
	     * Gets the value of criticalApparatusCriticalSoftware
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@79d94571 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getCriticalApparatusCriticalSoftware() {
		return this.criticalApparatusCriticalSoftware;
	}
      
 
	    /**
	     * Gets the value of criticalProduct
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@495b0487 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getCriticalProduct() {
		return this.criticalProduct;
	}
      
 
	    /**
	     * Gets the value of rawDataPathway
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@93cf163 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getRawDataPathway() {
		return this.rawDataPathway;
	}
      
 
	    /**
	     * Gets the value of sampleID
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@46268f08 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSampleID() {
		return this.sampleID;
	}
      
//setter
   
	    /**
	     * Sets the value of date
	     */
	public void setDate(Date date) {
		this.date = date;
	}
      
   
	    /**
	     * Sets the value of operator
	     */
	public void setOperator(String operator) {
		this.operator = operator;
	}
      
   
	    /**
	     * Sets the value of laboratoryOperatingMode
	     */
	public void setLaboratoryOperatingMode(String laboratoryOperatingMode) {
		this.laboratoryOperatingMode = laboratoryOperatingMode;
	}
      
   
	    /**
	     * Sets the value of criticalApparatusCriticalSoftware
	     */
	public void setCriticalApparatusCriticalSoftware(String criticalApparatusCriticalSoftware) {
		this.criticalApparatusCriticalSoftware = criticalApparatusCriticalSoftware;
	}
      
   
	    /**
	     * Sets the value of criticalProduct
	     */
	public void setCriticalProduct(String criticalProduct) {
		this.criticalProduct = criticalProduct;
	}
      
   
	    /**
	     * Sets the value of rawDataPathway
	     */
	public void setRawDataPathway(String rawDataPathway) {
		this.rawDataPathway = rawDataPathway;
	}
      
   
	    /**
	     * Sets the value of sampleID
	     */
	public void setSampleID(String sampleID) {
		this.sampleID = sampleID;
	}
      
}

