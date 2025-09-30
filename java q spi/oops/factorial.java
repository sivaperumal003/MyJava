import java.util.Scanner;
import java.util.Arrays;
class factorial{
public static void main (String [] args){
	Scanner sc =new Scanner (System.in);
	int n=sc.nextInt();

int Fact=1;
for (int i=1;i<=n;i++){
Fact=Fact*i;	
}
String s=String.valueOf(Fact);
for (int i=0;i<s.length();i++){
	System.out.print(s.charAt(i) +"  ");
}  

}
}