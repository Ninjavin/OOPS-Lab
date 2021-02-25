package banking;
import java.util.*;
import current.*;
import saving.*;

public class bank{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Curr_acc ca = new Curr_acc();
		
		System.out.print("Enter Name of Current Account holder : ");
		ca.cust_name = sc.next();
		System.out.print("Enter ID of Current Account holder : ");
		ca.cust_id = sc.nextInt();
		System.out.print("Enter amount to be deposited to Current Account : ");
		ca.deposit(sc.nextDouble());
		System.out.print("Enter amount to be withdrawn from Current Account : ");
		ca.withdraw(sc.nextDouble());
		Sav_acc sa = new Sav_acc();
		System.out.print("Enter Name of Savings Account holder : ");
		sa.cust_name = sc.next();
		System.out.print("Enter ID of Savings Account holder : ");
		sa.cust_id = sc.nextInt();
		System.out.print("Enter amount to be deposited to Savings Account : ");
		sa.deposit(sc.nextDouble());
		System.out.print("Enter amount to be withdrawn from Savings Account : ");
		sa.withdraw(sc.nextDouble());

		ca.display();
		sa.display();
	}
}