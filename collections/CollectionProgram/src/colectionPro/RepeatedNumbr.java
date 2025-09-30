package colectionPro;

import java.util.*;

public class RepeatedNumbr {

	public static void main(String[] args) {
		int a[]= {1,2,3,3,2,4,5,2,4,2,5,2,6,1,1,1,1,1,3};
		
		countNumbers(a);
		
	}
	
	static void countNumbers(int a[]) {
		Map<Integer,Integer> Mp=new HashMap<>();
		
		for(int i:a) {
			Mp.put(i, Mp.getOrDefault(i, 0)+1);
			
		}
		int first=0,second=0,num1=0,num2=0;
		
		
		for(Map.Entry<Integer, Integer> entry: Mp.entrySet()) {
			int key=entry.getKey();
			int val=entry.getValue();
			if(val>num1) {
				second=first;
				first= key;
				
				num2=num1;
				num1=val;
			}else if(num2<val&& val<num1) {
				second=key;
				num2=val;
			}
		}
		System.out.println(first+" and "+second);
	}

}
