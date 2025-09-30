package com.jsp;

public class star2 {

	public static void main(String[] args) {
		int n=11,st=n,sp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<sp;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<st;j++) {
				System.out.print("* ");
			}
			System.out.println();
			if((n/2)>i) {
				sp++;
				st-=2;
			}
			else {
				sp--;
				st+=2;
				
				
			}
		}
	}

}
