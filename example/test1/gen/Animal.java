
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  Animal   {
 //declarations

      /**
       * declaration basicAnalysis
       */ 
    
       public   BasicAnalysis basicAnalysis;
 

      /**
       * declaration id
       */ 
    
       public   Integer id;
 

      /**
       * declaration legacyid
       */ 
    
       public   String legacyid;
 

      /**
       * declaration species
       */ 
    
       public   String species;
 
//getter
 
      /**
       * Gets the value of basicAnalysis
       
       class:class org.eclipse.uml2.uml.internal.impl.ClassImpl
        classS:ClassImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.ClassImpl@29ef6856 (name: basicAnalysis, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
        typeName:basicAnalysis
        
        
       */
       public  BasicAnalysis getBasicAnalysis() {
          return this.basicAnalysis;
       }
 
 
      /**
       * Gets the value of id
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@fd0e5b6 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:Integer
          
          
  
        
        
       */
       public  Integer getId() {
          return this.id;
       }
 
 
      /**
       * Gets the value of legacyid
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@36b0fcd5 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getLegacyid() {
          return this.legacyid;
       }
 
 
      /**
       * Gets the value of species
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@475835b1 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getSpecies() {
          return this.species;
       }
 
//setter
  
       /**
        * Sets the value of basicAnalysis
        */
        public void setBasicAnalysis( BasicAnalysis basicAnalysis) {
           this.basicAnalysis = basicAnalysis;
        }
  
       /**
        * Sets the value of id
        */
        public void setId( Integer id) {
           this.id = id;
        }
  
       /**
        * Sets the value of legacyid
        */
        public void setLegacyid( String legacyid) {
           this.legacyid = legacyid;
        }
  
       /**
        * Sets the value of species
        */
        public void setSpecies( String species) {
           this.species = species;
        }
}


//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@226642a5 (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@2c1b9e4b (name: basicAnalysis, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@226642a5 (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]

