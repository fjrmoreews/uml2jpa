
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  ElectrochemicalMeasurementAnalysis extends GeneralAnalysis  {
 //declarations

      /**
       * declaration SampleVol
       */ 
    
       public   EFloat SampleVol;
 
//getter
 
      /**
       * Gets the value of SampleVol
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@146dfe6 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  EFloat getSampleVol() {
          return this.sampleVol;
       }
 
//setter
  
       /**
        * Sets the value of SampleVol
        */
        public void setSampleVol( EFloat SampleVol) {
           this.SampleVol = SampleVol;
        }
}



