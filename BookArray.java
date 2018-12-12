import java.util.*;

public class BookArray{
	public static void main(String[] args){
		String titleChoice;
		int bookTypeChoice;
		int bookCount = 0;
		String[] books = new String[10];
		int[] bookType = new int[10];
		boolean trySuccess = false;
		Scanner inputDevice = new Scanner(System.in);

		while(bookCount != 10){
			System.out.print("Enter book name: ");
			titleChoice = inputDevice.nextLine();
			books[bookCount] = titleChoice;
			System.out.println("1) Fiction\n2) Non-Fiction");
			while(trySuccess == false){
				try{
					bookTypeChoice = inputDevice.nextInt();
					bookType[bookCount] = bookTypeChoice;
					inputDevice.nextLine();
					trySuccess = true;
				}
				catch(InputMismatchException e){
					System.out.println("Enter 1 or 2");
					inputDevice.nextLine();
				}
			}
			
			bookCount ++;
			trySuccess = false;
		}

		inputDevice.close();
		
		for(int i = 0; i < 10; i++){
			if(bookType[i] == 1){
				System.out.println(books[i] + ": Fiction");
			}
			else if(bookType[i] == 2){
				System.out.println(books[i] + ": Non-Fiction");
			}	
		}
	}
}