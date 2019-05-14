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
public class Animal  {
 //declarations
  
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
  
	    /******************
	     *0 !!!info legacyid 
	  
	   *2 public String legacyid;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration legacyid
	     */ 
	public String legacyid;
  
	    /******************
	     *0 !!!info species 
	  
	   *2 public String species;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration species
	     */ 
	public String species;
  
//getter
 
	    /**
	     * Gets the value of id
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7c8c9a05 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getId() {
		return this.id;
	}
      
 
	    /**
	     * Gets the value of legacyid
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5c2375a9 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getLegacyid() {
		return this.legacyid;
	}
      
 
	    /**
	     * Gets the value of species
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@78d6692f (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSpecies() {
		return this.species;
	}
      
//setter
      
   
	    /**
	     * Sets the value of id
	     */
	public void setId(Integer id) {
		this.id = id;
	}
      
   
	    /**
	     * Sets the value of legacyid
	     */
	public void setLegacyid(String legacyid) {
		this.legacyid = legacyid;
	}
      
   
	    /**
	     * Sets the value of species
	     */
	public void setSpecies(String species) {
		this.species = species;
	}
      

	public List<BasicAnalysis> basicanalysis = new ArrayList<BasicAnalysis> ();

//AssociationImpl.getMemberEnds:[org.eclipse.uml2.uml.internal.impl.PropertyImpl@6cc558c6 (name: basicAnalysis, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: composite, isDerived: false, isDerivedUnion: false, isID: false), org.eclipse.uml2.uml.internal.impl.PropertyImpl@27216cd (name: <unset>, visibility: public) (isLeaf: false) (isStatic: false) (isOrdered: false, isUnique: true, isReadOnly: false) (aggregation: none, isDerived: false, isDerivedUnion: false, isID: false)]

}

