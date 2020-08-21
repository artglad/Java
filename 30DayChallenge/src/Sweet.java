import java.util.Scanner;

public class Sweet {

	public static void main(String[] args) {
		System.out.println("Enter your name");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		if(s.equals("Caleb")) {
			System.out.println("Hey Caleb");
		} else if(s.equals("Sally")) {
			System.out.println("Hey Sally");
		} else {
			System.out.println("You aren't welcome");
		}
		
		in.close();
	}

}
