+
import java.util.Scanner;
class DepitCard{
	String userName;
	String Bankname;
	Long cardnum;
	int pasword;
	
	DepitCard(String userName,String Bankname,Long cardnum,int pasword){
		this.userName=userName;
		this.Bankname=Bankname;
		this.cardnum=cardnum;
		this.pasword=pasword;
	}
void disp(){
	  System.out.println();
		 System.out.println("--------------------------");
		 System.out.println("Bankname: "+Bankname);
	     System.out.println("userName: "+userName);
	     System.out.println("cardnumbe "+cardnum);
         System.out.println("pasword:  "+pasword);
		 System.out.println("--------------------------");
		 System.out.println();
}
}
class debit{
	public static void main (String []args)
	{
		
	String userName;
	String Bankname;
	Long cardnum;
	int pasword;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a user name :");
			userName=sc.next();
			sc.nextLine();
            System.out.println("enter a Bankname :");
			Bankname=sc.next();
			sc.nextLine();
			System.out.println("enter a cardnumber :");
			cardnum=sc.nextLong();
			sc.nextLine();
			System.out.println("enter a debit pasword 4 digit only :");
			pasword=sc.nextInt();
	
			DepitCard u3=new DepitCard(userName,Bankname,cardnum,pasword);
			u3.disp();
	}
}