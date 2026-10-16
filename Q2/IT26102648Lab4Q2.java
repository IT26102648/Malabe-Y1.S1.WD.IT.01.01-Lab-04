import java.util.Scanner;

public class IT26102648Lab4Q2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int examMarks,labMarks;
		double finalExamMarks,examPercentage,labPercentage;
		
		System.out.print("Please enter exam marks (out of 100): ");
		examMarks = input.nextInt();
		
		if ((examMarks > 100)||(examMarks < 0)){
			System.out.print("Invalid input for exam marks. Terminating program");
			return;
		}
		
		System.out.print("Please enter lab submission marks (out of 100): ");
		labMarks = input.nextInt();
		
		if ((labMarks > 100)||(labMarks < 0)){
			System.out.print("Invalid input for lab submission marks. Terminating program");
			return;
		}
		
		System.out.print("Please enter the percentage given for the exam (out of 100): ");
		examPercentage = input.nextDouble();
		
		System.out.print("Please enter the percentage given for the lab submission (out of 100): ");
		labPercentage = input.nextDouble();
		
		if (examPercentage+labPercentage != 100){
			System.out.print("The percentages must add up to 100. Terminating program");
			return;
		}
		
		finalExamMarks = (labMarks*labPercentage/100) + (examMarks*examPercentage/100);
		
		System.out.print("Final Exam mark is : "+ finalExamMarks );
	}	
}