package AssignmentInJava;

public class BankAccount {

	//private fields
	private int accountnumber;
	private String accountHolderName;
	private double balance;
	
	//constructor
	public BankAccount(int accountnumber, String accountHolderName, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	//public method for deposit
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Deposit: "+amount);
		}else {
			System.out.println("Deposit must be in positive");
		}
	}
	
	//public method for withdraw
	public void  withdraw(double amount) {
		if(amount>0 && amount < balance) {
			balance -=amount;
			System.out.println("Withdraw: "+amount);
		}else {
			System.out.println("Insufficient amount");
		}
	}
	
	//check balance
	public double getBalance() {
		return balance;
	}
	
	public void Display() {
		System.out.println("AccountNumber: "+accountnumber);
		System.out.println("AccountHolderName: "+accountHolderName);
		System.out.println("Balance: "+balance);
	}
	

	public static void main(String[] args) {
		
		BankAccount bank = new BankAccount(12345, "Suchithra",5000);
		bank.Display();
		bank.deposit(1000);
		bank.withdraw(5000);
		bank.withdraw(2000);
		System.out.println(bank.balance);
		
		

	}

}
