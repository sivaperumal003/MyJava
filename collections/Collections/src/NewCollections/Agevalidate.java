package NewCollections;

public class Agevalidate { 
	public static void validateAge(int age)  throws InvalidAgeException{
		  if(age<18) {
			  throw new InvalidAgeException("Age is not valid so you must be greater than 18");
			  
		  }else {
			  System.out.println("youare eligible");
		  }
	}
	
	public static void main(String[] args) {
		try {
			validateAge(20);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}

}
