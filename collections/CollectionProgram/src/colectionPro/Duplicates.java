package colectionPro;

import java.util.*;

public class Duplicates {

	public static void main(String[] args) {
             int a[]= {2,3,9,4,5,6,3,8,2,7,9};
             NewArr(a);
             
	}
	
	
	
	
	static void NewArr(int a[]) {
		Set<Integer> st=new LinkedHashSet<>();
		for(int i: a) {
			
			st.add(i);	
		}
		
	       for(int i:st) {
	    	   System.out.println(i);
	       }
	}

}
