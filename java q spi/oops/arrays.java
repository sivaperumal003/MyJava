import java.util.*;
class arrays {
public static void main( String [] args){
	int a[]={12,34,12,21,33};
	int n=21;
	int count=0;
	int val=lenear(a,n);
	if(val>=0){
		System.out.println(val);
	}
	
}
	
	
	static int  lenear(int a[],int n){
		
		for (int i=0;i<a.length-1;i++)
			if (a[i]==n){
				return i;
			}
			return-1;
	}
			
			
			
}

	
	
	// for(int i=0;i<a.length;i++){
		
		// if(a[i]==n){
			// val=i;
			// count++;
			
			
			
		// }
			
		// }
		// // for (int j=0;j<=a.length-1;j++){
			
		// // if(a[i]<a[j]){
			// // int temp =a[i];
			// // a[i]=a[j];
			// // a[j]=temp;
		// // }
		
		// if(count>0){
		// System.out.println(val);
		// }else{
			// System.out.println("number not found");
	// }
	// System.out.println(Arrays.toString(a));



	
