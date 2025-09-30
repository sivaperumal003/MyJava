package com.jsp;
import java.util.Scanner;
public class ques5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for (int i=1;i<=n;i++) {
			if (!isStrong(i)) {
				System.out.println(String.valueOf(i));
			}
		}
	}
	static boolean isStrong(int n)
	{
		int sum = 0;
        int temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == n;
    }

	

static int factorial(int n) {
	 int fact = 1;
     for (int i = 1; i <= n; i++) {
         fact *= i;
     }
     return fact;

	
}
}
