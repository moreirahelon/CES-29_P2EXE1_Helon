package ita.P2EXE1;

import java.util.ArrayList;

public class HardCoreSailor extends Costumer{
	public ArrayList<Book> HardCoreSailorBooks = new ArrayList<Book>();
	
	// Sabe exatamente qual livro ele quer
	public void hardCoreSailorWantThisBook(Book book){
		HardCoreSailorBooks.add(book);
	}
}
