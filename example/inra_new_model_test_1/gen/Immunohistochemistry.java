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
public class Immunohistochemistry  {
 //declarations
	    /******************
	     *0 !!!info firstAntibodyDilutionFactor 
	  
	   *2 public Integer firstAntibodyDilutionFactor;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration firstAntibodyDilutionFactor
	     */ 
	public Integer firstantibodydilutionfactor;
  
	    /******************
	     *0 !!!info firstAntibodyName 
	  
	   *2 public String firstAntibodyName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration firstAntibodyName
	     */ 
	public String firstantibodyname;
  
	    /******************
	     *0 !!!info firstAntibodyReference 
	  
	   *2 public String firstAntibodyReference;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration firstAntibodyReference
	     */ 
	public String firstantibodyreference;
  
	    /******************
	     *0 !!!info secondAntibodyName 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public String secondAntibodyName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondAntibodyName
	     */ 
	@nullable : NA, LD, LQ
	public String secondantibodyname;
  
	    /******************
	     *0 !!!info secondAntibodyDilutionFactor 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public Integer secondAntibodyDilutionFactor;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondAntibodyDilutionFactor
	     */ 
	@nullable : NA, LD, LQ
	public Integer secondantibodydilutionfactor;
  
	    /******************
	     *0 !!!info secondAntibodyReference 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public String secondAntibodyReference;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondAntibodyReference
	     */ 
	@nullable : NA, LD, LQ
	public String secondantibodyreference;
  
	    /******************
	     *0 !!!info exposureTime 
	  
	   *2 public String exposureTime;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration exposureTime
	     */ 
	public String exposuretime;
  
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
	public String particlediameterrange;
  
	    /******************
	     *0 !!!info thirdAntibodyReference 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public String thirdAntibodyReference;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration thirdAntibodyReference
	     */ 
	@nullable : NA, LD, LQ
	public String thirdantibodyreference;
  
	    /******************
	     *0 !!!info thirdAntibodyName 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public String thirdAntibodyName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration thirdAntibodyName
	     */ 
	@nullable : NA, LD, LQ
	public String thirdantibodyname;
  
	    /******************
	     *0 !!!info thirdAntibodyDilutionFactor 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public Integer thirdAntibodyDilutionFactor;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration thirdAntibodyDilutionFactor
	     */ 
	@nullable : NA, LD, LQ
	public Integer thirdantibodydilutionfactor;
  
	    /******************
	     *0 !!!info fourthAntibodyDilutionFactor 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public Integer fourthAntibodyDilutionFactor;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration fourthAntibodyDilutionFactor
	     */ 
	@nullable : NA, LD, LQ
	public Integer fourthantibodydilutionfactor;
  
	    /******************
	     *0 !!!info fourthAntibodyName 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public String fourthAntibodyName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration fourthAntibodyName
	     */ 
	@nullable : NA, LD, LQ
	public String fourthantibodyname;
  
	    /******************
	     *0 !!!info fourthAntibodyReference 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public String fourthAntibodyReference;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration fourthAntibodyReference
	     */ 
	@nullable : NA, LD, LQ
	public String fourthantibodyreference;
  
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
	public Integer resulttotalnuclearcellcount;
  
	    /******************
	     *0 !!!info resultLabelledNuclearCellCount 
	  
	   *2 public Integer resultLabelledNuclearCellCount;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration resultLabelledNuclearCellCount
	     */ 
	public Integer resultlabellednuclearcellcount;
  
//getter
 
