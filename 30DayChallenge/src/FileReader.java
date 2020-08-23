import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*This program creates a file collection and fills it with 
 * student names from a text file. Then it displays the whole
 * collection using a loop */

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner with loaded file in project folder
		Scanner in = new Scanner(new File ("src/Students.txt"));

		// A collection of Strings filled with students from file
		List<String> students = new ArrayList<String>();
		
		while (in.hasNextLine()) {
			students.add(in.nextLine());
		}
		
		// Display contents of collection
		for(int i = 0; i < students.size(); i++ ) {
			System.out.println("name: " + students.get(i));
		}
		
		in.close();

	}
}
