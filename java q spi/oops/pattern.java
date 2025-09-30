class pattern 
{
public static void main (String []args){
int n=5;
int val=1;
char c='A';
for(int i=1;i<=n;i++){
	
	for (int j=n-i;j>=1;j--){
		System.out.print("  ");
	}
	for (int k=1;k<=i;k++){
		if(i%2!=0){
			System.out.print(val+" ");
			
		}
		else if(i%2==0){
			System.out.print(c+" ");
			
		}
		
	}
        val++;
		c++;
	System.out.println();
	
}
}
}