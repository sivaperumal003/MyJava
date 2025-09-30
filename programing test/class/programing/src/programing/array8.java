package programing;

import java.util.Arrays;

public class array8 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]={7,8,9,10,11};
		int n=a.length+b.length;
		int c[]=new int[n];
		int cm=0;
		int i=0;
		while(i<n/2+1) {
					while(cm<=i) {
				
			c[i]=a[cm];
			cm++;
					}
					i++;
			
		}
			int j=0;
			
		while(i<n-2) {
			while(j<=j+1) {
				c[i+1]=b[j];
				j++;
			}
			i++;
			
		}
				
System.out.println(Arrays.toString (c));
System.out.println(Arrays.toString (a));

	}

}
