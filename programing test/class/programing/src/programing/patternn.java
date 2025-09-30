package programing;

public class patternn {

	public static void main(String[] args) {
		int n=7;
		int sp=3,st=1,s=1;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for (int k=1;k<=st;k++) {
				if(s==k||st==k) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			if(n/2>=i) {
				st+=2;
				sp--;
			}else {
				st-=2;
				sp++;
			}
			System.out.println();
			
		}
		
	}

}
