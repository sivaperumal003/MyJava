package programing;

public class array1 {
	public static void main(String []args) {
		int a[]= {10,20,10,30,40,4,40,50,60,70};
		
		
		
		
		
		int count=0;
		boolean b[]=new boolean[a.length];
		for (int i=0;i<a.length;i++) {
			
			if(b[i]==false) {
				int c=1;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j] ) {
						c++;
						b[j]=true;
					}
					
						
					}
				
					System.out.println(a[i]+"  "+c);
				
				}
				}
			}
		}
	


