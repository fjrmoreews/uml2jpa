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
public class Hplc  {
 //declarations
	    /******************
	     *0 !!!info result_OH-pro 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_OH-pro;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_OH-pro
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_oh-pro;
  
	    /******************
	     *0 !!!info result_acys 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_acys;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_acys
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_acys;
  
	    /******************
	     *0 !!!info result_ala 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_ala;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_ala
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_ala;
  
	    /******************
	     *0 !!!info result_arg 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_arg;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_arg
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_arg;
  
	    /******************
	     *0 !!!info result_asp 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_asp;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_asp
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_asp;
  
	    /******************
	     *0 !!!info result_cys 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_cys;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_cys
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_cys;
  
	    /******************
	     *0 !!!info result_glu 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_glu;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_glu
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_glu;
  
	    /******************
	     *0 !!!info result_gly 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_gly;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_gly
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_gly;
  
	    /******************
	     *0 !!!info result_his 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_his;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_his
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_his;
  
	    /******************
	     *0 !!!info result_ile 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_ile;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_ile
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_ile;
  
	    /******************
	     *0 !!!info result_leu 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_leu;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_leu
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_leu;
  
	    /******************
	     *0 !!!info result_lys 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_lys;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_lys
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_lys;
  
	    /******************
	     *0 !!!info result_meso 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_meso;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_meso
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_meso;
  
	    /******************
	     *0 !!!info result_met 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_met;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_met
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_met;
  
	    /******************
	     *0 !!!info result_nh3 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_nh3;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_nh3
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_nh3;
  
	    /******************
	     *0 !!!info result_phe 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_phe;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_phe
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_phe;
  
	    /******************
	     *0 !!!info result_pro 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_pro;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_pro
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_pro;
  
	    /******************
	     *0 !!!info result_ser 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_ser;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_ser
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_ser;
  
	    /******************
	     *0 !!!info result_thr 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_thr;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_thr
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_thr;
  
	    /******************
	     *0 !!!info result_tyr 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_tyr;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_tyr
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_tyr;
  
	    /******************
	     *0 !!!info result_val 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat result_val;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result_val
	     */ 
	@has unit: g/100g
	 min>0
	 nullable: NA, LD, LQ
	public Float result_val;
  
//getter
 
