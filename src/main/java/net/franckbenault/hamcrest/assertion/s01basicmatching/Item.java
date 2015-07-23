package net.franckbenault.hamcrest.assertion.s01basicmatching;

public class Item {

	private String name;
	
	private int price;
	
	public Item(String name, int price) {
		this.name= name;
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
}
