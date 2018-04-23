
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  ProgressiveCurveExperimentAnalysis extends EnzymaticActivityMeasurementsAnalysis  {
 //declarations

      /**
       * declaration MeasurementTime
       */ 
    
       public   EFloat MeasurementTime;
 

      /**
       * declaration Frequence
       */ 
    
       public   EFloat Frequence;
 
//getter
 
      /**
       * Gets the value of MeasurementTime
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7a362b6b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  EFloat getMeasurementTime() {
          return this.measurementTime;
       }
 
 
      /**
       * Gets the value of Frequence
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5a2d131d (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  EFloat getFrequence() {
          return this.frequence;
       }
 
//setter
  
       /**
        * Sets the value of MeasurementTime
        */
        public void setMeasurementTime( EFloat MeasurementTime) {
           this.MeasurementTime = MeasurementTime;
        }
  
       /**
        * Sets the value of Frequence
        */
        public void setFrequence( EFloat Frequence) {
           this.Frequence = Frequence;
        }
}



