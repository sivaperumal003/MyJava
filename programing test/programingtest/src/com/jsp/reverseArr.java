package com.jsp;

import java.util.Arrays;

public class reverseArr {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,6};
		int n=a.length-1;
		int j=0;
		
		
		for(int i=a.length-1;i>=0;i--) {
			if(i>n/2) {
	        int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			
			j++;
		
			}
			
			
		}
		System.out.println(Arrays.toString(a));
	}

}
