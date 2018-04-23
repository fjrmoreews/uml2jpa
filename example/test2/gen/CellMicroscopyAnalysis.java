
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  CellMicroscopyAnalysis extends ImagingAnalysis  {
 //declarations

      /**
       * declaration DilutionFactor
       */ 
    
       public   EFloat DilutionFactor;
 

      /**
       * declaration CellCount
       */ 
    
       public   Integer CellCount;
 
//getter
 
      /**
       * Gets the value of DilutionFactor
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@27216cd (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  EFloat getDilutionFactor() {
          return this.dilutionFactor;
       }
 
 
      /**
       * Gets the value of CellCount
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@8576fa0 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:Integer
          
          
  
        
        
       */
       public  Integer getCellCount() {
          return this.cellCount;
       }
 
//setter
  
       /**
        * Sets the value of DilutionFactor
        */
        public void setDilutionFactor( EFloat DilutionFactor) {
           this.DilutionFactor = DilutionFactor;
        }
  
       /**
        * Sets the value of CellCount
        */
        public void setCellCount( Integer CellCount) {
           this.CellCount = CellCount;
        }
}



