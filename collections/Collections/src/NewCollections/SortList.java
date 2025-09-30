package NewCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {

		List <Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee(10,"Siva",22,80000.00));
		employee.add(new Employee(20,"naveen",12,30000.00));
		employee.add(new Employee(30,"kiran",52,60000.00));
		employee.add(new Employee(50,"boopesh",2,90000.00));
		employee.add(new Employee(70,"Devil",32,30000.00));
   
		
   Collections.sort(employee, new Comparator<Employee>() {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o2.getName().compareTo(o1.getName()));
	}
	});
   System.out.println(employee);
   
   Collections.sort(employee,(o1,o2) -> (int)(o1.getName().compareTo(o2.getName())));
   
   System.out.println(employee);
   	}

}	
	class mySort implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o2.getSal()-o1.getSal());
		}
		
		
	}

