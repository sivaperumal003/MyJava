package programing;

public class linear {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,2,6,3,9};
		
		int n=10;
		int index=linear(a,n);
		
		System.out.println(index);
		
	}
	static int linear(int a[],int n) {
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				index=i;
				return index;
			}
		}
		return -1;
	}

}
