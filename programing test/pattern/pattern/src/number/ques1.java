package number;

import java.util.Scanner;
public class ques1 {

	public static void main(String[] args) {
		System.out.println("jrl");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int count=0;
		int i=1;
//		for (int i=1;i<=500;i++) {
//			
//		if (isprime(i)) {
//			 count++;
//			
//				  }
//		 if(count==n) {
//			 System.out.println(i);
//			 break;
//
//			 
//			
//		}
		while(count<n) {
			i++;
			if(isprime(i)) {
				count++;
			}
			
			
		}
		System.out.println(i);
				

	}
	
	static boolean isprime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
			
		}return true;
	}

}


