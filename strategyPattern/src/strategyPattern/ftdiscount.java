package strategyPattern;

public class ftdiscount implements discount{
	public float caldis(float price) {
		return (float)(0.2*price);
	}
}
