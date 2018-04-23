
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  MicroarrayAnalysis extends GeneralAnalysis  {
 //declarations

      /**
       * declaration MarkingType
       */ 
    
       public   String MarkingType;
 

      /**
       * declaration AnnotCardConnexion
       */ 
    
       public   String AnnotCardConnexion;
 
//getter
 
      /**
       * Gets the value of MarkingType
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@39a2bb97 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getMarkingType() {
          return this.markingType;
       }
 
 
      /**
       * Gets the value of AnnotCardConnexion
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@8c3619e (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getAnnotCardConnexion() {
          return this.annotCardConnexion;
       }
 
//setter
  
       /**
        * Sets the value of MarkingType
        */
        public void setMarkingType( String MarkingType) {
           this.MarkingType = MarkingType;
        }
  
       /**
        * Sets the value of AnnotCardConnexion
        */
        public void setAnnotCardConnexion( String AnnotCardConnexion) {
           this.AnnotCardConnexion = AnnotCardConnexion;
        }
}



