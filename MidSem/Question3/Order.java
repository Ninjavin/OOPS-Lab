import java.util.*;

public class Order{
	String customer_name;
	Integer customer_number, quantity;
	Double unit_price, total_price;

	private Scanner sc = new Scanner(System.in);

	public String get_customer_name(){
		return customer_name;
	}

	public void set_customer_name(){
		System.out.print("Enter customer name: ");
		this.customer_name = this.sc.nextLine();
	}

	public Integer get_customer_number(){
		return customer_number;
	}

	public void set_customer_number(){
		System.out.print("Enter customer number: ");
		this.customer_number = Integer.parseInt(this.sc.nextLine());
	}

	public Integer get_quantity(){
		return quantity;
	}

	public void set_quantity(){
		System.out.print("Enter Quantity: ");
		this.quantity = Integer.parseInt(this.sc.nextLine());
	}

	public Double get_unit_price(){
		return unit_price;
	}

	public void set_unit_price(){
		System.out.print("Enter Unit Price: ");
		this.unit_price = Double.parseDouble(this.sc.nextLine());
	}

	public Double computeTotalPrice(){
		this.total_price = this.quantity * this.unit_price;
		return this.total_price;
	}

	public void display(){
		System.out.println("Customer Name : " + this.customer_name);
		System.out.println("Customer Number : " + this.customer_number);
		System.out.println("Quantity : " + this.quantity);
		System.out.println("Unit Price : " + this.unit_price);
		System.out.println("Total Price : " + this.total_price);
		System.out.println();
	}
}