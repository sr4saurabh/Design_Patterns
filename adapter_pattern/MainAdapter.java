package adapter_pattern;

public class MainAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calctax ct = new MauriAdapter();
		Item i1 = new Item("Audi A3" , 2 , 1000500 , ct);
		i1.setTax(new GST());
		i1.display();
	}

}
