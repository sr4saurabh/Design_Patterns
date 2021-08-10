package strategyPattern;
import java.util.*;
public class StrategyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		customer c;
		int choice = 1;
		while(choice == 1) {
			System.out.println("Type 1 for regular customer\n 3 for first time customer \n 3 for senior customer");
			int f = scan.nextInt();
			if(f == 1) {
				System.out.println("Enter the total price ");
				float p = scan.nextFloat();
				c = new rtcustomer("Saurabh" , "1234sfadf3423" , "regular customer");
				c.display(p);
			}
			else
		    if(f == 2)
			{
		    	System.out.println("Enter the total price ");
				float p = scan.nextFloat();
				c = new ftcustomer("Saurabh" , "1234sfadf3423" , "first time customer");
				c.display(p);
			}
		    else
		    {
		    	System.out.println("Enter the total price ");
				float p = scan.nextFloat();
				c = new stcustomer("Saurabh" , "1234sfadf3423" , "senior customer");
				c.display(p);
		    }
			
			
			System.out.println("Enter 1 to continue , 0 to break off");
			choice = scan.nextInt();
		}
		System.out.println("bye :)");
	}

}
