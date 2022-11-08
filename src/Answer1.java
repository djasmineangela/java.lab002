import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
//	    String stringAmount = in.nextLine();
//	    float amount = Float.parseFloat(stringAmount);
		
		boolean cont = true;
		int ctr = 0;
		float totalInvoice = 0, totalDisc = 0; 
	    
		while (cont) {
			System.out.println("Welcome to the Invoice Total Calculator");
			System.out.println();
			System.out.print("Enter subtotal: " );
			float subtotal = in.nextFloat();
			System.out.print("Discount percent: " );
			float discountpct = in.nextFloat();
			float discAmount = subtotal*discountpct;
			System.out.println("Discount amount: " + discAmount);
			float total = subtotal - discAmount;
			System.out.println("Invoice total: " + total);
			ctr++;
			totalInvoice += total;
			totalDisc += discAmount;
			System.out.println();
			System.out.print("Continue? (y/n): " );
			String yn = in.next().toLowerCase();
			cont = yn.charAt(0) == 'y' ? true : false;
			System.out.println();
			
			
		}
		
		System.out.println("Number of invoices: " + ctr);
		System.out.println("Average invoice: " + totalInvoice/ctr);
		System.out.println("Average discount: " + totalDisc/ctr);
		
		
		
		

	}

}
