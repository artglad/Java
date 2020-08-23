import java.util.Scanner;

/* print the area and perimeter of a circle */

public class Problem11 {

	public static void main(String[] args) {
		double radius;
		double perimeter;
		double area;
		
		// Scanner object to get radius size from user
		Scanner input = new Scanner(System.in);

		System.out.print("Enter radius of the circle: ");
		radius = input.nextDouble();
		
		//Calculate perimeter and area
		perimeter = 2 * Math.PI * radius;
		area = Math.PI * radius * radius;
		
		//Display the result
		System.out.print("Perimeter is " + perimeter + "\n" 
						+ "Area is " + area);
		input.close();
	}
}
