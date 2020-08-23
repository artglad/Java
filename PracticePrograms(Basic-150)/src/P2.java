import java.util.Scanner;

/*Asking user for 2 numbers and adding them together*/

public class P2 {
	public static void main(String[] args) {
		// Variables
		int firstNumber;
		int secondNumber;
		int sum;
		
		//Scanner object
		Scanner input = new Scanner(System.in);
		
		//Ask user for numbers
		System.out.print("Please enter " +
					"first number: ");
		firstNumber = input.nextInt();
		System.out.print("Please enter " +
				"second number: ");
		secondNumber = input.nextInt();
		
		//Calculate sum
		sum = firstNumber + secondNumber;
		
		//Print result
		System.out.println("The sum is " + sum);
		
		input.close();
	}
}
