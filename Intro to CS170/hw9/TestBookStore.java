public class TestBookStore{

	public static void main(String[] args){
		
		int maxBookCount=2, maxPurchaseCount=2;
		
		BookStore bookStore = new BookStore(maxBookCount, maxPurchaseCount);
		
		bookStore.addBook("1Q84", "Murakami", 40,2);
		bookStore.addBook("Fictions", "Borges", 15,5);
		bookStore.addBook("The_next_100_years", "Friedman", 20,3);
		bookStore.addBook("1Q84", "Murakami", 40,2);
bookStore.addBook("The_next_100_years", "Friedman", 20,3);
		
		
		bookStore.printBookStore();
		bookStore.buy("John", "Fictions", "Borges", 20);
		bookStore.printBookStore();
		bookStore.buy("John", "Fictions", "Borges", 20);
		bookStore.printBookStore();
	bookStore.buy("John", "Fictions", "Borges", 20);
	}

}