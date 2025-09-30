package programing;

public class removeDuplicates {

	public static void main(String[] args) {
		int a[] = {1,1,2,3,4,5,6,3,5,7,7};
		decendind(a);
		int newlen=removeDuplicate(a);
	
		for(int i=0;i<newlen;i++) {
			System.out.print(a[i]+" ");
		}
		
		
		}
	
	 static void decendind(int[] a) {
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			
		}
		
		
	}

	
	 static int removeDuplicate(int a[]) {
		 if(a.length==0)
			 return 0;
		 int i=0;
		 for (int j=1;j<a.length;j++) {
			 if(a[j]!=a[i]) {
				 i++;
				 a[i]=a[j];
			 }
		 }
			return i+1;
			}

	}


