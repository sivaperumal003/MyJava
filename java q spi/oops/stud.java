import java.util.Scanner;
class StudentRegistration{
	String Name;
	String emailId;
	Long phno;
	String course;
	
	StudentRegistration(String Name,Long phno,String course){
		this.Name=Name;
		this.phno=phno;
		this.course=course;
	}
	
     StudentRegistration(String Name,String emailId,String course)
{     this.Name=Name;
	this.emailId=emailId;
	this.course=course;
}
    
	 void display(){
		 System.out.println();
		 System.out.println("--------------------------");
		 System.out.println("emailId:  "+emailId);
	     System.out.println("Name: "+Name);
	     System.out.println("phno:     "+phno);
         System.out.println("course:  "+course);
		 System.out.println("--------------------------");
		 System.out.println();
}
}
class stud{
	public static void main( String []args){
		Scanner sc=new Scanner(System.in);
	String Name;
	String emailId;
	Long phno;
	String course;
	      System.out.println("you have to register via phon option-->  1");
		  System.out.println("you have to register via email option-->  2");
		  
		int choise=sc.nextInt();
		switch (choise)
		{
			case 1:
			 System.out.println("course details");
			 System.out.println();
			  System.out.println("CSE $ 4L per sem");
			  System.out.println();
			  System.out.println("ECE $ 5L per sem");
			  System.out.println();
			  System.out.println("EEE $ 2L per sem");
			  System.out.println();
			  System.out.println("Aids $ 8L per sem");
			  System.out.println();
			  
			System.out.println("enter a  name :");
			Name=sc.next();

			System.out.println("enter a phonr no :");
			phno=sc.nextLong();
			System.out.println("enter a course name  :");
			course=sc.next();
		
			StudentRegistration u1=new StudentRegistration(Name,phno,course);
		    u1.display();
			break;
			case 2:
				 System.out.println("course details");
			 System.out.println();
			  System.out.println("CSE $ 4L per sem");
			  System.out.println();
			  System.out.println("ECE $ 5L per sem");
			  System.out.println();
			  System.out.println("EEE $ 2L per sem");
			  System.out.println();
			  System.out.println("Aids $ 8L per sem");
			  System.out.println();
			System.out.println("enter a emailId :");
			emailId=sc.next();
			System.out.println("enter a  name :");
			Name=sc.next();
			System.out.println("enter a course name  :");
			course=sc.next();
			StudentRegistration u2=new StudentRegistration(Name,emailId,course);
			u2.display();
			break;
		
		}

		
		
		
		
			
			
			
		
		
	}
}
	