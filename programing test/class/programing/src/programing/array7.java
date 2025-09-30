package programing;

import java.util.Arrays;

public class array7 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int b[]= {1,2,3,4,5};
		
		int size=a.length+b.length;
		int c[]=new int[size];
		
		int b1=0;
		int a1=0;
		for(int i=0;i<size;i++) {
			if(i%2!=0) {
				c[i]=a[a1];
				a1++;
		}else {
			c[i]=b[b1];
			b1++;
	
			}
		}
		
		System.out.println(Arrays.toString(c));
	}
}
