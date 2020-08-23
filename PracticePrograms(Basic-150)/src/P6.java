import java.util.Scanner;

public class P6 {

	/* 
	 * print the sum (addition), multiply, subtract, 
	 * divide and remainder of two numbers 
	 */

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		int sum,sub,mult,div,remainder;

		Scanner input = new Scanner(System.in);

		// Ask user for input
		System.out.print("Please enter " + "first number: ");
		firstNumber = input.nextInt();
		System.out.print("Please enter " + "second number: ");
		secondNumber = input.nextInt();
		
		//Calculate outputs
		sum = firstNumber + secondNumber;
		sub = firstNumber - secondNumber;
		mult = firstNumber * secondNumber;
		div = firstNumber / secondNumber;
		remainder = firstNumber % secondNumber;
		
		//Display
		System.out.print(firstNumber + " + " + secondNumber + " = " + sum + "\n" +
				firstNumber + " - " + secondNumber + " = " + sub + "\n" +
				firstNumber + " * " + secondNumber + " = " + mult + "\n" +
				firstNumber + " / " + secondNumber + " = " + div + "\n" +
				firstNumber + " mod " + secondNumber + " = " + remainder + "\n");
		
		input.close();
	}

}
