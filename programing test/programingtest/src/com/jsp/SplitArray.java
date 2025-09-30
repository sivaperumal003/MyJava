package com.jsp;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		
		 int a[]= {1,2,3,4,5,6,6,7,8,8,3};
		 int add=0;
		 int even=0;
		 
		 for(int i=0;i<a.length;i++) {
			 if(a[i]%2==0) {
				 add++;
			 }else {
				 even++;
			 }	 
		 }
		 int ad[]=new int[add];
		 int ev[]=new int[even];
		 int n1=0;
		 int n2=0;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]%2==0) {
				 ad[n1]=a[i];
				 n1++;
				 
			 }else {
				 ev[n2]=a[i];
				 n2++;
			 }
			 
		 }
		System.out.println(Arrays.toString(ad)); 
		System.out.println(Arrays.toString(ev));
		 
	}

}
