import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get = new Scanner(System.in);
		int choice = 0, product = 0;
		boolean condition = false;

		do {
			System.out.println("From which company, you want to order?\n1. Msi\n2. Asus\n");

			choice = get.nextInt();
			
			if (choice == 1) {
				Company msi = new MsiManufacturer();
				
				System.out.println("Which product do you want to order?\n1. GPU\n2. Monitor\n");
				product = get.nextInt();
				
				if (product == 1) {
					msi.createGPU();
				} else if (product == 2) {
					msi.createMonitor();
				}
				
			} else if (choice == 2) {
				Company asus = new AsusManufacturer();	
				
				System.out.println("Which product do you want to order?\n1. GPU\n2. Monitor\n");
				product = get.nextInt();
				
				if (product == 1) {
					asus.createGPU();
				} else if (product == 2) {
					asus.createMonitor();
				}
			} else {
				System.out.println("Invalid order choice!");
			} 
			
			System.out.println("Want to order(Yes/No)?\n");
			String order_choice = get.next();
			condition = (order_choice.equals("Yes") || order_choice.equals("yes")) ? true : false;
			
		} while (condition);
		
		System.out.println("*** Product ordered! ----- Order will be delivered in 2 days ***");
		System.out.println("*** Thank You! ----- Have a good day! :) ***");
	}
}