	    /**
	     * Gets the value of result_OH-pro
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5003041b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_oh-pro() {
		return this.result_oh-pro;
	}
      
 
	    /**
	     * Gets the value of result_acys
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@16fb356 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_acys() {
		return this.result_acys;
	}
      
 
	    /**
	     * Gets the value of result_ala
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@23a9ba52 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_ala() {
		return this.result_ala;
	}
      
 
	    /**
	     * Gets the value of result_arg
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@70ab80e3 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_arg() {
		return this.result_arg;
	}
      
 
	    /**
	     * Gets the value of result_asp
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@67427b69 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_asp() {
		return this.result_asp;
	}
      
 
	    /**
	     * Gets the value of result_cys
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@544630b7 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_cys() {
		return this.result_cys;
	}
      
 
	    /**
	     * Gets the value of result_glu
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1095f122 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_glu() {
		return this.result_glu;
	}
      
 
	    /**
	     * Gets the value of result_gly
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3d6300e8 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_gly() {
		return this.result_gly;
	}
      
 
	    /**
	     * Gets the value of result_his
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@24a1c17f (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_his() {
		return this.result_his;
	}
      
 
	    /**
	     * Gets the value of result_ile
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@73511076 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_ile() {
		return this.result_ile;
	}
      
 
	    /**
	     * Gets the value of result_leu
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@532721fd (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_leu() {
		return this.result_leu;
	}
      
 
	    /**
	     * Gets the value of result_lys
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7fb9f71f (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_lys() {
		return this.result_lys;
	}
      
 
	    /**
	     * Gets the value of result_meso
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@51f49060 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_meso() {
		return this.result_meso;
	}
      
 
	    /**
	     * Gets the value of result_met
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@617fe9e1 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_met() {
		return this.result_met;
	}
      
 
	    /**
	     * Gets the value of result_nh3
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1cf2fed4 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_nh3() {
		return this.result_nh3;
	}
      
 
	    /**
	     * Gets the value of result_phe
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@245a26e1 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_phe() {
		return this.result_phe;
	}
      
 
	    /**
	     * Gets the value of result_pro
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@466cf502 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_pro() {
		return this.result_pro;
	}
      
 
	    /**
	     * Gets the value of result_ser
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2e185cd7 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_ser() {
		return this.result_ser;
	}
      
 
	    /**
	     * Gets the value of result_thr
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5f7f2382 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_thr() {
		return this.result_thr;
	}
      
 
	    /**
	     * Gets the value of result_tyr
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6815c5f2 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_tyr() {
		return this.result_tyr;
	}
      
 
	    /**
	     * Gets the value of result_val
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@60094a13 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult_val() {
		return this.result_val;
	}
      
//setter
   
	    /**
	     * Sets the value of result_OH-pro
	     */
	public void setResult_oh-pro(Float result_oh-pro) {
		this.result_oh-pro = result_oh-pro;
	}
      
   
	    /**
	     * Sets the value of result_acys
	     */
	public void setResult_acys(Float result_acys) {
		this.result_acys = result_acys;
	}
      
   
	    /**
	     * Sets the value of result_ala
	     */
	public void setResult_ala(Float result_ala) {
		this.result_ala = result_ala;
	}
      
   
	    /**
	     * Sets the value of result_arg
	     */
	public void setResult_arg(Float result_arg) {
		this.result_arg = result_arg;
	}
      
   
	    /**
	     * Sets the value of result_asp
	     */
	public void setResult_asp(Float result_asp) {
		this.result_asp = result_asp;
	}
      
   
	    /**
	     * Sets the value of result_cys
	     */
	public void setResult_cys(Float result_cys) {
		this.result_cys = result_cys;
	}
      
   
	    /**
	     * Sets the value of result_glu
	     */
	public void setResult_glu(Float result_glu) {
		this.result_glu = result_glu;
	}
      
   
	    /**
	     * Sets the value of result_gly
	     */
	public void setResult_gly(Float result_gly) {
		this.result_gly = result_gly;
	}
      
   
	    /**
	     * Sets the value of result_his
	     */
	public void setResult_his(Float result_his) {
		this.result_his = result_his;
	}
      
   
	    /**
	     * Sets the value of result_ile
	     */
	public void setResult_ile(Float result_ile) {
		this.result_ile = result_ile;
	}
      
   
	    /**
	     * Sets the value of result_leu
	     */
	public void setResult_leu(Float result_leu) {
		this.result_leu = result_leu;
	}
      
   
	    /**
	     * Sets the value of result_lys
	     */
	public void setResult_lys(Float result_lys) {
		this.result_lys = result_lys;
	}
      
   
	    /**
	     * Sets the value of result_meso
	     */
	public void setResult_meso(Float result_meso) {
		this.result_meso = result_meso;
	}
      
   
	    /**
	     * Sets the value of result_met
	     */
	public void setResult_met(Float result_met) {
		this.result_met = result_met;
	}
      
   
	    /**
	     * Sets the value of result_nh3
	     */
	public void setResult_nh3(Float result_nh3) {
		this.result_nh3 = result_nh3;
	}
      
   
	    /**
	     * Sets the value of result_phe
	     */
	public void setResult_phe(Float result_phe) {
		this.result_phe = result_phe;
	}
      
   
	    /**
	     * Sets the value of result_pro
	     */
	public void setResult_pro(Float result_pro) {
		this.result_pro = result_pro;
	}
      
   
	    /**
	     * Sets the value of result_ser
	     */
	public void setResult_ser(Float result_ser) {
		this.result_ser = result_ser;
	}
      
   
	    /**
	     * Sets the value of result_thr
	     */
	public void setResult_thr(Float result_thr) {
		this.result_thr = result_thr;
	}
      
   
	    /**
	     * Sets the value of result_tyr
	     */
	public void setResult_tyr(Float result_tyr) {
		this.result_tyr = result_tyr;
	}
      
   
	    /**
	     * Sets the value of result_val
	     */
	public void setResult_val(Float result_val) {
		this.result_val = result_val;
	}
      
}

