
package com.jsp;
import java.util.Scanner;
public class ques1 {

	public static void main(String[] args) {
		System.out.println("jrl");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int count=0;
		for (int i=1;i<=n;i++) {
		if (isprime(i)) {
			count=i;
			System.out.println(i);
			
		}
		}
		System.out.println(count);
		

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
