package stringPrograms;

public class ReversCase {

	public static void main(String[] args) {
String s="Devil Siva";
String rc="";
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	
	if(Character.isUpperCase(c)) {
		rc+=Character.toLowerCase(c);
	}else if(Character.isLowerCase(c)) {
		
		rc+=Character.toUpperCase(c);
	}
}
System.out.println(rc);
	}

}
