package programing;

import java.util.Arrays;

public class array5 {

	public static void main(String[] args) {
		int a[]= {3,4,5,6,7,8,9};
		for (int i=0;i<a.length-1;i++) {
			
				
			
			int temp=a[i];
			 a[i]=a[i+1];
			 a[i+1]=temp;
			
			 
		}
System.out.println(Arrays.toString(a));
	}

}
