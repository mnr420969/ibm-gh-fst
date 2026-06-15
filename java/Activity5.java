package fst;

abstract class Book {
	
	String title;
	
	abstract void setTitle(String title);
	
	String getTitle() {
		return title;
	}
}

class MyBook extends Book{
	public void setTitle(String title) {
		this.title = title;
	}
}

public class Activity5{
	public static void main(String[] args) {
		
		String title = "Harry Potter";
		MyBook book1 = new MyBook();
		book1.setTitle(title);
		
		System.out.println("The title is "+ book1.getTitle());
		}
	}
