package stringPrograms;

public class DigitFirst {

	public static void main(String[] args) {
String s="doomes day 1 spiderman 3 iron 33 man";
String ch="";
String d="";
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	
	if(Character.isDigit(c)) {
		
		d+=c;
	}else if(Character.isLetter(c)) {
		ch+=c;
	}
}
System.out.println(d+" "+ch);

	}

}
