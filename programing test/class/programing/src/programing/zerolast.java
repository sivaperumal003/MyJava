package programing;

import java.util.Arrays;

public class zerolast {

	public static void main(String[] args) {
	int a[]= {0,0,3,4,3,7,0,9};
	
	
	for (int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));

	}

}
