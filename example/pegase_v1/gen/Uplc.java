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
public class Uplc extends Chromatography {
 //declarations
	    /******************
	     *0 !!!info oneMH 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat oneMH;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration oneMH
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float oneMH;
  
	    /******************
	     *0 !!!info threeMH 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat threeMH;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration threeMH
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float threeMH;
  
	    /******************
	     *0 !!!info AABA 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat AABA;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration AABA
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float aABA;
  
	    /******************
	     *0 !!!info AADA 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat AADA;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration AADA
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float aADA;
  
	    /******************
	     *0 !!!info Ala 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float ala;
  
	    /******************
	     *0 !!!info Alle 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Alle;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Alle
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float alle;
  
	    /******************
	     *0 !!!info Ans 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Ans;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Ans
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float ans;
  
	    /******************
	     *0 !!!info Arg 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float arg;
  
	    /******************
	     *0 !!!info Asn 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Asn;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Asn
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float asn;
  
	    /******************
	     *0 !!!info Asp 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float asp;
  
	    /******************
	     *0 !!!info B_Ala 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat B_Ala;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration B_Ala
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float b_Ala;
  
	    /******************
	     *0 !!!info BAIb 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat BAIb;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration BAIb
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float bAIb;
  
	    /******************
	     *0 !!!info Carn 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Carn;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Carn
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float carn;
  
	    /******************
	     *0 !!!info Cit 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Cit;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Cit
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float cit;
  
	    /******************
	     *0 !!!info Cys 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float cys;
  
	    /******************
	     *0 !!!info Cyst 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Cyst;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Cyst
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float cyst;
  
	    /******************
	     *0 !!!info EA 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat EA;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration EA
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float eA;
  
	    /******************
	     *0 !!!info GABA 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat GABA;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration GABA
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float gABA;
  
	    /******************
	     *0 !!!info Gln 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Gln;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Gln
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float gln;
  
	    /******************
	     *0 !!!info Glu 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float glu;
  
	    /******************
	     *0 !!!info Gly 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float gly;
  
	    /******************
	     *0 !!!info His 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float his;
  
	    /******************
	     *0 !!!info HyPro 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat HyPro;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration HyPro
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float hyPro;
  
	    /******************
	     *0 !!!info Hyl2 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Hyl2;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Hyl2
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float hyl2;
  
	    /******************
	     *0 !!!info Ile 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float ile;
  
	    /******************
	     *0 !!!info Leu 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float leu;
  
	    /******************
	     *0 !!!info Lys 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float lys;
  
	    /******************
	     *0 !!!info Met 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float met;
  
	    /******************
	     *0 !!!info NH3 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat NH3;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration NH3
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float nH3;
  
	    /******************
	     *0 !!!info Orn 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Orn;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Orn
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float orn;
  
	    /******************
	     *0 !!!info PEA 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat PEA;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration PEA
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float pEA;
  
	    /******************
	     *0 !!!info PSer 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat PSer;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration PSer
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float pSer;
  
	    /******************
	     *0 !!!info Phe 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float phe;
  
	    /******************
	     *0 !!!info Pro 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float pro;
  
	    /******************
	     *0 !!!info Sar 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Sar;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Sar
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float sar;
  
	    /******************
	     *0 !!!info Ser 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float ser;
  
	    /******************
	     *0 !!!info Tau 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Tau;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Tau
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float tau;
  
	    /******************
	     *0 !!!info Thr 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float thr;
  
	    /******************
	     *0 !!!info Trp 
	   *1 @has unit: µmole/ml
	       min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Trp;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Trp
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float trp;
  
	    /******************
	     *0 !!!info Tyr 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float tyr;
  
	    /******************
	     *0 !!!info Val 
	   *1 @has unit: µmole/ml
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
	       /*	   @has unit: µmole/ml
	         	    min>0
	         	    nullable: NA, LD, LQ */ 
	      @CustomUnit(value="µmole/ml" )
	      @Null
	      @Size(min = 0 )
	      
	      public Float val;
  
//getter
 
