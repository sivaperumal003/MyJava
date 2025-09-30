class Sqaure
 {
	public static void main(String[] args)
	{
		int a[]={15,10,18,20};
		
		int n=20;
		
		int index=linear(a,n);
		if(index==-1){
			System.out.println("not in a index");
		}
			else{
				System.out.println(index);
			}
		
				
		}
	  public static int linear(int a[],int n){
		  for(int i=0;i<a.length;i++){
			int temp=i;
			
			if(a[i]==n)
				return i;
			
		}
		return-1;
	}
	}
			
		// int n=6;
		// int b=1;
		// int sum=0;
		// while(b<=n/2)
		// {
	// if(n%b==0)
	// {
		// sum=sum+b;
		
	
    // }b++;
	// }	
		// System.out.println(sum);
		// if (sum==n)
		// {
			// System.out.println("perfect number");
		// }else{
			// System.out.println("not perfect number");
		// }
 
 // }
 // }