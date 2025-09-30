package Custom;

public class InvalidUserException  extends Exception{

	@Override
	public String getMessage() {
		
		return "Invalid Card details try again !";
	}
	
	
	

}
