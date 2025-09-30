package stringPrograms;

public class Upperprint {

	public static void main(String[] args) {
String s=" Nisha JanaNi Pooja KArthikaSwetha";
String up="";
 for(int i=0;i<s.length();i++) {
	 char c=s.charAt(i);
	 
	 if(Character.isUpperCase(c)) {
		 up+=c;
	 }
 }
 System.out.println(up);
	}

}
