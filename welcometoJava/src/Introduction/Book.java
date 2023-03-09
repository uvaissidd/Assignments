package Introduction;

public class Book {
	int isbn;
	public Book(int isbn) {
		this.isbn = isbn;
		System.out.println("Book Number :"+isbn);
	}
	public void displayDetails() {
		String  title = "Harry Potter", author = "james";
		System.out.println("Title : "+title+" Author : "+author);
	}
	public void discountedPrice() {
		int price=1000 , disc,aprice;
		disc = (price*10)/100;
		aprice = price - disc;
		System.out.println("Price :"+price+ " Diccont : -"+disc+" Discounted price :"+aprice);
	}
	public static void main(String[] args) {
		Book book = new Book(9);
		book.displayDetails();
		book.discountedPrice();
	}

}
