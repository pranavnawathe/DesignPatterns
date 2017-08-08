package Exercise;

import java.util.ArrayList;

public class Customer implements _______________ {// <<1

	String name;

	private ArrayList<Order> orders = new ArrayList<Order>();

	public void accept(Visitor visitor) {
		visitor._______________(this);// <<2	
		for (Order eachOrder: orders){
			eachOrder._______________(visitor);// <<3
		}
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public Customer(String name) {
		this.name = name;
	}
}
