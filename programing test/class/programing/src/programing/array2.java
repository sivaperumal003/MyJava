package programing;

import java.util.Arrays;

public class array2 {

	public static void main(String[] args) {
		int a[]= {5,634,56,34,22,34,89};
		for (int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				int temp=a[j];
				a[j]=a[i];
		a[i]=temp;
		
		}
		}
		System.out.println(Arrays.toString(a));

	}

}
