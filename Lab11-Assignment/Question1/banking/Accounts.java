package banking;

public abstract class Accounts{

	protected int cust_id;
	protected String cust_name;
	protected double balance;
	public Accounts(){
		this.cust_id = 0;
		this.cust_name = "None";
		this.balance = 0.0;
	}

	public abstract void display();

}

// https://www.w3schools.com/java/java_packages.asp