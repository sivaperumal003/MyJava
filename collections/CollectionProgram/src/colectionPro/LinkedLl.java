package colectionPro;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedLl {

	public static void main(String[] args) {
     String s="aabccb";
     System.out.println(firstRep(s));
	}
	
	static char firstRep(String s) {
		
		LinkedHashMap<Character, Integer> lh=new LinkedHashMap<>();
		for(char ch :s.toCharArray()) {
			lh.put(ch, lh.getOrDefault(ch, 0)+1);
			
		}
		    for(Map.Entry<Character, Integer> entries: lh.entrySet()) {
		    	
		    	if(entries.getValue()==1) {
		    		return entries.getKey();
		    	}
		    }
		
		
		
		
		
		return '-';
		
	}
	

}
