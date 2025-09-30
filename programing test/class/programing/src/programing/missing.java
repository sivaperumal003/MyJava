package programing;

public class missing {

	public static void main(String[] args) {
		int a[]= {0,1,3,2,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			sum+=a[i];
			
			
		}
		int len=a.length;
		int sum2=0;
		int temp=1;
		while(len>0) {
			
			sum2+=temp;
			temp++;
			len--;
		}
		System.out.println(sum2-sum);

	}

}
