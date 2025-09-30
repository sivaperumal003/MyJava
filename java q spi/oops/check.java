class check {
public static void main (String []args){
	int n=20;

		int temp=0;

		for( int i=2;i<=n/2;i++){
			if (n%i==0){
				temp=i;
			}
		}
			System.out.println(temp);
}
}
