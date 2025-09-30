package stringPrograms;

public class Palindrome {

	public static void main(String[] args) {
String s="madam";
String p="";

for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	
	p=c+p;
}

if(p.equalsIgnoreCase(s)) {
	System.out.println("palidrome");
}else {
	System.out.println("Not a palindrome");
}
	}

}
