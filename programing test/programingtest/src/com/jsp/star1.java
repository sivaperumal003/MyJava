package com.jsp;

public class star1 {
	public static void main(String []args) {
	int n=11,sp=n-1,st=1;
	for(int i=0;i<n;i++) {
		for(int k=0;k<sp;k++) {
			System.out.print("  ");
		}
		for(int j=0;j<st;j++) {
			System.out.print("* ");
		}
		System.out.println();
		
		if((n/2)>i) {
			sp--;
			st+=2;
						
		}else  {
			sp++;
			st-=2;

			
		}
	}
}

}