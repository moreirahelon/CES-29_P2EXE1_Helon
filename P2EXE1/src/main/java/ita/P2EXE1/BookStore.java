package ita.P2EXE1;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    public List<Book> allBook = new ArrayList<Book>();

    public BookStore() {
        this.allBook = new ArrayList<Book>();
    }

    public boolean addBook(Book book) {
    	Book _book = new Book(book.bookTitle,book.bookAuthor, book.bookPrice);
    	boolean flag = true;
    	try{
    		Persistir(_book);
    	}catch(Exception e){
			System.out.println(e.getMessage());
			flag = false;
		}
        
        return flag;
    }

    void Persistir(Book book) throws Exception{
		allBook.add(book);
	}
    
    public ArrayList<Book> ListOfBooks(String title) {
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book b: allBook) {
            if(title.compareTo(b.getTitle())== 0) {
                result.add(b);
            }
        }
        return result;
    }
    
    public Book bookOrded(String Title){
    	Book result = null;
    	for(Book b: allBook) {
            if(Title.compareTo(b.getTitle())== 0) {
                result = b;
            }
    	}
        return result;
    }

    public String toString() {
        StringBuilder sb=new StringBuilder();
        for(Book b:allBook) sb.append(b.toString());
        return sb.toString();
    }
}
