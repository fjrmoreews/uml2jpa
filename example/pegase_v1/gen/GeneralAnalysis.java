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
public class GeneralAnalysis  {
 //declarations
	    /******************
	     *0 !!!info date 
	  
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
	   
	      
	      
	      public Date date;
  
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
	   
	      
	      
	      public String laboratoryoperatingmode;
  
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
	   
	      
	      
	      public String criticalapparatuscriticalsoftware;
  
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
	   
	      
	      
	      public String criticalproduct;
  
	    /******************
	     *0 !!!info operator 
	  
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
	   
	      
	      
	      public String operator;
  
	    /******************
	     *0 !!!info sampleID 
	  
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
	   
	      
	      
	      public String sampleid;
  
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
	   
	      
	      
	      public String rawdatapathway;
  
//getter
 
	    /**
	     * Gets the value of date
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@737a135b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EDate
	      
	     */
	public Date getDate() {
		return this.date;
	}
      
 
	    /**
	     * Gets the value of laboratoryOperatingMode
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1e636ea3 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getLaboratoryoperatingmode() {
		return this.laboratoryoperatingmode;
	}
      
 
	    /**
	     * Gets the value of criticalApparatusCriticalSoftware
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4ce7fffa (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getCriticalapparatuscriticalsoftware() {
		return this.criticalapparatuscriticalsoftware;
	}
      
 
	    /**
	     * Gets the value of criticalProduct
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@75f95314 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getCriticalproduct() {
		return this.criticalproduct;
	}
      
 
	    /**
	     * Gets the value of operator
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6bbe2511 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getOperator() {
		return this.operator;
	}
      
 
	    /**
	     * Gets the value of sampleID
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@635572a7 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSampleid() {
		return this.sampleid;
	}
      
 
	    /**
	     * Gets the value of rawDataPathway
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4dd02341 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getRawdatapathway() {
		return this.rawdatapathway;
	}
      
//setter
   
	    /**
	     * Sets the value of date
	     */
	public void setDate(Date date) {
		this.date = date;
	}
      
   
	    /**
	     * Sets the value of laboratoryOperatingMode
	     */
	public void setLaboratoryoperatingmode(String laboratoryoperatingmode) {
		this.laboratoryoperatingmode = laboratoryoperatingmode;
	}
      
   
	    /**
	     * Sets the value of criticalApparatusCriticalSoftware
	     */
	public void setCriticalapparatuscriticalsoftware(String criticalapparatuscriticalsoftware) {
		this.criticalapparatuscriticalsoftware = criticalapparatuscriticalsoftware;
	}
      
   
	    /**
	     * Sets the value of criticalProduct
	     */
	public void setCriticalproduct(String criticalproduct) {
		this.criticalproduct = criticalproduct;
	}
      
   
	    /**
	     * Sets the value of operator
	     */
	public void setOperator(String operator) {
		this.operator = operator;
	}
      
   
	    /**
	     * Sets the value of sampleID
	     */
	public void setSampleid(String sampleid) {
		this.sampleid = sampleid;
	}
      
   
	    /**
	     * Sets the value of rawDataPathway
	     */
	public void setRawdatapathway(String rawdatapathway) {
		this.rawdatapathway = rawdatapathway;
	}
      
}

