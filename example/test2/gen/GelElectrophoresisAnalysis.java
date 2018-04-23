
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  GelElectrophoresisAnalysis extends ElectrophoresisAnalysis  {
 //declarations

      /**
       * declaration GelType
       */ 
    
       public   String GelType;
 

      /**
       * declaration Program
       */ 
    
       public   String Program;
 

      /**
       * declaration QtDepositedProt
       */ 
    
       public   EFloat QtDepositedProt;
 

      /**
       * declaration ProtExtracType
       */ 
    
       public   String ProtExtracType;
 
//getter
 
      /**
       * Gets the value of GelType
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@336f1079 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getGelType() {
          return this.gelType;
       }
 
 
      /**
       * Gets the value of Program
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@34158c08 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getProgram() {
          return this.program;
       }
 
 
      /**
       * Gets the value of QtDepositedProt
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@52c3cb31 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  EFloat getQtDepositedProt() {
          return this.qtDepositedProt;
       }
 
 
      /**
       * Gets the value of ProtExtracType
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@53941c2f (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getProtExtracType() {
          return this.protExtracType;
       }
 
//setter
  
       /**
        * Sets the value of GelType
        */
        public void setGelType( String GelType) {
           this.GelType = GelType;
        }
  
       /**
        * Sets the value of Program
        */
        public void setProgram( String Program) {
           this.Program = Program;
        }
  
       /**
        * Sets the value of QtDepositedProt
        */
        public void setQtDepositedProt( EFloat QtDepositedProt) {
           this.QtDepositedProt = QtDepositedProt;
        }
  
       /**
        * Sets the value of ProtExtracType
        */
        public void setProtExtracType( String ProtExtracType) {
           this.ProtExtracType = ProtExtracType;
        }
}



