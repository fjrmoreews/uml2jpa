
package gen;
import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  ClassA   {
 //declarations
  
      /******************
       *0 !!!info classB 
    
     *2  public   ClassB classB;
     *3  org.eclipse.uml2.uml.internal.impl.PropertyImpl@21005f6c (name: classB, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
     *4  aggregation:none
     *****************/

      /**
       * declaration classB
       */ 
    
       public   ClassB classB;
 
  
      /******************
       *0 !!!info classC 
    
     *2  public   ClassC classC;
     *3  org.eclipse.uml2.uml.internal.impl.PropertyImpl@3faf2e7d (name: classC, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: shared, isDerived: false, isDerivedUnion: false, isID: false)
     *4  aggregation:shared
     *****************/

      /**
       * declaration classC
       */ 
    
       public   ClassC classC;
 
  
      /******************
       *0 !!!info classD 
    
     *2  public   ClassD classD;
     *3  org.eclipse.uml2.uml.internal.impl.PropertyImpl@76ba13c (name: classD, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)
     *4  aggregation:composite
     *****************/

      /**
       * declaration classD
       */ 
    
       public   ClassD classD;
 
  
      /******************
       *0 !!!info name 
     *1			@inc({n=1)} 
    
     *2  public   String name;
     *3  org.eclipse.uml2.uml.internal.impl.PropertyImpl@180e6ac4 (name: name, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: false, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
     *4  aggregation:none
     *****************/

      /**
       * declaration name
       */ 
  			@inc({n=1)} 
    
       public   String name;
 
  
      /******************
       *0 !!!info firstname 
    
     *2  public   String firstname;
     *3  org.eclipse.uml2.uml.internal.impl.PropertyImpl@4ebea12c (name: firstname, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: false, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
     *4  aggregation:none
     *****************/

      /**
       * declaration firstname
       */ 
    
       public   String firstname;
 
  
      /******************
       *0 !!!info zz 
     *1			@zzInConstraint 
    
     *2  public   String zz;
     *3  org.eclipse.uml2.uml.internal.impl.PropertyImpl@6256ac4f (name: zz, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: false, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)
     *4  aggregation:none
     *****************/

      /**
       * declaration zz
       */ 
  			@zzInConstraint 
    
       public   String zz;
 
//getter
 
      /**
       * Gets the value of classB
       
       class:class org.eclipse.uml2.uml.internal.impl.ClassImpl
        classS:ClassImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.ClassImpl@72bd06ca (name: ClassB, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
        typeName:ClassB
        
        
       */
       public  ClassB getClassB() {
          return this.classB;
       }
 
 
      /**
       * Gets the value of classC
       
       class:class org.eclipse.uml2.uml.internal.impl.ClassImpl
        classS:ClassImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.ClassImpl@3d08f3f5 (name: ClassC, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
        typeName:ClassC
        
        
       */
       public  ClassC getClassC() {
          return this.classC;
       }
 
 
      /**
       * Gets the value of classD
       
       class:class org.eclipse.uml2.uml.internal.impl.ClassImpl
        classS:ClassImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.ClassImpl@5b970f7 (name: ClassD, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
        typeName:ClassD
        
        
       */
       public  ClassD getClassD() {
          return this.classD;
       }
 
 
      /**
       * Gets the value of name
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7e242b4d (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getName() {
          return this.name;
       }
 
 
      /**
       * Gets the value of firstname
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2a1edad4 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getFirstname() {
          return this.firstname;
       }
 
 
      /**
       * Gets the value of zz
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@44c79f32 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getZz() {
          return this.zz;
       }
 
//setter
  
       /**
        * Sets the value of classB
        */
        public void setClassB( ClassB classB) {
           this.classB = classB;
        }
  
       /**
        * Sets the value of classC
        */
        public void setClassC( ClassC classC) {
           this.classC = classC;
        }
  
       /**
        * Sets the value of classD
        */
        public void setClassD( ClassD classD) {
           this.classD = classD;
        }
  
       /**
        * Sets the value of name
        */
        public void setName( String name) {
           this.name = name;
        }
  
       /**
        * Sets the value of firstname
        */
        public void setFirstname( String firstname) {
           this.firstname = firstname;
        }
  
       /**
        * Sets the value of zz
        */
        public void setZz( String zz) {
           this.zz = zz;
        }
}


//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@2c1b9e4b (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@21005f6c (name: classB, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@2c1b9e4b (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@226642a5 (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@3faf2e7d (name: classC, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: shared, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@226642a5 (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@625e134e (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@76ba13c (name: classD, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@625e134e (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]

