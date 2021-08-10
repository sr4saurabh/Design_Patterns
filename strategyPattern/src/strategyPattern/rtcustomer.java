package strategyPattern;

public class rtcustomer extends customer{
	public rtcustomer(String id , String name , String toc) {
		super(name,id);
		this.type = toc;
		this.d = new rcdiscount();
	}
}
