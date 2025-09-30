package NewCollections;

import java.util.*;

public class Mapps {

	public static void main(String[] args) {
     Map<String,Integer> values=new HashMap<String,Integer>();
     
     values.put("one", 1);
     values.put("two", 2);
     values.put("three", 3);
     values.put("four", 4);
     values.put("five", 5);
     values.put("six", 6);
     System.out.println(values.get("five"));
     Set<String> set=values.keySet();
     System.out.println(set);
     Collection<Integer> coll=values.values();
    System.out.println(coll); 
    
    for(Map.Entry<String, Integer> ent:values.entrySet()) {
    	
    	System.out.println(ent.getKey()+" "+ent.getValue());
    }
    
    Set<Map.Entry<String, Integer>> entr =values.entrySet();
    Iterator<Map.Entry<String, Integer>> iter=entr.iterator();
    while(iter.hasNext()) {
    	Map.Entry<String, Integer> ent=iter.next();
    	System.out.println(ent.getKey()+"   "+ent.getValue());
    }
    values.forEach((k,v)->{
    	System.out.println(k+"  "+v);
    	
    });;
     
	}

}
