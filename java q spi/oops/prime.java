class prime{

public static void main (String []args){
int n=500;
for (int i=2;i<=n;i++){
if (isPrime(i)){
	System.out.println(i);
}
}
}

static boolean isPrime(int n){
	if(n<=1)
		return false;
	
for (int i=2; i<=n/2;i++){
	if(n%i==0){
		return false;
	}
}
return true;
}
}

		