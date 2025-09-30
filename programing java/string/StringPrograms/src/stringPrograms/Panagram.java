package stringPrograms;

public class Panagram {
	
	
	static boolean isPanagram(String str) {
		  boolean[] b=new boolean [26];
		  str=str.toLowerCase();
		  
		  for(int i=0;i<str.length();i++) {
			  char c=str.charAt(i);
			  if(c>='a'&&c<='z') {
				  b[c-'a']=true;
				  
			  }
		  }
		  for( boolean pa : b) {
			  if(!pa) {
				  return false;
			  }
		  }
		  
		
		return true;
	}

	public static void main(String[] args) {
 String s="The quick brown fox jumps over the lazy dog+";
 
    if(isPanagram(s)) {
    	System.out.println("panagram");
    }else {
    	System.out.println("not ah panagram");
    }
	}

}
