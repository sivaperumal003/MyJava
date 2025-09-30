package colectionPro;

import java.util.*;

public class StudentMark {

	public static void main(String[] args) {
		Map<String,Integer> mp=new HashMap<>();
		String[][] students = {
	            {"Alice", "85"},
	            {"Bob", "92"},
	            {"Charlie", "85"},
	            {"David", "75"},
	            {"Eve", "92"}
	        };

		Map<Integer,List<String>>ml=new HashMap<>();
		 
         for(String s[] :students) {
        	 
        	 String name =s[0];
        	 int mark=Integer.parseInt(s[1]);
        	 if(!ml.containsKey(mark)) {
        		 ml.put(mark, new ArrayList<>());
        		 
        		 
        	 }
        	 
        	 ml.get(mark).add(name);        	 
         }
		
		 for(Map.Entry<Integer,List<String>> ent :ml.entrySet()) {
			 System.out.println(ent.getKey()+"-->"+ent.getValue());
		 }

	}

}
