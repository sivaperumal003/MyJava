package Custom;

import java.util.Scanner;

public class AgeCheck {
   private String name;
   private int age;
   
   public void details() {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter a Name:");
	   name =sc.next();
	   System.out.println("Enter a Age:");
	   age = sc.nextInt();
   }
   
   
   public  void ageChecker() throws AgeInvalidException {
	   if(age>=18) {
		   System.out.println("You are eligible to Vote");   
	   }else {
		   AgeInvalidException age=new AgeInvalidException();
		   System.out.println(age.getMessage());
		   throw age;
	   }
	 
   }
  

}
  