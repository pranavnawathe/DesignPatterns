package Exercise;

public class GeneralReport implements _______________{// <<4

	private int customersNo;
	private int ordersNo;

	public void visit(Customer customer)
	{
		System.out.println("Customer "+customer.name);
		customersNo ++;
	}
	public void visit(Order order)
	{
		System.out.println("Order "+order.name);
		ordersNo++;
	}

	public void displayResults()
	{
		System.out.println("Number of customers:" + customersNo);
		System.out.println("Number of orders:   " + ordersNo);
	}
}