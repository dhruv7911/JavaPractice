public class Book{
    private String title;
    private String author;
    private int pageCount;
    private boolean isAvailable;

    public void borrowBook(){
	if(isAvailable){
	    isAvailable = false;
	    System.out.println("Book borrowed successfully!");
	}
	else{
	   System.out.println("Sorry,this book is already checked out.");
	}
    }
    public void returnBook(){
	    isAvailable = true;
	    System.out.println("Book returned successfully!");
    }
    public void getDetails(){
	    System.out.println("Title: "+title+",Author: "+author+",Pages: "+pageCount+",Available: "+isAvailable);
    }
    public Book(String title,String author,int pageCount,boolean isAvailable){
	this.title= title;
	this.author = author;
	this.pageCount = pageCount;
	this.isAvailable = isAvailable;
    }
    public static void main(String[] args){
	Book book1 = new Book("The Maritan","Andy weir",369,true);
	Book book2 = new Book("Dune","Frank Herbert",412,false);
	book1.getDetails();
	book1.borrowBook();
	book1.borrowBook();
	book1.returnBook();

    }

}

