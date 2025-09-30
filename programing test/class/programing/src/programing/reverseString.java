package programing;

public class reverseString {

	public static void main(String[] args) {
		String s="junggle mikey king";
		
		
	    String reverrse=getReverse(s);
	    
	    System.out.println(reverrse);
	    
	    
	}
	   static String getReverse(String s) {
	    
	    	String reverse="";
	    	
	    	for(int i=s.length()-1;i>=0;i--) {
	    		reverse+=s.charAt(i);
	    	}
	    	return reverse;
	    }

	}


