import javax.validation.constraints.*;
 
	
 
 
 
 
 
public class  ELISAStar extends EnzymaticActivityMeasurementsAnalysis  {
 //declarations

      /**
       * declaration Tracer
       */ 
    
   
     private   String 
              	 tracer;
   
 

      /**
       * declaration SensiThreshold
       */ 
    
   
     private   float 
              	 sensiThreshold;
   
 

      /**
       * declaration RefAC1
       */ 
    
   
     private   String 
              	 refAC1;
   
 

      /**
       * declaration RefAC2
       */ 
    
   
     private   String 
              	 refAC2;
   
 

      /**
       * declaration SampleDilution
       */ 
    
   
     private   float 
              	 sampleDilution;
   
 
//getter
 
      /**
       * Gets the value of Tracer
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6eac4ff4 (name: String, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)
        typeName:String
        
          eProxyURI:
          
  eProxyURI:null        
          
  
        
        
       */
       public   String 
               	 getTracer() {
          return this.tracer;
       }
 
 
      /**
       * Gets the value of SensiThreshold
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@35b3d0b5 (name: EFloat, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)
        typeName:EFloat
        
          eProxyURI:
          
  eProxyURI:null        
          
  
        
        
       */
       public   float 
               	 getSensiThreshold() {
          return this.sensiThreshold;
       }
 
 
      /**
       * Gets the value of RefAC1
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6eac4ff4 (name: String, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)
        typeName:String
        
          eProxyURI:
          
  eProxyURI:null        
          
  
        
        
       */
       public   String 
               	 getRefAC1() {
          return this.refAC1;
       }
 
 
      /**
       * Gets the value of RefAC2
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6eac4ff4 (name: String, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)
        typeName:String
        
          eProxyURI:
          
  eProxyURI:null        
          
  
        
        
       */
       public   String 
               	 getRefAC2() {
          return this.refAC2;
       }
 
 
      /**
       * Gets the value of SampleDilution
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@35b3d0b5 (name: EFloat, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false)
        typeName:EFloat
        
          eProxyURI:
          
  eProxyURI:null        
          
  
        
        
       */
       public   float 
               	 getSampleDilution() {
          return this.sampleDilution;
       }
 
//setter
  
       /**
        * Sets the value of Tracer
        */
        public void setTracer(  String 
                               	 tracer) {
           this.tracer = tracer;
        }
  
       /**
        * Sets the value of SensiThreshold
        */
        public void setSensiThreshold(  float 
                                       	 sensiThreshold) {
           this.sensiThreshold = sensiThreshold;
        }
  
       /**
        * Sets the value of RefAC1
        */
        public void setRefAC1(  String 
                               	 refAC1) {
           this.refAC1 = refAC1;
        }
  
       /**
        * Sets the value of RefAC2
        */
        public void setRefAC2(  String 
                               	 refAC2) {
           this.refAC2 = refAC2;
        }
  
       /**
        * Sets the value of SampleDilution
        */
        public void setSampleDilution(  float 
                                       	 sampleDilution) {
           this.sampleDilution = sampleDilution;
        }
}


