package colectionPro;

public class occurance {
	public static void main(String[] args) {
		String s="bits bits is the company";
		String ss[]=s.split(" ");
		
		
		boolean b[]=new boolean[ss.length];
		for(int i=0;i<ss.length;i++) {
			int count=1;
			if(b[i]==false) {
		for(int j=0;j<ss.length;j++) {
			
				if(ss[i]==ss[j]) {
					count++;
					b[j]=true;
					
				}
				
			}
		
			
		}
			System.out.println(ss[i]+"--->"+count);
	}
		
	}

}
