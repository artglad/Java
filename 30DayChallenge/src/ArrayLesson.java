import java.util.Scanner;

/* This program creates an array of numbers 
 * and after asking user to fill it in, it 
 * prints the whole array */

public class ArrayLesson {

	public static void main(String[] args) {
		// Ask used for array size
		System.out.println("Enter size of array.");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		// Fill in the array of numbers
		System.out.println("Enter " + size + " numbers. Press enter after each number.");
		int[] grades = new int[size];

		
		for (int i = 0; i < size; i++) {
			grades[i] = in.nextInt();
		}

		// Display the contents of array
		for (int i = 0; i < size; i++) {
			System.out.println(grades[i]);
		}

		in.close(); 
	}

}
