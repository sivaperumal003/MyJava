class unique {
public static void main(String []args){
int a[] = {34, -50, 42, 14, -5, 86};
	System.out.println(maximum(a));
}
	static int maximum(int []a){
		int sum =0;
		int neg=0;
		int pass=0;
		for (int i=0 ;i<a.length;i++){
			if (a[i]<0){
				neg+=a[i];
			}
			else{
				pass+=a[i];
			}
			sum=pass+neg;
		}
		return sum;
	}
	
}
			
