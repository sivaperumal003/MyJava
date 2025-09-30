package com.jsp;
import java.util.Scanner;
public class ques4 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in); 
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		while(n>0) {
			int temp=n%10;
			if(temp%2==1) {
				sum=sum+temp;
			}
			n=n/10;
			
		}
		System.out.println(sum);
		
	}

}
