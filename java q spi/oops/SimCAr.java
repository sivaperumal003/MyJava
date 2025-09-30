import java.util.Scanner;

class SimCard {
    private long phoneNumber;
    private double currency;
    private String simId;

    // Constructor
    SimCard(long phoneNumber, double currency, String simId) {
        this.phoneNumber = phoneNumber;
        this.currency = currency;
        this.simId = simId;
    }

    // Method to make a voice call
    void voiceCall() {
        if (currency >= 2) {
            System.out.println("Calling with " + phoneNumber);
            currency -= 2;
        } else {
            System.out.println("Insufficient balance for calling.");
        }
    }

    // Method to send a message
    void message() {
        if (currency >= 1) {
            System.out.println("Messaging with " + phoneNumber);
            currency -= 1;
        } else {
            System.out.println("Insufficient balance for messaging.");
        }
    }

    // Method to recharge balance
    void recharge(Scanner sc) {
        System.out.print("Enter amount to recharge: ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            currency += amount;
            System.out.println("Recharge successful. New balance: " + currency);
        } else {
            System.out.println("Invalid recharge amount.");
        }
    }

    // Method to display sim card details
    void display() {
        System.out.println("\nSim Card Details:");
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Balance: " + currency);
        System.out.println("SIM ID: " + simId);
    }
}

public class Sim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for sim card details
        System.out.print("Enter Phone Number: ");
        long phoneNumber = sc.nextLong();
        System.out.print("Enter Initial Balance: ");
        double currency = sc.nextDouble();
        System.out.print("Enter SIM ID: ");
        String simId = sc.next();

        // Creating SimCard object
        SimCard sim = new SimCard(phoneNumber, currency, simId);

        // Performing operations
        sim.voiceCall();
        sim.message();
        sim.recharge
