package ita.P2EXE1;


import org.junit.Test;
import static org.junit.Assert.*;


public class AppTest{
    BookStore _BookStoreTest = new BookStore();
    HardCoreSailor _HardCoreSailorTest;
    NoviceSailor _NoviceSailorTest;
    NonSailingGiftBuyer _NonSailingGiftBuyerTest;

    Book _book1 = new Book("Book1", "author1", 1);
    Book _book2 = new Book("Book2", "author2", 2);
    Book _book3 = new Book("Book3", "author3", 3);
    Book _book4 = new Book("Book4", "author4", 4);
    Book _book5 = new Book("Book5", "author5", 5);
    
    @Test
    public void Set_BookTest() {
		assertEquals(_book1.bookTitle, "Book1");
		assertEquals(_book4.bookAuthor, "author4");
	}
    
    @Test
    public void AddBooksInBookStoreTest() {
		assertTrue(_BookStoreTest.addBook(_book1));
		assertTrue(_BookStoreTest.addBook(_book3));
		assertTrue(_BookStoreTest.addBook(_book4));
		assertTrue(_BookStoreTest.addBook(_book5));
		assertEquals(_BookStoreTest.allBook.get(0).getAuthors(), "author1");
	}
    
    public void UserBuyABookTest() {
    	Book _booktest;
    	_booktest = _BookStoreTest.bookOrded("Book3");
    	_HardCoreSailorTest.hardCoreSailorWantThisBook(_booktest);
    	
		assertEquals(_HardCoreSailorTest.HardCoreSailorBooks.get(0), _book3);
	}
}
