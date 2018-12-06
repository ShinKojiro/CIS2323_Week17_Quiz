public abstract class Book{
	private String title;
	protected double price;
	
	public Book(String t){
		setTitle(t);
		setPrice();
	}
	
	public void setTitle(String t){
		title = t;
	}
	
	public String getTitle(){
		return title;
	}
	
	public abstract void setPrice();
	
	public double getPrice(){
		return price;
	}
}