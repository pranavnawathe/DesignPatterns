package Exercise;

import java.util.ArrayList;

public class Order implements _______________ { // <<5

	String name;

	private ArrayList<String> items = new ArrayList<String>();

	public Order(String name) {
		this.name = name;
	}

	public void accept(Visitor visitor) {
		visitor._______________(this); // <<6
	}

	public void addItem(String item) {
		items.add(item);
	}

}
