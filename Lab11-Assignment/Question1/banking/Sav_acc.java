package saving;
import banking.Accounts;

public class Sav_acc extends Accounts{
	static double dwl;

	public Sav_acc(){
		balance = 1000;
	}
	
	public void withdraw(double amount){
		dwl = 0.5 * balance;
		if(dwl > amount){
			System.out.println("--Withdrawal Successful into Savings Account--");
			balance = balance - amount;
		} else 
			System.out.println("--Withdrawal Unsuccessful into Savings Account--");
	}
		
	public void deposit(double amount){
		balance = balance + amount;
		System.out.println("--Deposition Successful into Savings Account--");
	}
	
	public void display(){
		System.out.println("\n---Savings Account Details---");
		System.out.println("Customer Name : "+cust_name);
		System.out.println("Customer ID : "+cust_id);
		System.out.println("Balance : "+balance);
	}

}