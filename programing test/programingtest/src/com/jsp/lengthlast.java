package com.jsp;

public class lengthlast {
	public static void main(String[] args) {
		
	
	String s="the sky is blue";

	int count=0;
	 
	  for(int i=s.length()-1;i>=0;i--) {
		  char c=s.charAt(i);
		  if(c!=' ') {
			  count++;
			 
		  }else {
			  System.out.print(count);
			  break;
			 
		  }
	  }


}
}
