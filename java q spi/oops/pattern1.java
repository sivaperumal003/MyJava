class pattern1{
public static void main (String []args){
int n=5;
int val=1;
for (int i=1;i<=n;i++){
	for (int j=1;j<=n-i;j++){
		System.out.print("  ");
	}
	for (int k=1;k<=val;k++)
	{
		System.out.print("* ");
	}
	System.out.println();
	val+=2;
}
}
}
