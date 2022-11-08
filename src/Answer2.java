import java.util.Scanner;

public class Answer2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		boolean cont = true;
		
		while (cont) {
			System.out.println("Welcome to the Download Time Estimator\n");
			System.out.print("Enter file size (MB): ");
			int fileSize = in.nextInt();
			System.out.print("Enter download speed (MB/sec): ");
			int sec = in.nextInt();
			
			double total = fileSize/sec;
			double mins = 0, hrs = 0, secs = 0;
			hrs = (total/60) / 60;
			mins = (total/60) % 60;
			secs = total % 60;
			
			System.out.println("\nThis download will take approximately " + (int)hrs + " hours "+ (int)mins 
					+ " minutes "+ (int)secs + " seconds");
			
			System.out.println("\nContinue? (y/n): ");
			String yn = in.next().toLowerCase();
			cont = yn.charAt(0) == 'y' ? true : false;
			System.out.println();
		
		}
		
	}
}
