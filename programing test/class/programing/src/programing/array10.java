package programing;

import java.util.Scanner;

public class array10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int size = m * n;
        String[] votes=new String[size];
        for(int i=0;i<size;i++) {
        	votes [i]=scanner.next().toUpperCase();
        }
        
        String maxvote="";
        int maxcount=0;
        for (int i=0;i<size;i++){
        	int count=countVotes(votes,votes[i]);
        	if (count>maxcount) {
        		maxcount=count;
        		maxvote=votes[i];
        		
        	}
        	
        }
        if(maxcount<size/2) {
        	System.out.println("no one qalified");
        }else {
              System.out.println("Winner is :"+maxvote);
        }
        	
        }

	private static int countVotes(String[] votes, String v) {
		int count =0;
		for (int i=0;i<votes.length;i++) {
			if(votes[i].equals(v)) {
				count++;
			}
		}
				return count;
	}
        	
        }
        
        