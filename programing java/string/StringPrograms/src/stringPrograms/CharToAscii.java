package stringPrograms;

public class CharToAscii {

	public static void main(String[] args) {
       String s=" ninja hattori ";
       
       for(int i=0;i<s.length();i++) {
    	   
    	   char c=s.charAt(i);
    	   if(!Character.isWhitespace(c)) {
    	   
    	   System.out.println(c+"  "+(int)c);
       }
	}

}
}
