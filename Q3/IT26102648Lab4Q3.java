import java.util.Scanner;

public class IT26102648Lab4Q3{
	public static void main(String[]args){
		int number;
		String status;

		System.out.print("Enter a number: ");
		
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		status = (number < 0) ? "Negative" : (number > 0) ? "Positive" : "Zero" ;
		
		System.out.print("The number is: " + status);
	}
}