
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  ELISAStar extends EnzymaticActivityMeasurementsAnalysis  {
 //declarations

      /**
       * declaration tracer
       */ 
    
       public   String tracer;
 

      /**
       * declaration SensiThreshold
       */ 
    
       public   EFloat SensiThreshold;
 

      /**
       * declaration RefAC1
       */ 
    
       public   String RefAC1;
 

      /**
       * declaration RefAC2
       */ 
    
       public   String RefAC2;
 

      /**
       * declaration SampleDilution
       */ 
    
       public   EFloat SampleDilution;
 
//getter
 
      /**
       * Gets the value of tracer
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@33308786 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getTracer() {
          return this.tracer;
       }
 
 
      /**
       * Gets the value of SensiThreshold
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@a87f8ec (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  EFloat getSensiThreshold() {
          return this.sensiThreshold;
       }
 
 
      /**
       * Gets the value of RefAC1
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@63787180 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getRefAC1() {
          return this.refAC1;
       }
 
 
      /**
       * Gets the value of RefAC2
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@48e92c5c (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getRefAC2() {
          return this.refAC2;
       }
 
 
      /**
       * Gets the value of SampleDilution
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@22356acd (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
        * Sets the value of tracer
        */
        public void setTracer( String tracer) {
           this.tracer = tracer;
        }
  
       /**
        * Sets the value of SensiThreshold
        */
        public void setSensiThreshold( EFloat SensiThreshold) {
           this.SensiThreshold = SensiThreshold;
        }
  
       /**
        * Sets the value of RefAC1
        */
        public void setRefAC1( String RefAC1) {
           this.RefAC1 = RefAC1;
        }
  
       /**
        * Sets the value of RefAC2
        */
        public void setRefAC2( String RefAC2) {
           this.RefAC2 = RefAC2;
        }
  
       /**
        * Sets the value of SampleDilution
        */
        public void setSampleDilution( EFloat SampleDilution) {
           this.SampleDilution = SampleDilution;
        }
}



