public class UserOrder {
	public static void main(String[] args) {
		Order order = new Order();
		ShippedOrder shipped = new ShippedOrder();

		order.set_customer_name();
		order.set_customer_number();
		order.set_quantity();
		order.set_unit_price();
		order.computeTotalPrice();
		System.out.println("\nOrder Details:");
		order.display();

		shipped.set_customer_name();
		shipped.set_customer_number();
		shipped.set_quantity();
		shipped.set_unit_price();
		shipped.computeTotalPrice();
		System.out.println("\nShipped Order Details:");
		shipped.display();
	}
}