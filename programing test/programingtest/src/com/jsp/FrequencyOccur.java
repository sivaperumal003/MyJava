package com.jsp;

public class FrequencyOccur {

	public static void main(String[] args) {
     String s="sivasivasis";
 for(int i=0;i<s.length();i++) {
	 int count=countingSt(s,s.charAt(i));
 }
 System.out.println();
     
     
     
	}
	static int countingSt(String s,char s1) {
		int count=0;
		for(int i=0;i<s.length();i++) {
		if(	s.charAt(i)==s1) {
			count++;
		}
			
		}
	
		
		return count;
	}

}
