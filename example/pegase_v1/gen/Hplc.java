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
public class Hplc extends Chromatography {
 //declarations
	    /******************
	     *0 !!!info OH_pro 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat OH_pro;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration OH_pro
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float oh_pro;
  
	    /******************
	     *0 !!!info Acys 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Acys;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Acys
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float acys;
  
	    /******************
	     *0 !!!info Ala 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Ala;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Ala
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float ala;
  
	    /******************
	     *0 !!!info Arg 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Arg;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Arg
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float arg;
  
	    /******************
	     *0 !!!info Asp 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Asp;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Asp
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float asp;
  
	    /******************
	     *0 !!!info Cys 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Cys;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Cys
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float cys;
  
	    /******************
	     *0 !!!info Glu 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Glu;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Glu
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float glu;
  
	    /******************
	     *0 !!!info Gly 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Gly;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Gly
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float gly;
  
	    /******************
	     *0 !!!info His 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat His;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration His
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float his;
  
	    /******************
	     *0 !!!info Ile 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Ile;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Ile
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float ile;
  
	    /******************
	     *0 !!!info Leu 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Leu;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Leu
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float leu;
  
	    /******************
	     *0 !!!info Lys 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Lys;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Lys
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float lys;
  
	    /******************
	     *0 !!!info Meso 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Meso;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Meso
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float meso;
  
	    /******************
	     *0 !!!info Met 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Met;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Met
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float met;
  
	    /******************
	     *0 !!!info Nh3 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Nh3;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Nh3
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float nh3;
  
	    /******************
	     *0 !!!info Phe 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Phe;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Phe
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float phe;
  
	    /******************
	     *0 !!!info Pro 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Pro;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Pro
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float pro;
  
	    /******************
	     *0 !!!info Ser 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Ser;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Ser
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float ser;
  
	    /******************
	     *0 !!!info Thr 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Thr;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Thr
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float thr;
  
	    /******************
	     *0 !!!info Tyr 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Tyr;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Tyr
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float tyr;
  
	    /******************
	     *0 !!!info Val 
	   *1 @has unit: g/100g
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Val;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Val
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: g/100g
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="g/100g" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float val;
  
//getter
 
	    /**
	     * Gets the value of OH_pro
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@68be8808 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getOh_pro() {
		return this.oh_pro;
	}
      
 
	    /**
	     * Gets the value of Acys
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@69653e16 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAcys() {
		return this.acys;
	}
      
 
	    /**
	     * Gets the value of Ala
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@906d29b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAla() {
		return this.ala;
	}
      
 
	    /**
	     * Gets the value of Arg
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5fe1ce85 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getArg() {
		return this.arg;
	}
      
 
	    /**
	     * Gets the value of Asp
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@66fdec9 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAsp() {
		return this.asp;
	}
      
 
	    /**
	     * Gets the value of Cys
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2a640157 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getCys() {
		return this.cys;
	}
      
 
	    /**
	     * Gets the value of Glu
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5d8bafa9 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getGlu() {
		return this.glu;
	}
      
 
	    /**
	     * Gets the value of Gly
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@f80945f (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getGly() {
		return this.gly;
	}
      
 
	    /**
	     * Gets the value of His
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5ef6ae06 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getHis() {
		return this.his;
	}
      
 
	    /**
	     * Gets the value of Ile
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1cdc4c27 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getIle() {
		return this.ile;
	}
      
 
	    /**
	     * Gets the value of Leu
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1e8ce150 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getLeu() {
		return this.leu;
	}
      
 
	    /**
	     * Gets the value of Lys
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1b73be9f (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getLys() {
		return this.lys;
	}
      
 
	    /**
	     * Gets the value of Meso
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@30b19518 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getMeso() {
		return this.meso;
	}
      
 
	    /**
	     * Gets the value of Met
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6ad59d92 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getMet() {
		return this.met;
	}
      
 
	    /**
	     * Gets the value of Nh3
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2cc44ad (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getNh3() {
		return this.nh3;
	}
      
 
	    /**
	     * Gets the value of Phe
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@663411de (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getPhe() {
		return this.phe;
	}
      
 
	    /**
	     * Gets the value of Pro
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@75cd8043 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getPro() {
		return this.pro;
	}
      
 
	    /**
	     * Gets the value of Ser
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@10b9db7b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getSer() {
		return this.ser;
	}
      
 
	    /**
	     * Gets the value of Thr
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6ee660fb (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getThr() {
		return this.thr;
	}
      
 
	    /**
	     * Gets the value of Tyr
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1ecee32c (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getTyr() {
		return this.tyr;
	}
      
 
	    /**
	     * Gets the value of Val
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4b41e4dd (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getVal() {
		return this.val;
	}
      
//setter
   
	    /**
	     * Sets the value of OH_pro
	     */
	public void setOh_pro(Float oh_pro) {
		this.oh_pro = oh_pro;
	}
      
   
	    /**
	     * Sets the value of Acys
	     */
	public void setAcys(Float acys) {
		this.acys = acys;
	}
      
   
	    /**
	     * Sets the value of Ala
	     */
	public void setAla(Float ala) {
		this.ala = ala;
	}
      
   
	    /**
	     * Sets the value of Arg
	     */
	public void setArg(Float arg) {
		this.arg = arg;
	}
      
   
	    /**
	     * Sets the value of Asp
	     */
	public void setAsp(Float asp) {
		this.asp = asp;
	}
      
   
	    /**
	     * Sets the value of Cys
	     */
	public void setCys(Float cys) {
		this.cys = cys;
	}
      
   
	    /**
	     * Sets the value of Glu
	     */
	public void setGlu(Float glu) {
		this.glu = glu;
	}
      
   
	    /**
	     * Sets the value of Gly
	     */
	public void setGly(Float gly) {
		this.gly = gly;
	}
      
   
	    /**
	     * Sets the value of His
	     */
	public void setHis(Float his) {
		this.his = his;
	}
      
   
	    /**
	     * Sets the value of Ile
	     */
	public void setIle(Float ile) {
		this.ile = ile;
	}
      
   
	    /**
	     * Sets the value of Leu
	     */
	public void setLeu(Float leu) {
		this.leu = leu;
	}
      
   
	    /**
	     * Sets the value of Lys
	     */
	public void setLys(Float lys) {
		this.lys = lys;
	}
      
   
	    /**
	     * Sets the value of Meso
	     */
	public void setMeso(Float meso) {
		this.meso = meso;
	}
      
   
	    /**
	     * Sets the value of Met
	     */
	public void setMet(Float met) {
		this.met = met;
	}
      
   
	    /**
	     * Sets the value of Nh3
	     */
	public void setNh3(Float nh3) {
		this.nh3 = nh3;
	}
      
   
	    /**
	     * Sets the value of Phe
	     */
	public void setPhe(Float phe) {
		this.phe = phe;
	}
      
   
	    /**
	     * Sets the value of Pro
	     */
	public void setPro(Float pro) {
		this.pro = pro;
	}
      
   
	    /**
	     * Sets the value of Ser
	     */
	public void setSer(Float ser) {
		this.ser = ser;
	}
      
   
	    /**
	     * Sets the value of Thr
	     */
	public void setThr(Float thr) {
		this.thr = thr;
	}
      
   
	    /**
	     * Sets the value of Tyr
	     */
	public void setTyr(Float tyr) {
		this.tyr = tyr;
	}
      
   
	    /**
	     * Sets the value of Val
	     */
	public void setVal(Float val) {
		this.val = val;
	}
      
}

