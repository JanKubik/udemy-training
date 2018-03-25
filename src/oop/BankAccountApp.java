package oop;

public class BankAccountApp {

	public static void main(String[] args) {


		BankAccount acc1 = new BankAccount("465329874",1000);
		BankAccount acc2 = new BankAccount("111111111",2000);
		BankAccount acc3 = new BankAccount("3311111133",3000);	
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		System.out.println("The balance is:" + acc1.showBalance());
		acc1.makeDeposit(600);
		System.out.println("The balance is:" + acc1.showBalance());
		acc1.payBill(600);
		System.out.println("The balance is:" + acc1.showBalance());
		acc1.accrue();
		System.out.println(acc1.toString());
		
	}

}

class BankAccount implements IInterest{
	
	private static int ID = 1001;
	private String accountNumber;  //ID + random 2 digitnumber + first 2 of SSN
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;
	
	// construktor
	public BankAccount(String SSN,double initDeposit){
		this.SSN=SSN;
		balance = initDeposit;
		System.out.println("new account created");
		ID++;   // Everytimes we create account new ID is made
		// System.out.println("Account ID :"+ID);
		setAccountNumber();
		
		
	}

	private void setAccountNumber() {
		int random = (int) (Math.random()*100);
		accountNumber = ID+ ""+random + SSN.substring(0,1);
		System.out.println(accountNumber);		
	}
	
	
	public void setName(String name){
		this.name=name;		
		
	}
	
	public String getName(){
		return name;
	}
	
	public void payBill(double amount){
		balance = balance-amount;
		
	}
	
	public void makeDeposit(double amount){
	
		balance=balance+amount;
	}
	
	public double showBalance(){
		return balance;
	}

	@Override
	public void accrue() {
		balance = balance*(1+rate/100);
		System.out.println("The balance is:" + showBalance());
	}
	
	@Override
	public String toString(){
		return "[Name: " + name +"]\n[Account Number: " + accountNumber +"]\n"+"[Routing Number: " +routingNumber + "]\n"+"[Balance: "+balance +"]\n";
	}
	
		
}
