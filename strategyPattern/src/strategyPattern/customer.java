package strategyPattern;

public class customer {
	String name , id , type;
	discount d;
	
	public customer(String n , String id) {
		this.name = n;
		this.id = id;
	}
	
	void display(float price) {
		System.out.println("Name- "+this.name + '\n' + "ID "+this.id);
		System.out.println("Price is "+price);
		float v = d.caldis(price);
		System.out.println("Discount is" + v);
		System.out.println("Payment to be done is - "+ (price - v));
	}
}
