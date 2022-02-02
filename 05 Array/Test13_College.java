// develop a program to read multiple students values 
// store each student values(sno ,sname, course,fee)in separate student instance 
//store all student instance in an array 
// at end display each student values on console separately

import java.util.Scanner;

class Student {
	int		sno;
	String	sname;
	String	course;
	double	fee;
}
	class Test13_College{
		public static void main(String[] args){

			Scanner scn = new Scanner(System.in);

			System.out.print("how many application do you want to enter:");

			final int size = scn.nextInt();
			Student[] studentsArray = new Student[size];

			for (int i=0; i<size; i++){
				System.out.println("\n Enter Student "+(i+1)+"  values");

				Student student = new Student();

				System.out.print("sno\t:");
				student.sno = scn.nextInt();scn.nextLine();

				System.out.print("sname\t:");
				student.sname = scn.nextLine();

				System.out.print("course\t:");
				student.course = scn.nextLine();

				System.out.print("fee\t:");
				student.fee = scn.nextDouble();
	
			studentsArray[i] = student;
			System.out.println("Student  "+(i+1)+"  details are stored");
		}
			System.out.println("\n Student details");

			for (int i= 0;i<size ;i++ ) {
				Student student = studentsArray[i];
				System.out.println("Student("+student.sno+","+student.sname+","+student.course+","+student.fee+")");
			}
		}

	}