package com.jsp;

public class Stringarr {

	public static void main(String[] args) {
String s[]= {"ravi","siva","devil","siva"};

boolean []b=new boolean[s.length];

for( int i=0;i<s.length;i++) {
	
	if(b[i]==false) {
		
		for(int j=i+1;j<s.length;j++) {
			if(s[i].equals(s[j])) {
				b[j]=true;
			}
			
			
			
		}
		System.out.println(s[i]);
	}
	
}

	}

}
