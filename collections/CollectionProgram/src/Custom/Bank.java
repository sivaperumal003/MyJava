package Custom;

public class Bank {
	public void initiate() {
		
	Atm atm=new Atm();
	try {
		atm.AccessInput();
		atm.validate();
	}catch(Exception e) {
		e.printStackTrace();
		
	}

}
}
