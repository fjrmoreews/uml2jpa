
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  LIAanalysis extends LuminescenceAnalysis  {
 //declarations

      /**
       * declaration SensiThreshold
       */ 
    
       public   EFloat SensiThreshold;
 

      /**
       * declaration SampleVol
       */ 
    
       public   EFloat SampleVol;
 

      /**
       * declaration SampleDilution
       */ 
    
       public   EFloat SampleDilution;
 
//getter
 
      /**
       * Gets the value of SensiThreshold
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5460cf3a (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  EFloat getSensiThreshold() {
          return this.sensiThreshold;
       }
 
 
      /**
       * Gets the value of SampleVol
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2e6a5539 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  EFloat getSampleVol() {
          return this.sampleVol;
       }
 
 
      /**
       * Gets the value of SampleDilution
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6d025197 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  EFloat getSampleDilution() {
          return this.sampleDilution;
       }
 
//setter
  
       /**
        * Sets the value of SensiThreshold
        */
        public void setSensiThreshold( EFloat SensiThreshold) {
           this.SensiThreshold = SensiThreshold;
        }
  
       /**
        * Sets the value of SampleVol
        */
        public void setSampleVol( EFloat SampleVol) {
           this.SampleVol = SampleVol;
        }
  
       /**
        * Sets the value of SampleDilution
        */
        public void setSampleDilution( EFloat SampleDilution) {
           this.SampleDilution = SampleDilution;
        }
}



