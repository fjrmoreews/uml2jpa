
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  ELISAanalysis extends EnzymaticActivityMeasurementsAnalysis  {
 //declarations

      /**
       * declaration PlatePlan
       */ 
    
       public   String PlatePlan;
 

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
       * Gets the value of PlatePlan
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@32a68f4f (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getPlatePlan() {
          return this.platePlan;
       }
 
 
      /**
       * Gets the value of SensiThreshold
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6eb2384f (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3a4621bd (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
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
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4ed5eb72 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
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
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@19b93fa8 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
        * Sets the value of PlatePlan
        */
        public void setPlatePlan( String PlatePlan) {
           this.PlatePlan = PlatePlan;
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



