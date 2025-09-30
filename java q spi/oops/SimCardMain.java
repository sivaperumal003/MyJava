import java.util.Scanner;
class SimCard{
		long phoneNumber;
		double currency;
		String simId;
				void recharge(double curr){
			System.out.println("Enter amount to recharge: ");
			Scanner sc=new Scanner(System.in);
			curr=sc.nextDouble();
			currency+=curr;
				}
		
		void voicecall(){
			if(currency>=2){
					System.out.println("Calling with"+phoneNumber);
					currency =currency-2;
			
			}
			else{
				System.out.println("Insufficient balance");
			}
		}
		void message(){
			if(currency >=1){
					System.out.println("Messaging with "+phoneNumber);
					currency =currency-1;
			}
			else{
				System.out.println("Insufficient balance");
			}
		
		}

		SimCard(long phoneNumber,double currency,String simId){
			this.phoneNumber=phoneNumber;
			this.currency=currency;
			this.simId=simId;
		}
		void display(){
			System.out.println("Phonenum: "+phoneNumber);
			System.out.println("currency: "+currency);
			System.out.println("simId: "+simId);
			
			
		}
		
}
class SimCardMain{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter phoneNumber: ");
			long phoneNumber=sc.nextLong();
			System.out.println("Enter Currency: ");
			double currency=sc.nextDouble();
			System.out.println("Enter simId: ");
			String simId=sc.next();
			System.out.println("   ");
			SimCard s1=new SimCard(phoneNumber,currency,simId);
			System.out.println("calling ");
	        
			
			s1.voicecall();
			s1.message();
		
			s1.display();
			
			
		}


}