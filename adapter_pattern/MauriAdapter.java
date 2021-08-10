package adapter_pattern;

public class MauriAdapter implements Calctax{
	public float caltax(int p , float q) {
		MauriTax m = new MauriTax();
		return m.caltax(p, q);
	}
}
