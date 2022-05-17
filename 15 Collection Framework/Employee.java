public class Employee 
{
	public int id;
	public String name;
	public Integer age;

	Employee(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override 
	public String toString()
	{
		return " " + this.id + " " + this.name + " "+ this.age;
	}
}


import java.util.Comparator;
public class FirstComparator implements Comparator<Employee> 
{
	@Override 
	public int compare(Employee e1, Employee e2)
	{
		return e1.name.compareTo(e2.name);
	}
}


import java.util.Comparator;
public class SecondComparator implements Comparator<Employee>
{
	@Override 
	public int compare(Employee e1, Employee e2)
	{
		return - (e1.name).compareTo(e2.name);
	}
}




import java.util.Comparator;
public class ThirdComparator implements Comparator<Employee> 
{
	@Override 
	public int compare(Employee e1, Employee e2)
	{
		return e1.age - e2.age;
	}
}




import java.util.Comparator;
public class FourthComparator implements Comparator<Employee> 
{
	@Override
	public int compare(Employee e1, Employee e2)
	{
		return - (e1.age - e2.age);
	}
}




import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 
{
	public static void main(String[] args)
	{
		System.out.println("Sorting name -> Ascending Order");

		TreeSet<Employee> ts1 = new TreeSet<Employee>(new FirstComparator());

		ts1.add(new Employee(101, "Zaheer", 24));
		ts1.add(new Employee(201, "Aryan", 27));
		ts1.add(new Employee(301, "Pooja", 26));

		for (Employee e1 : ts1) {
			System.out.println(e1);
		}
		System.out.println("----------------------------------------");

		System.out.println("Sorting name -> Descending Order");

		TreeSet<Employee> ts2 = new TreeSet<>(new SecondComparator());		
		ts2.add(new Employee(101, "Zaheer", 24));
		ts2.add(new Employee(201, "Aryan", 27));
		ts2.add(new Employee(301, "Pooja", 26));

		for (Employee e2 : ts2) 
		{
			System.out.println(e2);
		}
		System.out.println("----------------------------------------");

		System.out.println("Sorting Age -> Ascending Order");
		TreeSet<Employee> ts3 = new TreeSet<>(new ThirdComparator());

		ts3.add(new Employee(101, "Zaheer", 24));
		ts3.add(new Employee(201, "Aryan", 27));
		ts3.add(new Employee(301, "Pooja", 26));

		for (Employee e3 : ts3) 
		{
			System.out.println(e3);
		}

		System.out.println("----------------------------------------");

		System.out.println("Sorting Age ->  Descending Order");
		TreeSet<Employee> ts4 = new TreeSet<>(new FourthComparator());

		ts4.add(new Employee(101, "Zaheer", 24));
		ts4.add(new Employee(201, "Aryan", 27));
		ts4.add(new Employee(301, "Pooja", 26));
		
		for (Employee e4 : ts4) 
		{
			System.out.println(e4);
		}
	}
}
