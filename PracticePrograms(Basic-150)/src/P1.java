import java.util.Scanner;

/* This program asks user for their name and
 * returns it back with greeting in UI window */
public class P1 {

	public static void main(String[] args) {
		//Prompt user to enter name
		System.out.print("Please type your name: ");
		
		//Scanner to get name
		Scanner input = new Scanner(System.in);
		String userName = input.next() + " " + input.next();
		
		//Greet and Return name
		System.out.println("Hello " + userName);
		
		input.close();
	}

}
