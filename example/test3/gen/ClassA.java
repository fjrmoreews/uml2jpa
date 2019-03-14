package gen;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import thewebsemantic.Id;
import thewebsemantic.RdfProperty;
import thewebsemantic.Namespace;
import com.hp.hpl.jena.sparql.vocabulary.FOAF;
import thewebsemantic.binding.Jenabean;
import thewebsemantic.binding.RdfBean;
 
	
@Namespace("http://inra/pegase#")
public class ClassA extends ClassE {
 //declarations
	    /******************
	     *0 !!!info classB 
	  
	   *2 public ClassB classB;
	   *3 type.name : ClassB
	   *4 type.name(proxyURL) :  
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.ClassImpl
	   *6 myType: ClassB
	   *7 		class
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration classB
	     */ 
	public ClassB classb;
  
  
  
	    /******************
	     *0 !!!info age 
	  
	   *2 public Integer age;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration age
	     */ 
	public Integer age;
  
	    /******************
	     *0 !!!info zz 
	   *1 @RdfProperty(FOAF.NS+"zzContraint") KISS
	  
	   *2 public EFloat zz;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration zz
	     */ 
	@RdfProperty(FOAF.NS+"zzContraint")
	public Float zz;
  
	    /******************
	     *0 !!!info dz 
	  
	   *2 public EDouble dz;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDouble 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EDouble
	   *7 		double
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration dz
	     */ 
	public Double dz;
  
	    /******************
	     *0 !!!info Date 
	  
	   *2 public EDate Date;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EDate
	   *7 		date
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Date
	     */ 
	public Date date;
  
//getter
 
	    /**
	     * Gets the value of classB
	     
	     class:class org.eclipse.uml2.uml.internal.impl.ClassImpl
	      classS:ClassImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.ClassImpl@5f2f577 (name: ClassB, visibility: <unset>) (isLeaf: false, isAbstract: false, isFinalSpecialization: false) (isActive: false)
	      typeName:ClassB
	      
	      
	     */
	public ClassB getClassb() {
		return this.classb;
	}
      
 
	    /**
	     * Gets the value of age
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4c168660 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getAge() {
		return this.age;
	}
      
 
	    /**
	     * Gets the value of zz
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@77192705 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getZz() {
		return this.zz;
	}
      
 
	    /**
	     * Gets the value of dz
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7e809b79 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDouble)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDouble
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EDouble
	      
	     */
	public Double getDz() {
		return this.dz;
	}
      
 
	    /**
	     * Gets the value of Date
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@625e134e (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EDate
	      
	     */
	public Date getDate() {
		return this.date;
	}
      
//setter
   
	    /**
	     * Sets the value of classB
	     */
	public void setClassb(ClassB classb) {
		this.classb = classb;
	}
      
      
      
   
	    /**
	     * Sets the value of age
	     */
	public void setAge(Integer age) {
		this.age = age;
	}
      
   
	    /**
	     * Sets the value of zz
	     */
	public void setZz(Float zz) {
		this.zz = zz;
	}
      
   
	    /**
	     * Sets the value of dz
	     */
	public void setDz(Double dz) {
		this.dz = dz;
	}
      
   
	    /**
	     * Sets the value of Date
	     */
	public void setDate(Date date) {
		this.date = date;
	}
      

	public List<ClassC> classc = new ArrayList<ClassC> ();

//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@1536602f (name: classC, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: shared, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@30ea8c23 (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]


	public List<ClassD> classd = new ArrayList<ClassD> ();

//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@2a1edad4 (name: classD, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@611df6e3 (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]

}

