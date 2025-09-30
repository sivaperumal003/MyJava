package programing;

import java.util.Arrays;

public class union {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,9};
		int b[]= {1,2,7,7,7,5,5,10};
		int size=a.length+b.length;
		int c[]=new int[size];
		for(int i=0;i<a.length;i++) {
    		c[i]=a[i];
    		
    	}
    	for (int k=a.length;k<size;k++) {
    		c[k]=b[k-a.length];
    	}
    Shorting(c);

	int newsize=Dupilcat(c);
	
	for(int n=0;n<=newsize;n++) {
		
		System.out.print(c[n]+" ");
	}
    
   
	}
	
	static void Shorting(int c[]) {
		 for(int i=0;i<c.length;i++) {
			 for (int j=0;j<c.length;j++) {
				 if(c[i]<c[j]) {
					 int temp=c[i];
					 c[i]=c[j];
					 c[j]=temp;
				 }
			 }
		 }
		
	}

	
	
	static int Dupilcat(int c[]) {
		int i=0;
		for(int j=1;j<c.length;j++) {
			if(c[i]!=c[j]) {
				i++;
				c[i]=c[j];
				
			}
		}
		return i;
	}

}
