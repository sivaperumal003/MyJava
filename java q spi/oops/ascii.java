class ascii{
public static void main(String []args){
	
	String s="543";
	String s1="342";
	int a=getsum(s);
	int b=getsum(s1);
	   System.out.println(a*b);
}
	static int getsum(String n){
		int sum =0;
	for (int i=0;i<n.length();i++){
		sum+=n.charAt(i)-48;
		
		sum=sum*10;
	}
	sum=sum/10;
	return sum;
	}
		

	
}

		