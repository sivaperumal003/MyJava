package programing;
import java.util.Scanner;
class  Gcd{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int n1=sc.nextInt();
	int a=getLcm(n,n1);
	sc.close();
	
	System.out.println(a);

	}
	static int getLcm(int n,int n1) {
		int lcm=n*n1/getDivisor(n,n1);
		return lcm;
		}
	
	static int getDivisor(int n,int n1){
		while(n1!=0) {
			int temp=n1;
			n1=n%n1;
			n=temp;
		}
		return n;
					
	
		}
	}

		