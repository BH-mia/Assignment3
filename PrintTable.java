import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in); //scanner initiation
		
		System.out.println("Input the height of the table: ");
		int height = scan.nextInt(); //height input
		
		System.out.println("Input the width of the table: ");
		int width = scan.nextInt(); //width input
		
		Table x = new Table(height, width); 
		// calls a table constructor with width and height equal to user's inputs
		x.getNumbers(); // prints the table
		
		scan.close();

	}

}