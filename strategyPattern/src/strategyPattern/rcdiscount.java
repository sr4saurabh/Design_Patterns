package strategyPattern;

public class rcdiscount implements discount{
	public float caldis(float price) {
		return (float)(0.1*price);
	}
}
