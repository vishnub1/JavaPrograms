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
