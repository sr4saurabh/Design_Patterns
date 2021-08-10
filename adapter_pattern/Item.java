package adapter_pattern;

public class Item {
	
	int qty;
	float price;
	String name;
	Calctax ct;
	public Item(String name , int q , float p , Calctax f) {
		this.qty = q;
		this.price = p;
		this.ct = f;
		this.name = name;
	}
	void display() {
		System.out.println("Name "+name+"\n"+"Price "+price+"\n"+ "QTY "+ qty);
		System.out.println("Total tax by gst = " + this.ct.caltax(this.qty , this.price));
	}
	
	void setTax(Calctax set) {
		this.ct = set;
	}
	void setQuant(int q) {
		this.qty = q;
	}
	
}
