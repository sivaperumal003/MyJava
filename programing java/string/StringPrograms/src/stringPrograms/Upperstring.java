
package stringPrograms;

public class Upperstring {
	public static void main(String[] args) {
		String s="kiran boopesh siva";
		String up="";
		
		for(int i=0;i<s.length();i++) {
			
			char c=s.charAt(i);
			
			char u=Character.toUpperCase(c);
			if(!Character.isWhitespace(c)) {
			up+=u;
			
		}
	
	}
		System.out.println(up);

}
}
