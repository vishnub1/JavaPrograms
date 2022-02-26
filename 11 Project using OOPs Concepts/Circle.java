public class Circle implements Shape {
	public static final double PI= 3.14f;
	private double radius;

	public Circle(double radius){
		this.radius = radius;
	}
	public void area(){
		System.out.println("Circle area :"+(PI*radius*radius));
	}
	public void perimeter(){
		System.out.println("Circle Perimeter :"+(2*PI*radius));
	}
	public void printlnRadius(){
		System.out.println("radius :"+radius);
	}
}