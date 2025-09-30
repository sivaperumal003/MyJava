package NewCollections;

import java.util.*;
public class iteratorList {

	public static void main(String[] args) {
 List<String> course= new ArrayList<>();
 course.add("C++");
 course.add("java");
 course.add("python");
 course.add("c#");
 course.add("html");
 
 for(int i=0;i<course.size();i++) {
	 System.out.println(course.get(i));
 }
 
 System.out.println("______________________________________________");
 for(String s:course) {
	 System.out.println(s);
 }
	 
 
 Iterator<String> iter =course.iterator();
 
	
	while(iter.hasNext()) {
		 String str =iter.next();
		 System.out.println(str);
		
	}
	 System.out.println("______________________________________________");
	 for(Iterator<String> i=course.iterator();i.hasNext();) {
		 String str=(String) i.next();
		 
		 System.out.println(str);
	 }
	 System.out.println("______________________________________________");
	 
	 course.stream().forEach(cour-> System.out.println(cour));
	 System.out.println("______________________________________________");
	 
	 course.stream().forEach((coust) ->  System.out.println(coust));
	}
}
