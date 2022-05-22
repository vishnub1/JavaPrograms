package oops;

public class Employee {
	public static void main(String[] args) {
		EmpSetGet empSetGet = new EmpSetGet();
		empSetGet.setEmpId(122);
		empSetGet.setName("Vishnu");
		empSetGet.setAge(23);
		empSetGet.setDept("Developer");
		System.out.println("empID: "+empSetGet.getEmpId());
		System.out.println("empName: "+empSetGet.getName());
		System.out.println("empAge: "+empSetGet.getAge());
		System.out.println("empDept: "+empSetGet.getDept());	
		
	}
}


package oops;
public class EmpSetGet {
	private int empId;
	private String name;
	private int age;
	private String dept;

	public int getEmpId() {
		return empId;
	}
	public String getName()	{
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDept()	{
		return dept;
	}
	public void setEmpId( int empId){
		this.empId = empId;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge( int age) {
		this.age = age;
	}
	public void setDept(String dept){
		this.dept = dept;
	}
}

package oops;
abstract class Vehicle {
    abstract int getSpeed();
}

class Bike extends Vehicle {
    int getSpeed() {
        return 60;
    }
}

class Car extends Vehicle {
    int getSpeed() {
        return 70;
    }
}

public class TestVehicle {
    public static void main(String args[]) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        int bikespeed = bike.getSpeed();
        int carspeed = car.getSpeed();
        System.out.println("Speed of Bike is: " + bikespeed + " Km/h");
        System.out.println("Speed of Car is: " + carspeed + " Km/h");
    }
}

