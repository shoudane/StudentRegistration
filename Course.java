public class Course {
	private String name;
	private int maxStudents;
	private Student[] enrolled;
	private int numEnrolled;

	public Course(String name, int max) {
		this.name = name;
		this.maxStudents = max;
		this.enrolled = new Student[max];
		numEnrolled = 0;
	}

	public int getNumEnrolled() {
		return numEnrolled;
	}

	public Student getStudent(int index) {
		if (index < 0 || index >= numEnrolled)
			return null;
		else
			return enrolled[index];
	}

	public boolean addStudent(Student s) {
		if (numEnrolled < maxStudents && s.hasPaidTuition()) {
			enrolled[numEnrolled++] = s;
			return true;
		} else
			return false;
	}

	public boolean dropStudent(Student s) {
		int index = -1;
		for (int i = 0; i < numEnrolled; i++) {
			if (enrolled[i].getID().equals(s.getID())) {
				index = i;
				break;
			}
		}

		if (index == -1) // not found
			return false;

		// shift all students one position to left to cover the removed student
		for (int i = index + 1; i < numEnrolled; i++)
			enrolled[i - 1] = enrolled[i];
		numEnrolled--;
		return true;
	}

	public String toString() {
		String s = "Course Name: " + name + "\n";
		s += "Number enrolled: " + numEnrolled + "\n";
		s += "Maximum capacity: " + maxStudents + "\n\n";
		s += "Roster\n";
		for (int i = 0; i < numEnrolled; i++) {
			s += (i + 1) + ". " + enrolled[i] + "\n";
		}
		return s;
	}

}