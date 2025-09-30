package Custom;

import java.util.Scanner;

public class Atm {
     private int Accnum=1999;
     private  int Password=2001;
      private int ac;
      private int pas;
      
      public void AccessInput() {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter a account number");
    	 ac= sc.nextInt();
    	 System.out.println("Enter a password");
    	 pas= sc.nextInt();
      }
      
      public void validate() throws InvalidUserException{
    	  if(Accnum==ac && Password==pas) {
    		  System.out.println("Collect Your money");
    	  } else {
    		  InvalidUserException ius=new InvalidUserException();
    		  System.out.println(ius.getMessage());
    		  throw ius;
    	  }
      
     
     
}
      
}
