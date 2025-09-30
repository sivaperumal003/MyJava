
import java.util.*;
class arrays1 {
public static void main( String [] args){
	int a[]={12,34,12,21,33};
	int count=0;
	for(int i=1;i<a.length;i++){
		for(int j=1;j<a.length;j++){
			 if(a[i]<a[j]){
			 int temp =a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
		 
		 
		}
	}
}
}
	