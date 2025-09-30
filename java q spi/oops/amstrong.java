class amstrong{
	public static void main (String [] args){
		int n=153;
		if(isAmstrong(n)){
			System.out.println("amstrong");
		}else{
			System.out.println(" not amstrong");
	}
	}
			
		
		static boolean isAmstrong(int n)
		{
			int temp=n;
		int cd=countdigit(n);
		int sum=0;
		while (n>0){
			int rem =n%10;
			 int pow=(int) Math.pow(rem,cd);
			 sum=sum+pow;
			 n=n/10;
			
		}
		return (sum==temp);
		}
		
		
		static int countdigit(int n){
			int count=0;
					 while(n>0){
			 count++;
			n= n/10;
			 
		 }return count;
		}
			
		
	
}
			 
			 
			  
		