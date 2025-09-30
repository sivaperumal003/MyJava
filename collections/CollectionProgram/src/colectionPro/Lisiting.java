package colectionPro;

import java.util.*;

public class Lisiting {
	
	public static void main(String[] args) {
		List<Employee> ep=new ArrayList<>();
		ep.add(new Employee(21,"siva",23));
		ep.add(new Employee(23,"shha",23));
		ep.add(new Employee(24,"shanaa",2));
		ep.add(new Employee(27,"sivanii",24));
		ep.add(new Employee(13,"siva",93));
		for(Object o:ep) {
			System.out.println(o);
		}
	}
	

}
