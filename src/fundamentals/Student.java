package fundamentals;

public class Student {

	static String sCollName;
	String sName;
	int sRollNo;
	static String sQualification;

	public Student(String sCollName, String sName, int sRollNo, String sQualification) {
		this.sCollName = sCollName;
		this.sName = sName;
		this.sRollNo = sRollNo;
		this.sQualification = sQualification;
	}

	public void displayStudentDetails() {
		System.out.println("College Name: " + this.sCollName);
		System.out.println("Student Name: " + this.sName);
		System.out.println("Student Rll No: " + this.sRollNo);
		System.out.println("Student Qualification: " + this.sQualification);
	}

	public static void main(String[] args) {

		Student student1 = new Student("BVR College", "RAM", 1001, "10th Class");
		Student student2 = new Student("BVR College", "KRISH", 1002, "10th Class");
		Student student3 = new Student("BVR College", "VENKAT", 1003, "10th Class");

		System.out.println("---------------------------Student1 Details------------------");
		student1.displayStudentDetails();
		
		System.out.println("---------------------------Student2 Details------------------");
		student2.displayStudentDetails();
		
		System.out.println("---------------------------Student3 Details------------------");
		student3.displayStudentDetails();
		
		System.out.println("---------------------------Student1 Details------------------");		
		student1.sName = "RAMESH";
		student1.sCollName = "BVK";
		student1.displayStudentDetails();
		
		System.out.println("---------------------------Student3 Details------------------");
		student3.displayStudentDetails();
	}

}
