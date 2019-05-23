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
public class Lipid extends Gravimetry {
 //declarations
	    /******************
	     *0 !!!info solvent 
	  
	   *2 public String solvent;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration solvent
	   
	     */ 
	   
	      
	      @Info(description="Solvant")
	      public String solvent;
  
	    /******************
	     *0 !!!info temperatureCycle 
	  
	   *2 public String temperatureCycle;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration temperatureCycle
	   
	     */ 
	   
	      
	      @Info(description="CycleDeTemperature")
	      public String temperatureCycle;
  
	    /******************
	     *0 !!!info bucketType 
	  
	   *2 public String bucketType;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration bucketType
	   
	     */ 
	   
	      
	      @Info(description="TypeDeGodet")
	      public String bucketType;
  
	    /******************
	     *0 !!!info dryingTemperature 
	   *1 @has unit: celsius KISS
	  
	   *2 public EFloat dryingTemperature;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration dryingTemperature
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: celsius */ 
	      @CustomUnit(value="celsius" )
	      @Info(description="TemperatureDeChauffage")
	      public Float dryingTemperature;
  
//getter
 
	    /**
	     * Gets the value of solvent
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@70a36a66 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSolvent() {
		return this.solvent;
	}
      
 
	    /**
	     * Gets the value of temperatureCycle
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@d3957fe (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTemperatureCycle() {
		return this.temperatureCycle;
	}
      
 
	    /**
	     * Gets the value of bucketType
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@23fb172e (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getBucketType() {
		return this.bucketType;
	}
      
 
	    /**
	     * Gets the value of dryingTemperature
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5e1fa5b1 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getDryingTemperature() {
		return this.dryingTemperature;
	}
      
//setter
   
	    /**
	     * Sets the value of solvent
	     */
	public void setSolvent(String solvent) {
		this.solvent = solvent;
	}
      
   
	    /**
	     * Sets the value of temperatureCycle
	     */
	public void setTemperatureCycle(String temperatureCycle) {
		this.temperatureCycle = temperatureCycle;
	}
      
   
	    /**
	     * Sets the value of bucketType
	     */
	public void setBucketType(String bucketType) {
		this.bucketType = bucketType;
	}
      
   
	    /**
	     * Sets the value of dryingTemperature
	     */
	public void setDryingTemperature(Float dryingTemperature) {
		this.dryingTemperature = dryingTemperature;
	}
      
}

