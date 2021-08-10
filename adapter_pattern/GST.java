package adapter_pattern;

public class GST implements Calctax{
	public float caltax(int p , float q) {
		return (float)(0.18*p*q);
	}
}
