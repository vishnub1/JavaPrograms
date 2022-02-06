// create a Employee and class and object and display the Employee Details

class Employee {
	int eno;
	String ename;
	String dept;
	double salary;
}
class OOP1 {
	public static void main(String[] args){
		Employee e1 = new Employee();
		e1.eno    = 101;
		e1.ename  = "HK";
		e1.dept   = "Core Java";
		e1.salary = 250000;

		Employee e2 = new Employee();
		e2.eno    = 102;
		e2.ename  = "VB";
		e2.dept	  = "Python";
		e2.salary = 30000;
        
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		System.out.println(e1.dept);
		System.out.println(e1.salary);
		System.out.println();

		System.out.println(e2.eno);
		System.out.println(e2.ename);
		System.out.println(e2.dept);
		System.out.println(e2.salary);


	}
}