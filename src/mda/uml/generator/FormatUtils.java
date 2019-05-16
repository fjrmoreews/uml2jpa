package mda.uml.generator;

import java.util.List;

import javax.validation.constraints.Size;
import org.eclipse.uml2.uml.internal.impl.PropertyImpl;
import javax.measure.*;

public class FormatUtils {
/*
 has unit: g/100g
min>0
nullable: NA, LD, LQ
------------------------------
has unit: µm²
-------------------------------
has unit: mg
min>0
-------------------------------


 */
 
	public static String testformat(String v){
		
		return "TEST_"+v+"_TEST";
	}
	
	public static String displayClass(Object o){
		return o.getClass().getName() ;
	}
	
	
	public static void main(String[] args) {
		 //String v="max = 10";
		 String v="<10";
		 System.out.println(extractAfterVal(v, "<"));;
	//	String a="has unit: µmole/ml\nmin>0\nnullable: NA, LD, LQ";
	//	 String v=anyAnnotSplit(a);
	//	 System.out.println(v);
				
	}
	 
	public static String anyAnnot(String v, DataSize sz){
		
		String s=null;
		// @AssertTrue
		String vv=v.trim().toLowerCase().replaceAll("\\s", "");
		if(vv.contains("nullable")){		
			s= "@Null";
		}
		if(vv.contains("unit:")){
			String unit=extractUnitVal(vv, "unit:");
			 
			s= "@CustomUnit(value=\""+unit+"\" )";
		}

		
		if(vv.contains(">") || vv.contains("min")){		
			s=extractAfterVal(vv, ">");
			if(s==null){
				s=extractAfterVal(vv, "min=");
			}
			
			if(s!=null){
		    sz.min=s;
		    sz.valid=true;
		    System.out.println("sz.valid=true");
			}
		    return null;
		    
		}
		if(vv.contains("<") ||   vv.contains("max")){
			s=extractAfterVal(vv, "<");
			if(s==null){
				s=extractAfterVal(vv, "max=");
			}
			if(s!=null){
			sz.max=s;
			sz.valid=true;
			System.out.println("sz.valid=true");
			}
			return null;
		}
		if(vv.contains("xref") || vv.contains("ordered")){
			s="@"+v;
		}
		if(s==null){
			s="//@"+v;
		}
		System.out.println("anyAnnot:"+v+":"+s);
		return s;
	}
	
	public static String sizeAnnot(DataSize sz){
		String s0="";
		//"min = 10, max = 200";
		if(sz.min!=null){
			if(s0.length()>0){
				s0=s0+",";
			}
			s0="min = "+sz.min+" ";
		}
		
		
		if(sz.max!=null){
			if(s0.length()>0){
				s0=s0+",";
			}
			s0="max = "+sz.max+" ";
		}
		String s="@Size("+s0+")";
		 /*  @Size(min = 10, max = 200, message  = "About Me must be between 10 and 200 characters")*/
		return s;
	}

	private static String extractAfterVal(String v, String chr) {
		if(v.indexOf(chr)>=0){
		 
			String r= v.substring(v.indexOf(chr)+chr.length(),v.length());
	 
			return r;
		}else{
			return null;
		}
	
	}
	private static String extractUnitVal(String v, String chr) {
		if(v.indexOf(chr)>=0){
		 
			String r= v.substring(v.indexOf(chr)+5,v.length());
	 
			return r;
		}else{
			return null;
		}
	
	}
	/*
	       [%for(prop in self.getRedefinedProperties()){%]
         === [%=futils.displayClass(prop)%] 
        	   @[%=prop.name%] 
               [%=futils.anyAnnotSplit(prop.name)%]
      [%} %]
	 */
	 
	  public static String anyAnnotSplitList(List<PropertyImpl> redefinedProperties ){
		  String r="";
		  for(PropertyImpl prop : redefinedProperties ){
			  String v=anyAnnotSplit(prop.getName());
			  System.out.println("==<<HARD_DEBUG:prop.getName"+prop.getName()+">>");
		      r+= v;
		  }
		  return r;
	  }
    public static String anyAnnotSplit(String name){
    	DataSize sz= new DataSize();
    	
    	String r="";
    	if(!name.contains("<Enter constraint text here>")){
	    	 for(  String pname : name.trim().split("\\n")  ){
	    	         
	    	         String a=anyAnnot(pname,sz);
	    	         if(a!=null){
	    	          r+=a+"\n";
	    	         }
	    	          
	    	 }
	    	  if(sz.valid==true){
	    		  System.out.println("$$S");
	    		  r+= sizeAnnot(sz);
	    	  }
    	   }
    	System.out.println("<<HARD_DEBUG:"+r+">>");
		return r;
	}
	
}
