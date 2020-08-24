import java.util.Scanner;

public class Problem12 {

	/* ARRAY SOLUTION New
	 * program that takes numbers as input 
	 * to calculate and print the average of the numbers
	 */

	public static void main(String[] args) {
		int numberCount;
		int[] numArray;
		int average = 0;

		// Get numbers from user
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter how many numbers will be averaged: ");
		numberCount = input.nextInt();

		//Initialize array and fill it up
		numArray = new int[numberCount];
		
		System.out.print("Enter 3 numbers(press enter after each): ");
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = input.nextInt();
			average = average + numArray[i];
		}
		
		//Average the numbers and print the result
		average = average / numberCount;
		System.out.println("The average is " + average);
	}

}
