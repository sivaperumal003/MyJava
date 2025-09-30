package com.jsp;
import java.util.Scanner;
public class ques3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 sc.close();
		 for (int i=1;i<=n;i++) {
			 if(ispalindrome(i)) {
				 System.out.println(i);
				 
			 }
		 }
		 }
	
		 static boolean ispalindrome(int n) {
			 if (n==reverse(n)) {
				 return true;
			 }return false;
		 }
		 static int reverse(int n) {
			 int sum=0;
		 
		 while(n>0) {
			 int temp=n%10;
			 sum=sum+temp;
			 sum=sum*10;
			 n=n/10; 
		 }
		 sum=sum/10;
		 return sum;

	}

}
