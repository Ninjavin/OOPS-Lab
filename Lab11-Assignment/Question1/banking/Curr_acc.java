package current;
import banking.Accounts;

public class Curr_acc extends Accounts{

	public Curr_acc(){
		balance = 0;
	}
	
	public void withdraw(double amount){
		balance = balance - amount;
		System.out.println("--Withdrawal Successful into Current Account--");
	}
	
	public void deposit(double amount){
		if(amount > 10000){
			System.out.println("--Deposition Successful into Current Account--");
			balance = balance + amount;
		} else
			System.out.println("--Deposition Unsuccessful into Current Account--");
	}
		
	public void display(){
		System.out.println("\n---Current Account Details---");
		System.out.println("Customer Name : "+cust_name);
		System.out.println("Customer ID : "+cust_id);
		System.out.println("Balance : "+balance);
	}

}