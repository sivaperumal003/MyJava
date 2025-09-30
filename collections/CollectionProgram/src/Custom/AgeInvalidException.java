package Custom;

public class AgeInvalidException extends Exception {

	@Override
	public String getMessage() {
		
		return "Entered Age is Invalid";
	}
	
	

}
