import java.util.Scanner;
class pen {
	String brand;
	String color;
	double price;
	void disp(){
		System.out.print("brand"+brand+
		" colour"+color+
		" price"+price);
	}
}
class note {
	String brand;
	String color;
	double price;
}
class textBook {
	String title;
	int pages;
	String story;
	double price;
}
class employee{
	int eno;
	String ename;
	int depno;
	double salary;
	String job;
	
	void disp(){
		System.out.println("ename  "+ename+"eno  "+eno+"depno  "+depno+"salary   "+salary+"job   "+job);
		
	}
}
	class graph{
		int x;
		int y;
		
		void disp(){
			System.out.print("xy"+"("+x+ ","+y+")");
		
	}
	}
	class GpsLocation{
		double latitude;
		double longitude;
		String direction;
		double alitude;
		void disp(){
			System.out.println("latitude"+latitude+"longitude"+longitude+"direction"+direction+"altitude"+alitude);
	}
	}
	class User{
		String userName;
		String userId;
		String password;
	
	void disp(){
		
		System.out.println("useName"+userName+"userId"+userId+"password"+password);
	}
	}
	class circle{
		 double radious;
		 final static double pi=3.14;
		  void diameter(){
			  
			  double diameter=2*radious;
			  System.out.print("diameter"+diameter);
	
		  }
		  void area(){
			  double area=pi*radious*radious;
			  
	}
	
	
	


class Mainclass{
	public static void main (String []args){
		Scanner sc=new Scanner(System.in);
		pen p=new pen();
		note n=new note();
		textBook tb=new textBook();
		employee e=new employee();
		graph g=new graph();
		GpsLocation gp=new GpsLocation();
		User u=new User();
		circle c=new circle();
		circle c2=new circle();
		circle c3=new circle();
		c.radious=2.3;
		// gp.latitude=2.00;
		// gp.longitude=33.00;
		// gp.direction="NE";
		// gp.alitude=12334.00;
		// gp.disp();
		// u.userName="Siva";
		// u.userId="dummy";
		// u.password="*********";
         // p.brand="cello";
		 // p.color="blue";
		 // p.price=10.00;
		 // p.disp();
		 // e.eno=1;
		 // e.ename="kiran";
		 // e.salary=100.88;
		 // e.job="manager";
		 // g.x=3;
		 // g.y=6;
		 
		 // g.disp();
		 // e.disp();
		 // u.disp();
		 c.diameter();
		
	}
}
