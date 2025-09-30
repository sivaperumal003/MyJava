
import java.util.Scanner;
class Email{
	String userName;
	String emailId;
	Long phno;
	String pasword;
	
	Email(String userName,String emailId,Long phno,String pasword){
		this.userName=userName;
		this.phno=phno;
		this.pasword=pasword;
	}
	void changepass(){
		this.pasword ="siva007";
		System.out.println(pasword);
	}
void disp(){
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
class Mainemail{
	public static void main (String []args)
	{
		String userName;
	String emailId;
	Long phno;
	String pasword;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a user name :");
			userName=sc.next();
			sc.nextLine();
            System.out.println("enter a emailId :");
			emailId=sc.next();
			sc.nextLine();
			System.out.println("enter a phonr no :");
			phno=sc.nextLong();
			sc.nextLine();
			System.out.println("enter a user pasword :");
			pasword=sc.nextLine();
	
			Email u3=new Email(userName,emailId,phno,pasword);

			u3.changepass();
		  u3.display();
			
	}
}