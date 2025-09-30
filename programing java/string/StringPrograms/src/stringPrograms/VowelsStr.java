package stringPrograms;

public class VowelsStr {

	public static void main(String[] args) {
String s="Siva kiran boopesh mandakattu";
int v=0;

for(int i=0;i<s.length();i++) {
	
	char c=s.charAt(i);
	
	char u=Character.toUpperCase(c);
	if(u=='A'||u=='E'||u=='i'||u=='O'||u=='U') {
		v++;
		
	}
}
System.out.println(v+"  vowels ");
	}

}
