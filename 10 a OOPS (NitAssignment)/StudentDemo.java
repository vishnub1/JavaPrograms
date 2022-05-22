class Studen
{
	int rollNumber;
	String studentName;
	String address;
	static String collegeName = "JNTU";
	
	public StudentDemo(int rollNumber, String studentName, String address) 
	{
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.address = address;
	}
	
	public void showStudentData()
	{
		System.out.println("Student Roll Number is :"+rollNumber);
		System.out.println("Student Name is :"+studentName);
		System.out.println("Student address is :"+address);
		System.out.println("College Name is :"+collegeName);
	}
}

public class StudentDemo 
{

	public static void main(String[] args) 
	{
		StudentDemo s1 = new StudentDemo(111, "Virat", "Bangalore"); s1.showStudentData();
		
		StudentDemo s2 = new StudentDemo(222, "Rahul", "Punjab"); s2.showStudentData();
		
		StudentDemo s3 = new StudentDemo(333, "Rohit", "Mumbai"); s3.showStudentData();
		
		StudentDemo s4 = new StudentDemo(444, "Dhoni", "Chennai"); s4.showStudentData();
		
	}

}
