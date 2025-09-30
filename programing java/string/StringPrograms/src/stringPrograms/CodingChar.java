package stringPrograms;

public class CodingChar {

	public static void main(String[] args) {
String s="qgty";

for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(c=='Y'||c=='y'||c=='z'||c=='Z') {
		c-=26;
	}
	c+=2;
	System.out.print(c);
}
	}

}
