package stringPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class repeatreverse {

	public static void main(String[] args) {
		int n[]= {10,20,20,10,10,30,60,40,50,20,10,20,60};
		boolean b[]=new boolean[n.length];
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>();
		for(int i=0;i<n.length;i++) {
			int count=1;
			if(b[i]==false) {
				for(int j=i+1;j<n.length;j++) {
					if(n[i]==n[j]) {
						count++;
						b[j]=true;
					}
				}
				  al.add(n[i]);
					al1.add(count);
			}
		   
			
		}
		int arr1[]=new int[al.size()];
		int arr2[]=new int[al.size()];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=al.get(i);
			arr2[i]=al1.get(i);
			
			
		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(i==j) {
					continue;
				}
				if(arr2[i]>arr2[j]) {
					int temp2=arr2[i];
					int temp1=arr1[i];
					arr1[i]=arr1[j];
					arr2[i]=arr2[j];
					
					arr1[j]=temp1;
					arr2[j]=temp2;
					
				}
				if(arr2[i]==arr2[j]) {
					if(arr1[i]>arr1[j]) {
						int temp2=arr2[i];
						int temp1=arr1[i];
						arr1[i]=arr1[j];
						arr2[i]=arr2[j];
						
						arr1[j]=temp1;
						arr2[j]=temp2;

						
					}
					
				}
				
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}
	

}
