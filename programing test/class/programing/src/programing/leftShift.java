package programing;

import java.util.Arrays;

public class leftShift {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int n=3;
		int rotate[] =null;
		while(n>0) {
		
		rotate=rotateArray(a);
		
		n--;

		}
		System.out.println(Arrays.toString(rotate));
			}
		static int [] rotateArray(int a[]) {
		int temp =a[0];
		
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		a[a.length-1]=temp;
return a;
	}

}
