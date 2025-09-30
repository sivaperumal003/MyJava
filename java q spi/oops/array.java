import java.util.Scanner;
import java.util.Arrays;
class array{
public static void main (String [] args){
	Scanner sc =new Scanner (System.in);
	int n=sc.nextInt();
	
int a[]=new int[n];
int temp=0;
for (int i=0;i<n;i++){
	  
	  a[i]=i+1;
	  
}
 temp=a[0]+a[1]+a[2];
 System.out.println(temp);
System.out.println(Arrays.toString(a));
}
}
