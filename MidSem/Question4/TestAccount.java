import java.util.Scanner; 

public class TestAccount { 
	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number for account #1: "); 
		int accNo = sc.nextInt(); 
		System.out.print("Enter the balance for account #1: "); 
		double bal = sc.nextDouble(); 

		CheckingAccount account1 = new CheckingAccount(accNo, bal); 

		System.out.print("Enter the number for account #2: "); 
		accNo = sc.nextInt(); 
		System.out.print("Enter the balance for account #2: "); 
		bal = sc.nextDouble(); 

		CheckingAccount account2 = new CheckingAccount(accNo, bal); 
		
		System.out.println("ACCOUNT 1:"); 
		System.out.println(account1); 
		System.out.println("ACCOUNT 2:"); 
		System.out.println(account2); 
	} 
} 
