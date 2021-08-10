package strategyPattern;

public class ftcustomer extends customer{
	public ftcustomer(String id , String name , String toc) {
		super(name,id);
		this.type = toc;
		this.d = new ftdiscount();
	}
}
