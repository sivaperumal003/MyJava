package com.jsp;

public class Duplicatearr {

	public static void main(String[] args) {

		int a[]= {1,2,3,3,4,4,5,5,8,9};
		sortArray(a);
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int k=i+1;k<a.length;k++) {
			if(a[i]==a[k]) {
				count++;
				int temp=a[i];
				a[i]=a[k];
				a[k]=temp;
				
				
			}
				
			}
			for(int j=0;j<a.length-count;j++) {
				System.out.println(a[i]);
			}
			
			
		}
		
		
		
			}
	
	static void sortArray(int[]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;i<a.length;j++) {
				if(a[i]==a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

	}

}
