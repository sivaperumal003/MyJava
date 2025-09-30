class disar{
	public static void main(String [] args){
		int a[]={1,2,4,8,6,7,7};
		int first =0;
		int second=0;
		for(int i=1;i<a.length-1;i++){
			if(a[i]>first){
				second=first;
			first=a[i];
			}
			else if(a[i]>second){
				second=a[i];
			}
		}
		System.out.println(second*first);
	}
}
			
			
			