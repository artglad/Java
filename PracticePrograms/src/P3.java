import java.util.Scanner;
/*Dividing two numbers and display the result with fraction */
public class P3 {

	public static void main(String[] args) {
		//Variables
		int firstNumber;
		int secondNumber;
		double result;
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		// Ask for user input
		System.out.println("Please enter first number: ");
		firstNumber = input.nextInt();
		
		System.out.println("Please enter second number: ");
		secondNumber = input.nextInt();
		
		//Calculate
		result = (double)firstNumber /secondNumber;
		
		// Return result
		System.out.println("The result is: " + String.format("%.2f", result));
		
	}

}
