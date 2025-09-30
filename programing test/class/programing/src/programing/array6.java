package programing;

public class array6 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,7,9};
		 if(isAssending(a)) {
			 System.out.println("accending ");
		 }else {
			 System.out.println("not a accending order");
		 }
		 }
			 
			 static boolean isAssending(int a[]) {
			 for (int i=0;i<a.length-1;i++) {
				 if(a[i]>a[i+1]) {
					 return false;
				 }
			 }
			 return true;
		 }
	}
		 


