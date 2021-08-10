package strategyPattern;

public class stcustomer extends customer{
	public stcustomer(String id , String name , String toc) {
		super(name,id);
		this.type = toc;
		this.d = new scdiscount();
	}
}
