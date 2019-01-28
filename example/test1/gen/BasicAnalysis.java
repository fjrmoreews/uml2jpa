
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  BasicAnalysis extends DataAnalysis  {
 //declarations

      /**
       * declaration technology_type
       */ 
  			@NotNull 
    
       public   String technology_type;
 

      /**
       * declaration measure1
       */ 
    
       public   Float measure1;
 

      /**
       * declaration score
       */ 
  			@Size(min=0) 
    
       public   Float score;
 

      /**
       * declaration id
       */ 
    
       public   Integer id;
 
//getter
 
      /**
       * Gets the value of technology_type
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@319988b0 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getTechnology_type() {
          return this.technology_type;
       }
 
 
      /**
       * Gets the value of measure1
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@25ddbbbb (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#Float)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#Float
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:Float
          
          
  
        
        
       */
       public  Float getMeasure1() {
          return this.measure1;
       }
 
 
      /**
       * Gets the value of score
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4ebea12c (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#Float)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#Float
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:Float
          
          
  
        
        
       */
       public  Float getScore() {
          return this.score;
       }
 
 
      /**
       * Gets the value of id
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6256ac4f (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:Integer
          
          
  
        
        
       */
       public  Integer getId() {
          return this.id;
       }
 
//setter
  
       /**
        * Sets the value of technology_type
        */
        public void setTechnology_type( String technology_type) {
           this.technology_type = technology_type;
        }
  
       /**
        * Sets the value of measure1
        */
        public void setMeasure1( Float measure1) {
           this.measure1 = measure1;
        }
  
       /**
        * Sets the value of score
        */
        public void setScore( Float score) {
           this.score = score;
        }
  
       /**
        * Sets the value of id
        */
        public void setId( Integer id) {
           this.id = id;
        }
}


//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@6326d182 (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@7fcbe147 (name: basicAnalysis, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@6326d182 (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]

