package stringPrograms;

public class CountString {

	public static void main(String[] args) {
String s=" the value of String is two";

int count=0;

for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(!Character.isWhitespace(c)) {
		count++;
	}
	
}
  System.out.println(count);
	}

}
