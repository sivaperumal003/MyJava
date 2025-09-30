package NewCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
 
		 LinkedList<String> list=new LinkedList<>();
		 
		 list.add("Mango");
		 list.add("kiran");
		 list.add("Boobs");
		 list.add("Siva");
		 list.add("Manjukiran");
		 
		 String s=list.getLast();
		 int n=list.lastIndexOf(s);
		 System.out.println(n);
		 
		 for(int i=0;i<=n;i++) {
			 System.out.println(list.get(i));
		 }
		 System.out.println("--------------------------------------------");
		 for(String obj:list) {
			 System.out.println(obj);
		 }
		 System.out.println("--------------------------------------------");
		 
		 list.stream().forEach((li)-> System.out.println(li));
		 System.out.println("--------------------------------------------");
		 
		for( Iterator iter= list.iterator(); iter.hasNext();) {
			
			System.out.println(iter.next());
		}
		 System.out.println("--------------------------------------------");
		 
		 Iterator iter=list.iterator();
		 
		 while(iter.hasNext()) {
			 System.out.println(iter.next());
		 }
	}
	

}
