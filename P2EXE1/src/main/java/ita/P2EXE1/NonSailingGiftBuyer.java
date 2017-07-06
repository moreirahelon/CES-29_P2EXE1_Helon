package ita.P2EXE1;

import java.util.ArrayList;

public class NonSailingGiftBuyer extends Costumer{
	private ArrayList<Book> NonSailingGiftBuyerBooks = new ArrayList<Book>();
	
	public void NonSailingGiftBuyerWantThisBook(Book book){
		NonSailingGiftBuyerBooks.add(book);
	}
}
