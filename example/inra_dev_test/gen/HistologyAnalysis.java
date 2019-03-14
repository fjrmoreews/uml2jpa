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
 
	
@Namespace("http://inra/pegase#")
public class HistologyAnalysis extends ImagingAnalysis {
 //declarations
	    /******************
	     *0 !!!info ColorRefProdCrit 
	  
	   *2 private String ColorRefProdCrit;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration ColorRefProdCrit
	     */ 
	private String colorrefprodcrit;
  
	    /******************
	     *0 !!!info InclusionType 
	  
	   *2 private String InclusionType;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration InclusionType
	     */ 
	private String inclusiontype;
  
	    /******************
	     *0 !!!info CuttingDevice 
	  
	   *2 private String CuttingDevice;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration CuttingDevice
	     */ 
	private String cuttingdevice;
  
	    /******************
	     *0 !!!info MicroscopeType 
	  
	   *2 private String MicroscopeType;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration MicroscopeType
	     */ 
	private String microscopetype;
  
	    /******************
	     *0 !!!info FixationType 
	  
	   *2 private String FixationType;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration FixationType
	     */ 
	private String fixationtype;
  
	    /******************
	     *0 !!!info ImageScale 
	  
	   *2 private EFloat ImageScale;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration ImageScale
	     */ 
	private Float imagescale;
  
	    /******************
	     *0 !!!info LameNum 
	  
	   *2 private String LameNum;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration LameNum
	     */ 
	private String lamenum;
  
	    /******************
	     *0 !!!info CuttingThickness 
	  
	   *2 private EFloat CuttingThickness;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration CuttingThickness
	     */ 
	private Float cuttingthickness;
  
	    /******************
	     *0 !!!info MicroscopeGrowth 
	  
	   *2 private Integer MicroscopeGrowth;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration MicroscopeGrowth
	     */ 
	private Integer microscopegrowth;
  
	    /******************
	     *0 !!!info SoftwareAnalysis 
	  
	   *2 private String SoftwareAnalysis;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration SoftwareAnalysis
	     */ 
	private String softwareanalysis;
  
	    /******************
	     *0 !!!info MeasuringField 
	  
	   *2 private String MeasuringField;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration MeasuringField
	     */ 
	private String measuringfield;
  
//getter
 
	    /**
	     * Gets the value of ColorRefProdCrit
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1d9bec4d (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getColorrefprodcrit() {
		return this.colorrefprodcrit;
	}
      
 
	    /**
	     * Gets the value of InclusionType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@10c8f62 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getInclusiontype() {
		return this.inclusiontype;
	}
      
 
	    /**
	     * Gets the value of CuttingDevice
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@25f7391e (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getCuttingdevice() {
		return this.cuttingdevice;
	}
      
 
	    /**
	     * Gets the value of MicroscopeType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5ab14cb9 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getMicroscopetype() {
		return this.microscopetype;
	}
      
 
	    /**
	     * Gets the value of FixationType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@439a8f59 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getFixationtype() {
		return this.fixationtype;
	}
      
 
	    /**
	     * Gets the value of ImageScale
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@31024624 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getImagescale() {
		return this.imagescale;
	}
      
 
	    /**
	     * Gets the value of LameNum
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@32cb636e (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getLamenum() {
		return this.lamenum;
	}
      
 
	    /**
	     * Gets the value of CuttingThickness
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@40dd3977 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getCuttingthickness() {
		return this.cuttingthickness;
	}
      
 
	    /**
	     * Gets the value of MicroscopeGrowth
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6a1d204a (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getMicroscopegrowth() {
		return this.microscopegrowth;
	}
      
 
	    /**
	     * Gets the value of SoftwareAnalysis
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4b6579e8 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSoftwareanalysis() {
		return this.softwareanalysis;
	}
      
 
	    /**
	     * Gets the value of MeasuringField
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6c6357f9 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getMeasuringfield() {
		return this.measuringfield;
	}
      
//setter
   
	    /**
	     * Sets the value of ColorRefProdCrit
	     */
	public void setColorrefprodcrit(String colorrefprodcrit) {
		this.colorrefprodcrit = colorrefprodcrit;
	}
      
   
	    /**
	     * Sets the value of InclusionType
	     */
	public void setInclusiontype(String inclusiontype) {
		this.inclusiontype = inclusiontype;
	}
      
   
	    /**
	     * Sets the value of CuttingDevice
	     */
	public void setCuttingdevice(String cuttingdevice) {
		this.cuttingdevice = cuttingdevice;
	}
      
   
	    /**
	     * Sets the value of MicroscopeType
	     */
	public void setMicroscopetype(String microscopetype) {
		this.microscopetype = microscopetype;
	}
      
   
	    /**
	     * Sets the value of FixationType
	     */
	public void setFixationtype(String fixationtype) {
		this.fixationtype = fixationtype;
	}
      
   
	    /**
	     * Sets the value of ImageScale
	     */
	public void setImagescale(Float imagescale) {
		this.imagescale = imagescale;
	}
      
   
	    /**
	     * Sets the value of LameNum
	     */
	public void setLamenum(String lamenum) {
		this.lamenum = lamenum;
	}
      
   
	    /**
	     * Sets the value of CuttingThickness
	     */
	public void setCuttingthickness(Float cuttingthickness) {
		this.cuttingthickness = cuttingthickness;
	}
      
   
	    /**
	     * Sets the value of MicroscopeGrowth
	     */
	public void setMicroscopegrowth(Integer microscopegrowth) {
		this.microscopegrowth = microscopegrowth;
	}
      
   
	    /**
	     * Sets the value of SoftwareAnalysis
	     */
	public void setSoftwareanalysis(String softwareanalysis) {
		this.softwareanalysis = softwareanalysis;
	}
      
   
	    /**
	     * Sets the value of MeasuringField
	     */
	public void setMeasuringfield(String measuringfield) {
		this.measuringfield = measuringfield;
	}
      
}

