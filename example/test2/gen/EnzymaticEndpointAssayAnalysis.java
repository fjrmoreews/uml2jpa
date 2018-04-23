
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  EnzymaticEndpointAssayAnalysis extends EnzymaticActivityMeasurementsAnalysis  {
 //declarations

      /**
       * declaration Dilution
       */ 
    
       public   EFloat Dilution;
 
//getter
 
      /**
       * Gets the value of Dilution
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@291a7e3c (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  EFloat getDilution() {
          return this.dilution;
       }
 
//setter
  
       /**
        * Sets the value of Dilution
        */
        public void setDilution( EFloat Dilution) {
           this.Dilution = Dilution;
        }
}



