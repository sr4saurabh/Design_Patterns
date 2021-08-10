package strategyPattern;

public class scdiscount implements discount{
	public float caldis(float price) {
		return (float)(0.25*price);
	}
}