	    /**
	     * Gets the value of oneMH
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@235a0c16 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getOneMH() {
		return this.oneMH;
	}
      
 
	    /**
	     * Gets the value of threeMH
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@18b0930f (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getThreeMH() {
		return this.threeMH;
	}
      
 
	    /**
	     * Gets the value of AABA
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@395b56bb (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAABA() {
		return this.aABA;
	}
      
 
	    /**
	     * Gets the value of AADA
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@52d239ba (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAADA() {
		return this.aADA;
	}
      
 
	    /**
	     * Gets the value of Ala
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6c5945a7 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAla() {
		return this.ala;
	}
      
 
	    /**
	     * Gets the value of Alle
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5c10f1c3 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAlle() {
		return this.alle;
	}
      
 
	    /**
	     * Gets the value of Ans
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@64a8c844 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAns() {
		return this.ans;
	}
      
 
	    /**
	     * Gets the value of Arg
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@18c5069b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getArg() {
		return this.arg;
	}
      
 
	    /**
	     * Gets the value of Asn
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@485e36bc (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAsn() {
		return this.asn;
	}
      
 
	    /**
	     * Gets the value of Asp
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2e9fda69 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAsp() {
		return this.asp;
	}
      
 
	    /**
	     * Gets the value of B_Ala
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@736d6a5c (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getB_Ala() {
		return this.b_Ala;
	}
      
 
	    /**
	     * Gets the value of BAIb
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@63fdab07 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getBAIb() {
		return this.bAIb;
	}
      
 
	    /**
	     * Gets the value of Carn
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1af687fe (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getCarn() {
		return this.carn;
	}
      
 
	    /**
	     * Gets the value of Cit
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@74a6a609 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getCit() {
		return this.cit;
	}
      
 
	    /**
	     * Gets the value of Cys
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@54d18072 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getCys() {
		return this.cys;
	}
      
 
	    /**
	     * Gets the value of Cyst
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@424fd310 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getCyst() {
		return this.cyst;
	}
      
 
	    /**
	     * Gets the value of EA
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5286c33a (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getEA() {
		return this.eA;
	}
      
 
	    /**
	     * Gets the value of GABA
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6c25e6c4 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getGABA() {
		return this.gABA;
	}
      
 
	    /**
	     * Gets the value of Gln
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@48a12036 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getGln() {
		return this.gln;
	}
      
 
	    /**
	     * Gets the value of Glu
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@b70da4c (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@435fb7b5 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@696f0212 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getHis() {
		return this.his;
	}
      
 
	    /**
	     * Gets the value of HyPro
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@56c698e3 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getHyPro() {
		return this.hyPro;
	}
      
 
	    /**
	     * Gets the value of Hyl2
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@19553973 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getHyl2() {
		return this.hyl2;
	}
      
 
	    /**
	     * Gets the value of Ile
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4c4748bf (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@73dce0e6 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4795ded0 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getLys() {
		return this.lys;
	}
      
 
	    /**
	     * Gets the value of Met
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2eced48b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getMet() {
		return this.met;
	}
      
 
	    /**
	     * Gets the value of NH3
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5c8504fd (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getNH3() {
		return this.nH3;
	}
      
 
	    /**
	     * Gets the value of Orn
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3f07b12c (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getOrn() {
		return this.orn;
	}
      
 
	    /**
	     * Gets the value of PEA
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3e14c16d (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getPEA() {
		return this.pEA;
	}
      
 
	    /**
	     * Gets the value of PSer
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3d3ba765 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getPSer() {
		return this.pSer;
	}
      
 
	    /**
	     * Gets the value of Phe
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@793138bd (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@33aeca0b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getPro() {
		return this.pro;
	}
      
 
	    /**
	     * Gets the value of Sar
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4ba302e0 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getSar() {
		return this.sar;
	}
      
 
	    /**
	     * Gets the value of Ser
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2f6e28bc (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getSer() {
		return this.ser;
	}
      
 
	    /**
	     * Gets the value of Tau
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@18cebaa5 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getTau() {
		return this.tau;
	}
      
 
	    /**
	     * Gets the value of Thr
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@62f68dff (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getThr() {
		return this.thr;
	}
      
 
	    /**
	     * Gets the value of Trp
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1d0d6318 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getTrp() {
		return this.trp;
	}
      
 
	    /**
	     * Gets the value of Tyr
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5c153b9e (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7ec3394b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
	     * Sets the value of oneMH
	     */
	public void setOneMH(Float oneMH) {
		this.oneMH = oneMH;
	}
      
   
	    /**
	     * Sets the value of threeMH
	     */
	public void setThreeMH(Float threeMH) {
		this.threeMH = threeMH;
	}
      
   
	    /**
	     * Sets the value of AABA
	     */
	public void setAABA(Float aABA) {
		this.aABA = aABA;
	}
      
   
	    /**
	     * Sets the value of AADA
	     */
	public void setAADA(Float aADA) {
		this.aADA = aADA;
	}
      
   
	    /**
	     * Sets the value of Ala
	     */
	public void setAla(Float ala) {
		this.ala = ala;
	}
      
   
	    /**
	     * Sets the value of Alle
	     */
	public void setAlle(Float alle) {
		this.alle = alle;
	}
      
   
	    /**
	     * Sets the value of Ans
	     */
	public void setAns(Float ans) {
		this.ans = ans;
	}
      
   
	    /**
	     * Sets the value of Arg
	     */
	public void setArg(Float arg) {
		this.arg = arg;
	}
      
   
	    /**
	     * Sets the value of Asn
	     */
	public void setAsn(Float asn) {
		this.asn = asn;
	}
      
   
	    /**
	     * Sets the value of Asp
	     */
	public void setAsp(Float asp) {
		this.asp = asp;
	}
      
   
	    /**
	     * Sets the value of B_Ala
	     */
	public void setB_Ala(Float b_Ala) {
		this.b_Ala = b_Ala;
	}
      
   
	    /**
	     * Sets the value of BAIb
	     */
	public void setBAIb(Float bAIb) {
		this.bAIb = bAIb;
	}
      
   
	    /**
	     * Sets the value of Carn
	     */
	public void setCarn(Float carn) {
		this.carn = carn;
	}
      
   
	    /**
	     * Sets the value of Cit
	     */
	public void setCit(Float cit) {
		this.cit = cit;
	}
      
   
	    /**
	     * Sets the value of Cys
	     */
	public void setCys(Float cys) {
		this.cys = cys;
	}
      
   
	    /**
	     * Sets the value of Cyst
	     */
	public void setCyst(Float cyst) {
		this.cyst = cyst;
	}
      
   
	    /**
	     * Sets the value of EA
	     */
	public void setEA(Float eA) {
		this.eA = eA;
	}
      
   
	    /**
	     * Sets the value of GABA
	     */
	public void setGABA(Float gABA) {
		this.gABA = gABA;
	}
      
   
	    /**
	     * Sets the value of Gln
	     */
	public void setGln(Float gln) {
		this.gln = gln;
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
	     * Sets the value of HyPro
	     */
	public void setHyPro(Float hyPro) {
		this.hyPro = hyPro;
	}
      
   
	    /**
	     * Sets the value of Hyl2
	     */
	public void setHyl2(Float hyl2) {
		this.hyl2 = hyl2;
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
	     * Sets the value of Met
	     */
	public void setMet(Float met) {
		this.met = met;
	}
      
   
	    /**
	     * Sets the value of NH3
	     */
	public void setNH3(Float nH3) {
		this.nH3 = nH3;
	}
      
   
	    /**
	     * Sets the value of Orn
	     */
	public void setOrn(Float orn) {
		this.orn = orn;
	}
      
   
	    /**
	     * Sets the value of PEA
	     */
	public void setPEA(Float pEA) {
		this.pEA = pEA;
	}
      
   
	    /**
	     * Sets the value of PSer
	     */
	public void setPSer(Float pSer) {
		this.pSer = pSer;
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
	     * Sets the value of Sar
	     */
	public void setSar(Float sar) {
		this.sar = sar;
	}
      
   
	    /**
	     * Sets the value of Ser
	     */
	public void setSer(Float ser) {
		this.ser = ser;
	}
      
   
	    /**
	     * Sets the value of Tau
	     */
	public void setTau(Float tau) {
		this.tau = tau;
	}
      
   
	    /**
	     * Sets the value of Thr
	     */
	public void setThr(Float thr) {
		this.thr = thr;
	}
      
   
	    /**
	     * Sets the value of Trp
	     */
	public void setTrp(Float trp) {
		this.trp = trp;
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

