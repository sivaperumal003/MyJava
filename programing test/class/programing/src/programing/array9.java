package programing;

import java.util.Arrays;

public class array9 {
	static int sumOf(int a) {
		int sum =0;
		while(a>0) {
			sum+=a%10;
			a=a/10;
		}
		return sum;
	}
	 static int strongNum(int n) {
		 int sum=0;
		 while(n>0) {
			 sum+=factorialOf(n%10);
			 n=n/10;
			 
			 
		 }
		 return sum;
		 
	 }
	 static int factorialOf(int n) {
		 int fact=1;
		for(int i=2;i<=n;i++) {
			fact*=i;
		}
		 return fact;
		 
	 }
	public static void main(String[] args) {
		int a[]= {123,252,787,909,878};
		
		for (int i=0;i<a.length;i++) {
			a[i]=strongNum(a[i]);
			
		}
		System.out.println(Arrays.toString(a));
		
	}

}
