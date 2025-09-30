package Custom;

public class VoteEligibleCheck {
 public void eligibleCheck() {
	 try {
		 AgeCheck ag=new AgeCheck();
		 ag.details();
		 ag.ageChecker();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
 }
}
