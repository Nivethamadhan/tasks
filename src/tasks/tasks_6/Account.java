package tasks.tasks_6;

public class Account {


	    // Data members
	    private String accountNumber;
	    private String accountHolder;
	    private double balance;

	    // No-argument constructor
	    public Account() {
	        this.accountNumber = "";
	        this.accountHolder = "";
	        this.balance = 0.0;
	    }

	    // Constructor with two arguments
	    public Account(String accountNumber, String accountHolder) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = 0.0; // Initialize balance to 0.0
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: " + amount);
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    // Method to check balance
	    public double checkBalance() {
	        return balance;
	    }

	    // Method to display account details (optional)
	    public void displayAccountDetails() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Balance: " + balance);
	    }

	    // Main method to test the Account class
	    public static void main(String[] args) {
	        // Create an Account using the no-argument constructor
	        Account acc1 = new Account();
	        acc1.displayAccountDetails();

	        // Create an Account using the constructor with arguments
	        Account acc2 = new Account("123456789", "John Doe");
	        acc2.deposit(1000);
	        acc2.withdraw(250);
	        System.out.println("Balance after transactions: " + acc2.checkBalance());
	        acc2.displayAccountDetails();
	    }
	

	}


