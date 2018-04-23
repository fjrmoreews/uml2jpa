
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  AIAanalysis extends FluorescenceAnalysis  {
 //declarations

      /**
       * declaration CalibPrecGammeBlanc
       */ 
    
       public   String CalibPrecGammeBlanc;
 

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
       * Gets the value of CalibPrecGammeBlanc
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@10cf09e8 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getCalibPrecGammeBlanc() {
          return this.calibPrecGammeBlanc;
       }
 
 
      /**
       * Gets the value of SampleVol
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@ee86bcb (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7f132176 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
        * Sets the value of CalibPrecGammeBlanc
        */
        public void setCalibPrecGammeBlanc( String CalibPrecGammeBlanc) {
           this.CalibPrecGammeBlanc = CalibPrecGammeBlanc;
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