//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@a77d0b (name: extension_ExternalDocument, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@a77d0b (name: extension_ExternalDocument, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@633d97e5 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@5f27e2e1 (name: extension_ModelComponent, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@5f27e2e1 (name: extension_ModelComponent, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@1c71685c (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6dd491af (name: extension_ModelComponentArchive, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6dd491af (name: extension_ModelComponentArchive, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@1595b93b (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@401a4cab (name: extension_ModelComponentElementAlias, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@401a4cab (name: extension_ModelComponentElementAlias, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@7ec508fd (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@17dbaf50 (name: extension_access, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@17dbaf50 (name: extension_access, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@5b1c4572 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@5156f2a0 (name: extension_catch, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@5156f2a0 (name: extension_catch, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@23082fe0 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4802884b (name: extension_complete, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4802884b (name: extension_complete, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@306e1796 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7032fc1f (name: extension_create, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7032fc1f (name: extension_create, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@24d2bb7b (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1b5f8dad (name: extension_design pattern, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1b5f8dad (name: extension_design pattern, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@3f2ba568 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@2388e853 (name: extension_destroy, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@2388e853 (name: extension_destroy, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@46c04b70 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7f0541af (name: extension_destroyed, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7f0541af (name: extension_destroyed, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@4bb5f6f2 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@44b53bab (name: extension_disjoin, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@44b53bab (name: extension_disjoin, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@2e542f7a (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1e5c5030 (name: extension_exception, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1e5c5030 (name: extension_exception, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@67885e78 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1cd2b94d (name: extension_executable, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1cd2b94d (name: extension_executable, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@312e52b (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6565fb9a (name: extension_facade, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6565fb9a (name: extension_facade, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@43744344 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@69f89a50 (name: extension_flow, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@69f89a50 (name: extension_flow, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@60bb2342 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4b86fceb (name: extension_frameWork, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4b86fceb (name: extension_frameWork, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@5703a10f (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7f8c3d08 (name: extension_friend, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7f8c3d08 (name: extension_friend, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@68532f1e (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@39e6f90b (name: extension_impact_root, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@39e6f90b (name: extension_impact_root, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@43ecd16b (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@26060e7c (name: extension_impact_subroot, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@26060e7c (name: extension_impact_subroot, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@ffb5c9d (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@46b36c5e (name: extension_implementation, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@46b36c5e (name: extension_implementation, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@69967155 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@28c11c1f (name: extension_implementationClass, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@28c11c1f (name: extension_implementationClass, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@1c454842 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@72641ba9 (name: extension_implicit, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@72641ba9 (name: extension_implicit, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@fbc7625 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@13442c66 (name: extension_import, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@13442c66 (name: extension_import, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@39777e9 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@74938930 (name: extension_incomplete, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@74938930 (name: extension_incomplete, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@32cc009 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1c7513b2 (name: extension_instantiate, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1c7513b2 (name: extension_instantiate, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@5633c4e9 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1ef9a5 (name: extension_invariant, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1ef9a5 (name: extension_invariant, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@5a945664 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@5de742d2 (name: extension_library, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@5de742d2 (name: extension_library, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@7c580b52 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3c25ece2 (name: extension_manifestation, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3c25ece2 (name: extension_manifestation, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@1096c7f7 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@35c606c6 (name: extension_metaclass, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@35c606c6 (name: extension_metaclass, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@3ee41847 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@35854b94 (name: extension_metamodel, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@35854b94 (name: extension_metamodel, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@5dc7d73d (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3ce2424b (name: extension_new, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3ce2424b (name: extension_new, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@4f5afec2 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@578c5f79 (name: extension_ordered, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@578c5f79 (name: extension_ordered, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@3baca8f7 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@2809650c (name: extension_overlapping, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@2809650c (name: extension_overlapping, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@759dbd2c (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@61068c57 (name: extension_postcondition, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@61068c57 (name: extension_postcondition, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@666f7302 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@432d7d18 (name: extension_precondition, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@432d7d18 (name: extension_precondition, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@1880e16a (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@32dca52a (name: extension_primary, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@32dca52a (name: extension_primary, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@28b40472 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@46a46cd (name: extension_process, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@46a46cd (name: extension_process, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@611b611e (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@2a935d12 (name: extension_scenario, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@2a935d12 (name: extension_scenario, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@4cf1668c (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@656bfd35 (name: extension_secondary, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@656bfd35 (name: extension_secondary, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@3e55f831 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@61e6ad9d (name: extension_stub, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@61e6ad9d (name: extension_stub, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@4dbca66f (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@60a24515 (name: extension_subset, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@60a24515 (name: extension_subset, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@1216f6a3 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@15433ede (name: extension_subsystem, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@15433ede (name: extension_subsystem, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@4509f027 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1e17ff3e (name: extension_system, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1e17ff3e (name: extension_system, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@6a2fb6d2 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@5a27bf35 (name: extension_throw, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@5a27bf35 (name: extension_throw, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@7e4799ce (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@626b0ce9 (name: extension_topLevel, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@626b0ce9 (name: extension_topLevel, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@450fe100 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4247dea4 (name: extension_trace, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4247dea4 (name: extension_trace, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@2564e250 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@64b5e956 (name: extension_transient, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@64b5e956 (name: extension_transient, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@42b181ca (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4ac3e417 (name: extension_type, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4ac3e417 (name: extension_type, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@3525bd45 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6b65210c (name: extension_utility, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6b65210c (name: extension_utility, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@185b2913 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7f143741 (name: extension_xor, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7f143741 (name: extension_xor, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@5df8bac8 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@535d44dc (name: extension_class, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@535d44dc (name: extension_class, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@3df9f2ff (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@2032ee64 (name: extension_collaboration, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@2032ee64 (name: extension_collaboration, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@65d6ca68 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7c83a87e (name: extension_communication, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7c83a87e (name: extension_communication, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@5c81c026 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7fe84931 (name: extension_deployment, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7fe84931 (name: extension_deployment, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@1ea493d8 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1913d78c (name: extension_impact, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1913d78c (name: extension_impact, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@11a5f578 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@154138b0 (name: extension_object, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@154138b0 (name: extension_object, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@46d183bb (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7039046d (name: extension_state, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7039046d (name: extension_state, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@4cf9a1f5 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6daae253 (name: extension_usecase, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6daae253 (name: extension_usecase, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@122a0244 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@456fc21c (name: extension_related_diagram, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@456fc21c (name: extension_related_diagram, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@61f34d91 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@564105fa (name: extension_AutoDiagram, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@564105fa (name: extension_AutoDiagram, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@2c354bf (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6acac9d9 (name: extension_directory, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6acac9d9 (name: extension_directory, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@63ba8e45 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6bf3a571 (name: extension_file, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6bf3a571 (name: extension_file, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@460e1ac1 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1a261c39 (name: extension_url, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1a261c39 (name: extension_url, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@6fe44004 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@236f920a (name: extension_mail, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@236f920a (name: extension_mail, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@dee2ce7 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@441555b4 (name: extension_see_also, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@441555b4 (name: extension_see_also, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@d7f3d73 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6005ab9f (name: extension_document, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@6005ab9f (name: extension_document, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@477d7b93 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4857b446 (name: extension_JyMatrix, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4857b446 (name: extension_JyMatrix, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@32b61d95 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3cd10a08 (name: extension_impact_model, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3cd10a08 (name: extension_impact_model, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@53765026 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@2d826682 (name: extension_Infrastructure.AbstractDiagram, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@2d826682 (name: extension_Infrastructure.AbstractDiagram, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@5abaf100 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4bcab60 (name: extension_Standard.Association, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4bcab60 (name: extension_Standard.Association, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@3fbb2bb5 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@44c0f41 (name: extension_Standard.Attribute, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@44c0f41 (name: extension_Standard.Attribute, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@59123042 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@61d5532e (name: extension_Standard.Classifier, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@61d5532e (name: extension_Standard.Classifier, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@1453ed66 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@61140faa (name: extension_Infrastructure.Dependency, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@61140faa (name: extension_Infrastructure.Dependency, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@2251e3ce (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@62c92222 (name: extension_Infrastructure.ModelElement, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@62c92222 (name: extension_Infrastructure.ModelElement, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@57ee2951 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1cb66a44 (name: extension_Standard.ModelTree, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@1cb66a44 (name: extension_Standard.ModelTree, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@26da4d58 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@c95e928 (name: extension_Standard.Operation, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@c95e928 (name: extension_Standard.Operation, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@7e1e7e66 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@22ede660 (name: extension_Standard.UseCase, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@22ede660 (name: extension_Standard.UseCase, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@76e63a2a (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@8aa02ad (name: extension_Standard.AssociationEnd, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@8aa02ad (name: extension_Standard.AssociationEnd, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@44093cbd (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@37e2b801 (name: extension_Standard.Instance, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@37e2b801 (name: extension_Standard.Instance, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@7f4c3ee7 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3586843b (name: extension_Standard.ActivityNode, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3586843b (name: extension_Standard.ActivityNode, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@69b2a8c8 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@13736783 (name: extension_Standard.StateVertex, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@13736783 (name: extension_Standard.StateVertex, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@6c2fe566 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@65254d6e (name: extension_Analyst.AnalystItem, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@65254d6e (name: extension_Analyst.AnalystItem, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@7db3e1c6 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@18c97f5 (name: extension_Standard.ActivityGroup, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@18c97f5 (name: extension_Standard.ActivityGroup, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@67851794 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@38d2998f (name: extension_Standard.Behavior, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@38d2998f (name: extension_Standard.Behavior, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@517c8251 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3e297029 (name: extension_Standard.BpmnBaseElement, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3e297029 (name: extension_Standard.BpmnBaseElement, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@3e0a8786 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@44a50f23 (name: extension_Standard.Clause, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@44a50f23 (name: extension_Standard.Clause, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@648b5a29 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@5fb98335 (name: extension_Standard.CollaborationUse, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@5fb98335 (name: extension_Standard.CollaborationUse, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@983350e (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3e44b866 (name: extension_Standard.Constraint, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3e44b866 (name: extension_Standard.Constraint, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@1ebb9386 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@2abc0593 (name: extension_Standard.EnumerationLiteral, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@2abc0593 (name: extension_Standard.EnumerationLiteral, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@48bfb49c (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@a9e7736 (name: extension_Standard.InteractionFragment, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@a9e7736 (name: extension_Standard.InteractionFragment, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@66195094 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@64ea4dd (name: extension_Standard.ProvidedInterface, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@64ea4dd (name: extension_Standard.ProvidedInterface, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@4f15cb33 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@ce58c2f (name: extension_Standard.RequiredInterface, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@ce58c2f (name: extension_Standard.RequiredInterface, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@1d719406 (name: base_Element, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@43e70494 (name: extension_EPackage, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@43e70494 (name: extension_EPackage, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@32799569 (name: base_Package, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@abac319 (name: extension_Extend, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@abac319 (name: extension_Extend, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@3367655b (name: base_Generalization, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4a245640 (name: extension_EClass, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4a245640 (name: extension_EClass, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@396ebf11 (name: base_Class, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@35ad9a60 (name: extension_EClass, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@35ad9a60 (name: extension_EClass, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@657a47cb (name: base_Interface, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@5db6e6b (name: extension_EDataType, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@5db6e6b (name: extension_EDataType, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@525ae838 (name: base_PrimitiveType, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@788839aa (name: extension_EEnum, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@788839aa (name: extension_EEnum, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@86cde55 (name: base_Enumeration, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@23d5ccb3 (name: extension_EEnumLiteral, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@23d5ccb3 (name: extension_EEnumLiteral, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@403079bb (name: base_EnumerationLiteral, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@dcb4a3e (name: extension_EOperation, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@dcb4a3e (name: extension_EOperation, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@4cd8efc3 (name: base_Operation, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3326b317 (name: extension_EParameter, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3326b317 (name: extension_EParameter, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@ae30ac0 (name: base_Parameter, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@55124d92 (name: extension_EAttribute, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@55124d92 (name: extension_EAttribute, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@48102e5a (name: base_Property, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@74e86a7a (name: extension_EReference, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@74e86a7a (name: extension_EReference, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@24604919 (name: base_Property, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7317ca60 (name: extension_EClass, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7317ca60 (name: extension_EClass, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@6bbc23ef (name: base_DataType, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4823f44e (name: extension_ETypeParameter, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@4823f44e (name: extension_ETypeParameter, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@5f3b7eb7 (name: base_TemplateParameter, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@257daaad (name: extension_EGenericType, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@257daaad (name: extension_EGenericType, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@585cee9a (name: base_Class, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@27139154 (name: extension_EGenericType, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@27139154 (name: extension_EGenericType, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@1b76c694 (name: base_Interface, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7eb8cc70 (name: extension_EGenericType, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@7eb8cc70 (name: extension_EGenericType, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@7ed04c0d (name: base_DataType, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]
//AssociationImpl.getOwnedEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3f8d91b4 (name: extension_EClass, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.ExtensionEndImpl@3f8d91b4 (name: extension_EClass, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@48f4e87 (name: base_Association, visibility: <unset>) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]
//AssociationImpl.getNavigableOwnedEnds[]

