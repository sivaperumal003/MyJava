package stringPrograms;

public class Digitprint {

	public static void main(String[] args) {
String s="sjei4j4jkj5kj5jk6jkj67kjkj8kjk8";
String d="";
  for(int i=0;i<s.length();i++) {
	  char c=s.charAt(i);
	  if(Character.isDigit(c)) {
		  d+=c;
		  
	  }
  }
  System.out.println(d);
	}

}
