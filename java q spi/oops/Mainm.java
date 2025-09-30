import java.util.Scanner;
class UserRegistration{
	String userName;
	String emailId;
	Long phno;
	String pasword;
	
	UserRegistration(String userName,Long phno,String pasword){
		this.userName=userName;
		this.phno=phno;
		this.pasword=pasword;
	}
	
     UserRegistration(String emailId,String pasword)
{
	this.emailId=emailId;
	this.pasword=pasword;
}
     UserRegistration(String userName,String emailId,Long phno,String pasword)
	 {
		 this.emailId=emailId;
	    this.userName=userName;
		this.phno=phno;
		this.pasword=pasword; 
	 }
	 void display(){
		 System.out.println();
		 System.out.println("--------------------------");
		 System.out.println("emailId:  "+emailId);
	     System.out.println("userName: "+userName);
	     System.out.println("phno:     "+phno);
         System.out.println("pasword:  "+pasword);
		 System.out.println("--------------------------");
		 System.out.println();
}
}
class Mainm{
	public static void main( String []args){
		Scanner sc=new Scanner(System.in);
			String userName;
	String emailId;
	Long phno;
	String pasword;
	
		int choise=sc.nextInt();
		switch (choise)
		{
			case 1:
			System.out.println("enter a user name :");
			userName=sc.nextLine();
			sc.nextLine();
			System.out.println("enter a phonr no :");
			phno=sc.nextLong();
			System.out.println("enter a user pasword :");
			pasword=sc.nextLine();
			sc.nextLine();
			UserRegistration u1=new UserRegistration(userName,phno,pasword);
		    u1.display();
			break;
			case 2:
			System.out.println("enter a emailId :");
			emailId=sc.nextLine();
			sc.nextLine();
			System.out.println("enter a user pasword :");
			pasword=sc.nextLine();
			sc.nextLine();
			UserRegistration u2=new UserRegistration(emailId,pasword);
			u2.display();
			break;
			case 3:
			System.out.println("enter a user name :");
			userName=sc.nextLine();
			sc.nextLine();
            System.out.println("enter a emailId :");
			emailId=sc.next();
			sc.nextLine();
			System.out.println("enter a phonr no :");
			phno=sc.nextLong();
			System.out.println("enter a user pasword :");
			pasword=sc.nextLine();
	
			UserRegistration u3=new UserRegistration(userName,emailId,phno,pasword);
			u3.display();
			break;
		}

		
		
		
		
			
			
			
		
		
	}
}