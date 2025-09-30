package colectionPro;

import java.util.*;

public class Splitstr {

	public static void main(String[] args) {
       
		String s="apple banana carrot banana   carrot apple banana carrot apple ";
		
		Splitstring(s);
	}
     
	
	 static void Splitstring(String s) {
		 
		 String sw[]=s.trim().split("\\s+");
		 Map<String,Integer> mp=new HashMap<>();
		 for(String i : sw) {
			 mp.put(i, mp.getOrDefault(i, 0)+1);
			 
		 }
		 
		 for(Map.Entry<String, Integer> ent :mp.entrySet()) {
			 System.out.println(ent.getKey()+"   "+ent.getValue());
		 }
		 
	 }
}
