package com.jsp;

public class array2sum {

	public static void main(String[] args) {
		int target=7;
    int a[]={1,3,4,5,6,7,0};
    int n=0,n1=0;
    int max=0;
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
				if(a[i]+a[j]==target&&a[i]!=a[j]) {
					int add=i+j;
				 if(add>=max) {
					 max=add;
					 n=i;
					 n1=j;
					 
				 }
				
				 
				
				}
			}
			
		}
		System.out.println(n+"  "+n1);
		
	
		
	}

}
