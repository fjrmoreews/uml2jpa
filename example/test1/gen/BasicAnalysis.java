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
import uml2rdf.utils.*;
 
	
@Namespace("http://inra/pegase#")
public class BasicAnalysis extends DataAnalysis {
 //declarations
	    /******************
	     *0 !!!info technology_type 
	   *1 @NotNull KISS
	  
	   *2 public String technology_type;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration technology_type
	     */ 
	@NotNull
	public String technology_type;
  
	    /******************
	     *0 !!!info measure1 
	  
	   *2 public Float measure1;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#Float 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Float
	   *7   	 **
	    
	   *****************/
	
	    /**
	     * declaration measure1
	     */ 
	public  measure1;
  
	    /******************
	     *0 !!!info score 
	   *1 @Size(min=0) KISS
	  
	   *2 public Float score;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#Float 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Float
	   *7   	 **
	    
	   *****************/
	
	    /**
	     * declaration score
	     */ 
	@Size(min=0)
	public  score;
  
	    /******************
	     *0 !!!info id 
	  
	   *2 public Integer id;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration id
	     */ 
	public Integer id;
  
//getter
 
	    /**
	     * Gets the value of technology_type
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@62010f5c (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTechnology_type() {
		return this.technology_type;
	}
      
 
	    /**
	     * Gets the value of measure1
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@67d18ed7 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#Float)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#Float
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:Float
	      
	     */
	public  getMeasure1() {
		return this.measure1;
	}
      
 
	    /**
	     * Gets the value of score
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@132e0cc (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#Float)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#Float
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:Float
	      
	     */
	public  getScore() {
		return this.score;
	}
      
 
	    /**
	     * Gets the value of id
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@106cc338 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getId() {
		return this.id;
	}
      
//setter
   
	    /**
	     * Sets the value of technology_type
	     */
	public void setTechnology_type(String technology_type) {
		this.technology_type = technology_type;
	}
      
   
	    /**
	     * Sets the value of measure1
	     */
	public void setMeasure1( measure1) {
		this.measure1 = measure1;
	}
      
   
	    /**
	     * Sets the value of score
	     */
	public void setScore( score) {
		this.score = score;
	}
      
   
	    /**
	     * Sets the value of id
	     */
	public void setId(Integer id) {
		this.id = id;
	}
      

	public List<BasicAnalysis> basicanalysis = new ArrayList<BasicAnalysis> ();

//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@6cc558c6 (name: basicAnalysis, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@27216cd (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]

}

