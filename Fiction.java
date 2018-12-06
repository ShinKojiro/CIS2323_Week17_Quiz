public class Fiction extends Book{
	
	public Fiction(){
		super("The Magical Magician");
	}
	
	@Override
	public void setPrice(){
		price = 24.99;
	}
	
	@Override
	public String toString(){
		return("The Fiction book is named " + getTitle() + " and costs $" + getPrice());
	}
}