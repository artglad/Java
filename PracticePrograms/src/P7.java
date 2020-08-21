import java.util.Scanner;

public class P7 {
	/* takes a number as input and prints its multiplication table up to 10 */
	public static void main(String[] args) {
		int number;
		
		//Get a number from user
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		number = input.nextInt();
		
		//Solve and display
		for (int i = 1; i < 11; i++) {
			System.out.println(number + " x " + i + " = " + number*i);
		}
	}

}
