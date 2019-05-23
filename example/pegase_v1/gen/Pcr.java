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
public class Pcr extends GeneralAnalysis {
 //declarations
	    /******************
	     *0 !!!info forwardPrimerName 
	  
	   *2 public String forwardPrimerName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration forwardPrimerName
	   
	     */ 
	   
	      
	      @Info(description="NomAmorceSens")
	      public String forwardPrimerName;
  
	    /******************
	     *0 !!!info forwardPrimerSequence 
	  
	   *2 public String forwardPrimerSequence;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration forwardPrimerSequence
	   
	     */ 
	   
	      
	      @Info(description="SequenceAmorceSens")
	      public String forwardPrimerSequence;
  
	    /******************
	     *0 !!!info forwardPrimerTm 
	  
	   *2 public EFloat forwardPrimerTm;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration forwardPrimerTm
	   
	     */ 
	   
	      
	      @Info(description="TmArmorceSens")
	      public Float forwardPrimerTm;
  
	    /******************
	     *0 !!!info reversePrimerName 
	  
	   *2 public String reversePrimerName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration reversePrimerName
	   
	     */ 
	   
	      
	      @Info(description="NomAmorcesAntisens")
	      public String reversePrimerName;
  
	    /******************
	     *0 !!!info reversePrimerSequence 
	  
	   *2 public String reversePrimerSequence;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration reversePrimerSequence
	   
	     */ 
	   
	      
	      @Info(description="SequenceAmorcesAntisens")
	      public String reversePrimerSequence;
  
	    /******************
	     *0 !!!info ReversePrimerTm 
	  
	   *2 public EFloat ReversePrimerTm;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration ReversePrimerTm
	   
	     */ 
	   
	      
	      @Info(description="TmAmorcesAntisens")
	      public Float reversePrimerTm;
  
	    /******************
	     *0 !!!info expectedAmpliconSize  
	   *1 @has unit: bp KISS
	  
	   *2 public Integer expectedAmpliconSize ;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration expectedAmpliconSize 
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: bp */ 
	      @CustomUnit(value="bp" )
	      @Info(description="TailleTheoriqueAmplicon")
	      public Integer expectedAmpliconSize ;
  
	    /******************
	     *0 !!!info pcrProgram 
	  
	   *2 public String pcrProgram;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration pcrProgram
	   
	     */ 
	   
	      
	      @Info(description="ProgrammePCR")
	      public String pcrProgram;
  
	    /******************
	     *0 !!!info targetSequenceName 
	  
	   *2 public String targetSequenceName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration targetSequenceName
	   
	     */ 
	   
	      
	      @Info(description="NomSequenceCible")
	      public String targetSequenceName;
  
	    /******************
	     *0 !!!info templateAmount 
	  
	   *2 public Integer templateAmount;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration templateAmount
	   
	     */ 
	   
	      
	      @Info(description="QuantiteMatrice")
	      public Integer templateAmount;
  
//getter
 
	    /**
	     * Gets the value of forwardPrimerName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2320fa6f (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getForwardPrimerName() {
		return this.forwardPrimerName;
	}
      
 
	    /**
	     * Gets the value of forwardPrimerSequence
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@53f0a4cb (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getForwardPrimerSequence() {
		return this.forwardPrimerSequence;
	}
      
 
	    /**
	     * Gets the value of forwardPrimerTm
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@616fe72b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getForwardPrimerTm() {
		return this.forwardPrimerTm;
	}
      
 
	    /**
	     * Gets the value of reversePrimerName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7e5d9a50 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getReversePrimerName() {
		return this.reversePrimerName;
	}
      
 
	    /**
	     * Gets the value of reversePrimerSequence
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@fcb4004 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getReversePrimerSequence() {
		return this.reversePrimerSequence;
	}
      
 
	    /**
	     * Gets the value of ReversePrimerTm
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2dd29a59 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getReversePrimerTm() {
		return this.reversePrimerTm;
	}
      
 
	    /**
	     * Gets the value of expectedAmpliconSize 
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7966baa7 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getExpectedAmpliconSize () {
		return this.expectedAmpliconSize ;
	}
      
 
	    /**
	     * Gets the value of pcrProgram
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2d36e77e (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getPcrProgram() {
		return this.pcrProgram;
	}
      
 
	    /**
	     * Gets the value of targetSequenceName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@366c4480 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTargetSequenceName() {
		return this.targetSequenceName;
	}
      
 
	    /**
	     * Gets the value of templateAmount
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5cdd09b1 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getTemplateAmount() {
		return this.templateAmount;
	}
      
//setter
   
	    /**
	     * Sets the value of forwardPrimerName
	     */
	public void setForwardPrimerName(String forwardPrimerName) {
		this.forwardPrimerName = forwardPrimerName;
	}
      
   
	    /**
	     * Sets the value of forwardPrimerSequence
	     */
	public void setForwardPrimerSequence(String forwardPrimerSequence) {
		this.forwardPrimerSequence = forwardPrimerSequence;
	}
      
   
	    /**
	     * Sets the value of forwardPrimerTm
	     */
	public void setForwardPrimerTm(Float forwardPrimerTm) {
		this.forwardPrimerTm = forwardPrimerTm;
	}
      
   
	    /**
	     * Sets the value of reversePrimerName
	     */
	public void setReversePrimerName(String reversePrimerName) {
		this.reversePrimerName = reversePrimerName;
	}
      
   
	    /**
	     * Sets the value of reversePrimerSequence
	     */
	public void setReversePrimerSequence(String reversePrimerSequence) {
		this.reversePrimerSequence = reversePrimerSequence;
	}
      
   
	    /**
	     * Sets the value of ReversePrimerTm
	     */
	public void setReversePrimerTm(Float reversePrimerTm) {
		this.reversePrimerTm = reversePrimerTm;
	}
      
   
	    /**
	     * Sets the value of expectedAmpliconSize 
	     */
	public void setExpectedAmpliconSize (Integer expectedAmpliconSize ) {
		this.expectedAmpliconSize  = expectedAmpliconSize ;
	}
      
   
	    /**
	     * Sets the value of pcrProgram
	     */
	public void setPcrProgram(String pcrProgram) {
		this.pcrProgram = pcrProgram;
	}
      
   
	    /**
	     * Sets the value of targetSequenceName
	     */
	public void setTargetSequenceName(String targetSequenceName) {
		this.targetSequenceName = targetSequenceName;
	}
      
   
	    /**
	     * Sets the value of templateAmount
	     */
	public void setTemplateAmount(Integer templateAmount) {
		this.templateAmount = templateAmount;
	}
      
}

