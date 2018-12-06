public class NonFiction extends Book{
	
	public NonFiction(){
		super("American Government");
	}
	
	@Override
	public void setPrice(){
		price = 37.99;
	}
	
	@Override
	public String toString(){
		return("The Non-Fiction book is named " + getTitle() + " and costs $" + getPrice());
	}
}