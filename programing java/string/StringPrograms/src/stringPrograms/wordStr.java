package stringPrograms;

public class wordStr {
	public static void main(String[] args) {
		
		String s="im not a human";
		String w="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' '){
				w+=c;
			
			}else {
				System.out.println(w);
				w="";
			}
			
		}
		
	}

}
