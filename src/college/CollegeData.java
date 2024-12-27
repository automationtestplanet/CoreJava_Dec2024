package college;

public class CollegeData {

	final String COLLEGE_NAME = "BVR College";  // constants
	int collegeCode = 12345;
	String collegeLocation = "Ameerpet, Hyderabad";

	void displayCollegeDetails() {
		System.out.println("College Name: " + COLLEGE_NAME);
		System.out.println("College Code: " + collegeCode);
		System.out.println("College Location: " + collegeLocation);
	}
}
