import java.util.Scanner;
class  gcd{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int n1=sc.nextInt();
	int a=getDivisor(n,n1);
	
	System.out.println(a);

	}
	
	static int getDivisor(int n,int n1){
	int temp=1;

		for( int i=1;i<=n/2&&i<=n1/2;i++){
			if (n%i==0&&n1%i==0){
				temp=i;
			}
		}return temp;
	}
}
		