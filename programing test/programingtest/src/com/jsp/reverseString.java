package com.jsp;

public class reverseString {

	public static void main(String[] args) {
String s="the Sky is blue";

 String w="";
 s=" "+s;
 
  for(int i=s.length()-1;i>=0;i--) {
	  char c=s.charAt(i);
	  if(c!=' ') {
		  
		  w=c+w;
	  }else {
		  System.out.print(w+" ");
		  w="";
	  }
  }
	}

}
