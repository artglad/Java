import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// Variables
		int firstNumber;
		int secondNumber;
		int result;
		
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
		result = firstNumber * secondNumber;
		
		//Print result
		System.out.println(firstNumber + 
				" x " + secondNumber +
				" = "+ result);
	}

}
