public class RP {
	public static void main(String[] args){
		// normal object exicution
		Rectangle r = new Rectangle (40,20);
		r.area();
		r.perimeter();
		r.printLB();
		System.out.println();
		
		Square sq = new Square(10);
		sq.area();
		sq.perimeter();
		sq.printS();
		System.out.println();

		Circle c = new Circle(10);
		c.area();
		c.perimeter();
		c.printlnRadius();
		System.out.println();

		/*in the above code we have design problems that is all above object are
		referenced object so they are not eligible for garbage collection automatically.
		Hence we must write extra code to make them eligible for garbage collection like as below.
		*/
		 r= null ; sq = null; c=null;
		
		/* 
		BY implimentatin RP or Upcastig we can avoid above three line o fcode ,
		not only this we avoid creation of the three referenced variable.
		*/


		// upcasting 
		Shape s;

		s = new Rectangle(20,10);
		s.area();
		s.perimeter();
//		((Square)s).printS();
		System.out.println();
/*
		s = new Circle(10);
		s.area();
		s.perimeter();
		((Circle)s).printlnRadius();
		((Circle)s).area();

		callAP(new Rectangle(20,10));
		callAP(new Square(10));
		callAP(new Circle(10));
	}
	static void callAP(Shape s){
		s.area();
		s.perimeter();


		// implements downcasting to invoke subclass specific members.

		((Rectangle)s).printLB();
		((Square)s).printS();
		((Circle)s).printlnRadius();
*/

		// Think a minute is aboove downcasting code execute?
		// Ohhh, yes i got it It leads to classCastException
		//Rectange object cannot be to SQUaRE.

		/*
		when we write a method with super class peremete type, we should not down
		cast the super class reference variable directly into sublcass type because we
		cannot gaurantee the coming subclass object at runtime.

		if user passes other sublcass object then it leads to RE CCE because sublcass
		are not compartible with each other.
		
		to solve CCE always we must use "instanceof" operator (Keyword) to verify object type like as below

	#	Below code is valid 

		*/

		if(s instanceof Rectangle){
			((Rectangle)s).printLB();
		}
		else if (s instanceof Square){
			((Square)s).printS();
		}
		else if(s instanceof Circle){
			((Circle)s).printlnRadius();
		}
	}

}