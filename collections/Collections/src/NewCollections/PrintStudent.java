package NewCollections;

import java.util.*;

public class PrintStudent {
	public static void main(String[] args) {
	
		Map<Integer,Student> student= new HashMap<>();
		student.put(1,new Student("Siva","devil"));
		student.put(2,new Student("kiran","manju"));
		student.put(3, new Student("boopesh","gay"));
		System.out.println(student);
	}

}
