import java.util.Scanner;

public class IT26102648Lab4Q1{
	public static void main(String[]args){
		int number;

		System.out.print("Enter a number: ");
		
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		if (number > 0){
			System.out.print("The number is: Positive");
		}else if (number == 0){
			System.out.print("The number is Zero");
		}else{
			System.out.print("The number is: Negative");
		}
	}
}