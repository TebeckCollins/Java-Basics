import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class collections {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("studentsList.txt"));
		
		List<String> students = new ArrayList<String>();
		while(input.hasNextLine()) {
			students.add(input.nextLine());
		}
		
		for (int i = 0; i < students.size(); i++)
		{
			System.out.println("Student name is: " + students.get(i));
		}
		input.close();
		
		User student1 = new User();
		student1.setNames("Tebeck", "Collins");
		User student2 = new User();
		student2.setNames("mustapha", "xpi");
		User student3 = new User();
		student3.setNames("bih", "shedoo");
		
		List<User> users = new ArrayList<User>();
		users.add(student1);
		users.add(student2);
		users.add(student3);
		
		
		System.out.println(student1);
	}

}