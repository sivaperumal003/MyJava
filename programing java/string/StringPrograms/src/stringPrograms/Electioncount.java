package stringPrograms;
import java.util.Scanner;
public class Electioncount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String s[]=new String[size];	
		for(int i=0;i<size;i++){
			s[i]=sc.next().toUpperCase();
		}
	 int maxVote=0;
	 String max="";
	 for(int i=0;i<s.length;i++){ 
		 int countvote=CountVotes(s,s[i]);
		 if(maxVote<countvote) {
			 maxVote=countvote;
			 max=s[i];	 
		 }	 
	 }
	 if(maxVote>(size/2)){
	 System.out.println(max+"  Winner:  "+maxVote);
	 }
	 else {
		 System.out.println("No one is Qualified");
	 }
}
 static int CountVotes(String s[],String s1){
	 int count=0;
	 for(int i=0;i<s.length;i++) {
		 if(s[i].equals(s1)) {
			 count++;
		 }
	 } 
	 return count;
	 
 }
}
