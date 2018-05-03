import java.util.Scanner;

public class Driver {
	static Scanner keyboard = new Scanner(System.in);

	public static Student inputStudent() {
		Student s = new Student();
		String str;
		System.out.println("Enter student details");

		System.out.print("\tFirst name: ");
		str = keyboard.next();
		s.setFirstName(str);

		System.out.print("\tLast name: ");
		str = keyboard.next();
		s.setLastName(str);

		System.out.print("\tID: ");
		str = keyboard.next();
		s.setID(str);

		System.out.print("\tPaid tuition? (y/n): ");
		str = keyboard.next();
		if (str.equalsIgnoreCase("y"))
			s.setPaidTuition(true);
		else
			s.setPaidTuition(false);
		return s;
	}

	public static void main(String[] args) {
		String courseName;
		int max;

		System.out.print("Enter course name: ");
		courseName = keyboard.nextLine();

		System.out.print("Enter the max no. of students for the course: ");
		max = keyboard.nextInt();

		Course course = new Course(courseName, max);

		boolean done = false;
		int choice;
		Student s;
		String id;
		while (!done) {
			System.out.println("1. Add student");
			System.out.println("2. Drop student");
			System.out.println("3. Display course information");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = keyboard.nextInt();

			switch (choice) {
			case 1:
				s = inputStudent();
				if (course.addStudent(s))
					System.out.println("Student added successfully");
				else
					System.out.println("Student not added!");
				break;
			case 2:
				System.out.print("Enter Id of student to be dropped: ");
				id = keyboard.next();
				s = new Student(); // a dummy student with id set
				s.setID(id);
				if (course.dropStudent(s))
					System.out.println("Student dropped successfully");
				else
					System.out.println("Course does not have student with ID " + s.getID());
				break;

			case 3:
				System.out.println(course);
				break;
			case 4:
				done = true;
				break;
			default:
				System.out.println("Invalid menu choice!");
			}
			System.out.println();
		}
	}

}
