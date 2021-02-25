public class CheckingAccount { 
	
	int accNo; 
	double bal;
	boolean reducedToZero; 

	public CheckingAccount(int accNo, double bal)	{ 
		this.accNo = accNo; 
		this.bal = bal; 
		if (this.bal < 200.00) { 
			this.bal = 0; 
			reducedToZero = true; 
		} 
	} 

	public String toString() { 
		String details = "Account Number: " + accNo + "\nBalance: $" + bal; 
		if (reducedToZero) { 
			details += "\nNOTE: The balance was reduced to 0 " + "because it was below the required $200.00 minimum."; 
		} 
		return details; 
	} 

} 
