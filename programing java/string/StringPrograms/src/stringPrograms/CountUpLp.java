package stringPrograms;

public class CountUpLp {

	public static void main(String[] args) {
String s=" Siva20 kiran77 4  Boopesh2 Man4dakattu S4ar2ath";
int up=0;
int lp=0;
int d=0;
int wp=0;
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	
	if(Character.isUpperCase(c)) {
		up++;
		
	}else if(Character.isLowerCase(c)) {
		lp++;
	}else if(Character.isDigit(c)) {
		d++;
		
	}else if(Character.isWhitespace(c)) {
		wp++;
	}
}
System.out.println("lowercase  "+lp);
System.out.println("uppercase  "+up);
System.out.println("digits   :"+d);
System.out.println("whiteSpace:  "+wp);
	}

}