	    /**
	     * Gets the value of firstAntibodyDilutionFactor
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3546d80f (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getFirstantibodydilutionfactor() {
		return this.firstantibodydilutionfactor;
	}
      
 
	    /**
	     * Gets the value of firstAntibodyName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3670f00 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getFirstantibodyname() {
		return this.firstantibodyname;
	}
      
 
	    /**
	     * Gets the value of firstAntibodyReference
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@46ab18da (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getFirstantibodyreference() {
		return this.firstantibodyreference;
	}
      
 
	    /**
	     * Gets the value of secondAntibodyName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@42257bdd (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSecondantibodyname() {
		return this.secondantibodyname;
	}
      
 
	    /**
	     * Gets the value of secondAntibodyDilutionFactor
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@687a762c (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getSecondantibodydilutionfactor() {
		return this.secondantibodydilutionfactor;
	}
      
 
	    /**
	     * Gets the value of secondAntibodyReference
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@733c423e (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSecondantibodyreference() {
		return this.secondantibodyreference;
	}
      
 
	    /**
	     * Gets the value of exposureTime
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@70925b45 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getExposuretime() {
		return this.exposuretime;
	}
      
 
	    /**
	     * Gets the value of particleDiameterRange
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@aa22f1c (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getParticlediameterrange() {
		return this.particlediameterrange;
	}
      
 
	    /**
	     * Gets the value of thirdAntibodyReference
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@37cd92d6 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getThirdantibodyreference() {
		return this.thirdantibodyreference;
	}
      
 
	    /**
	     * Gets the value of thirdAntibodyName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4263b080 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getThirdantibodyname() {
		return this.thirdantibodyname;
	}
      
 
	    /**
	     * Gets the value of thirdAntibodyDilutionFactor
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@71f67a79 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getThirdantibodydilutionfactor() {
		return this.thirdantibodydilutionfactor;
	}
      
 
	    /**
	     * Gets the value of fourthAntibodyDilutionFactor
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@62d363ab (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getFourthantibodydilutionfactor() {
		return this.fourthantibodydilutionfactor;
	}
      
 
	    /**
	     * Gets the value of fourthAntibodyName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3aee3976 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getFourthantibodyname() {
		return this.fourthantibodyname;
	}
      
 
	    /**
	     * Gets the value of fourthAntibodyReference
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@27cf3151 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getFourthantibodyreference() {
		return this.fourthantibodyreference;
	}
      
 
	    /**
	     * Gets the value of resultTotalNuclearCellCount
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5910de75 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getResulttotalnuclearcellcount() {
		return this.resulttotalnuclearcellcount;
	}
      
 
	    /**
	     * Gets the value of resultLabelledNuclearCellCount
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1f130eaf (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getResultlabellednuclearcellcount() {
		return this.resultlabellednuclearcellcount;
	}
      
//setter
   
	    /**
	     * Sets the value of firstAntibodyDilutionFactor
	     */
	public void setFirstantibodydilutionfactor(Integer firstantibodydilutionfactor) {
		this.firstantibodydilutionfactor = firstantibodydilutionfactor;
	}
      
   
	    /**
	     * Sets the value of firstAntibodyName
	     */
	public void setFirstantibodyname(String firstantibodyname) {
		this.firstantibodyname = firstantibodyname;
	}
      
   
	    /**
	     * Sets the value of firstAntibodyReference
	     */
	public void setFirstantibodyreference(String firstantibodyreference) {
		this.firstantibodyreference = firstantibodyreference;
	}
      
   
	    /**
	     * Sets the value of secondAntibodyName
	     */
	public void setSecondantibodyname(String secondantibodyname) {
		this.secondantibodyname = secondantibodyname;
	}
      
   
	    /**
	     * Sets the value of secondAntibodyDilutionFactor
	     */
	public void setSecondantibodydilutionfactor(Integer secondantibodydilutionfactor) {
		this.secondantibodydilutionfactor = secondantibodydilutionfactor;
	}
      
   
	    /**
	     * Sets the value of secondAntibodyReference
	     */
	public void setSecondantibodyreference(String secondantibodyreference) {
		this.secondantibodyreference = secondantibodyreference;
	}
      
   
	    /**
	     * Sets the value of exposureTime
	     */
	public void setExposuretime(String exposuretime) {
		this.exposuretime = exposuretime;
	}
      
   
	    /**
	     * Sets the value of particleDiameterRange
	     */
	public void setParticlediameterrange(String particlediameterrange) {
		this.particlediameterrange = particlediameterrange;
	}
      
   
	    /**
	     * Sets the value of thirdAntibodyReference
	     */
	public void setThirdantibodyreference(String thirdantibodyreference) {
		this.thirdantibodyreference = thirdantibodyreference;
	}
      
   
	    /**
	     * Sets the value of thirdAntibodyName
	     */
	public void setThirdantibodyname(String thirdantibodyname) {
		this.thirdantibodyname = thirdantibodyname;
	}
      
   
	    /**
	     * Sets the value of thirdAntibodyDilutionFactor
	     */
	public void setThirdantibodydilutionfactor(Integer thirdantibodydilutionfactor) {
		this.thirdantibodydilutionfactor = thirdantibodydilutionfactor;
	}
      
   
	    /**
	     * Sets the value of fourthAntibodyDilutionFactor
	     */
	public void setFourthantibodydilutionfactor(Integer fourthantibodydilutionfactor) {
		this.fourthantibodydilutionfactor = fourthantibodydilutionfactor;
	}
      
   
	    /**
	     * Sets the value of fourthAntibodyName
	     */
	public void setFourthantibodyname(String fourthantibodyname) {
		this.fourthantibodyname = fourthantibodyname;
	}
      
   
	    /**
	     * Sets the value of fourthAntibodyReference
	     */
	public void setFourthantibodyreference(String fourthantibodyreference) {
		this.fourthantibodyreference = fourthantibodyreference;
	}
      
   
	    /**
	     * Sets the value of resultTotalNuclearCellCount
	     */
	public void setResulttotalnuclearcellcount(Integer resulttotalnuclearcellcount) {
		this.resulttotalnuclearcellcount = resulttotalnuclearcellcount;
	}
      
   
	    /**
	     * Sets the value of resultLabelledNuclearCellCount
	     */
	public void setResultlabellednuclearcellcount(Integer resultlabellednuclearcellcount) {
		this.resultlabellednuclearcellcount = resultlabellednuclearcellcount;
	}
      
}

