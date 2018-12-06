public class UseBook{
	public static void main(String[] args){
		Fiction fictionBook = new Fiction();
		NonFiction nonFictionBook = new NonFiction();
		
		
		System.out.println("The Fiction book is named " + fictionBook.getTitle() + " and costs $" + fictionBook.getPrice());
		System.out.println("The Non-Fiction book is named " + nonFictionBook.getTitle() + " and costs $" + nonFictionBook.getPrice());
		fictionBook.toString();
		nonFictionBook.toString();
	}
}