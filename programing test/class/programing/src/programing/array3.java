package programing;

import java.util.Arrays;

public class array3 {

	public static void main(String[] args) {
		
		int a[]= {5,634,56,34,22,34};
		int n=4;
		
		
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
						
					
				}
			}
		}
		removeDup(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[n-1]);

	}
	
	static void removeDup(int a[]) {
		int i=0;
		for(int j=1;j<a.length;j++) {
			if(a[i]!=a[j]) {
				i++;
				a[i]=a[j];
			}
		}
		
	}

}
