/**
 * Filename: StudentRegistration
 * 
 * @author SaidHoudane
 * 
 * Since 5/2/2018
 *
 */
public class Student {
	private String firstName;
	private String lastName;
	private String ID;
	private boolean paidTuition;

	public Student() {

	}

	public Student(String first, String last, String id, boolean paid) {
		firstName = first;
		lastName = last;
		ID = id;
		paidTuition = paid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setPaidTuition(boolean paidTuition) {
		this.paidTuition = paidTuition;
	}

	public boolean hasPaidTuition() {
		return paidTuition;
	}

	public String toString() {
		String s = firstName + " " + lastName + "(ID: " + ID + "); tuition: ";
		if (paidTuition)
			s += "paid";
		else
			s += "not paid";
		return s;
	}
}
