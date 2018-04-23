
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  FACSAnalysis extends FlowCytometryAnalysis  {
 //declarations

      /**
       * declaration CellCount
       */ 
    
       public   Integer CellCount;
 
//getter
 
      /**
       * Gets the value of CellCount
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5f354bcf (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
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
        * Sets the value of CellCount
        */
        public void setCellCount( Integer CellCount) {
           this.CellCount = CellCount;
        }
}



