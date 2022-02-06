class Book {
	String bname;
	String author;
	double price;
}
class OOP3 {
	public static void main(String[] args){
		Book b1 = new Book();
		b1.bname  = "Mrutunjay";
		b1.author = "karn";
		b1.price  = 450;

		Book b2 = new Book();
		b2.bname  = "Shyam chi aai";
		b2.author = "Sane Guruji";
		b2.price  = 850;

		Book b3 = new Book();
		b3.bname  = "chanakya niti";
		b3.author = "chanakya";
		b3.price  = 1150;

		System.out.println("Book name :"+b1.bname);
		System.out.println("Author    :"+b1.author);
		System.out.println("price     :"+b1.price);
		System.out.println();

		System.out.println("Book name :"+b2.bname);
		System.out.println("Author    :"+b2.author);
		System.out.println("price     :"+b2.price);
		System.out.println();

		System.out.println("Book name :"+b3.bname);
		System.out.println("Author    :"+b3.author);
		System.out.println("price     :"+b3.price);
		System.out.println();


	}
}