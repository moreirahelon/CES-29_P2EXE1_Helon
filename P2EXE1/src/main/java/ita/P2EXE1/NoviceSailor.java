package ita.P2EXE1;

import java.util.ArrayList;

public class NoviceSailor extends Costumer{
	private ArrayList<Book> NoviceSailorBooks = new ArrayList<Book>();
	
	// Sabe exatamente qual livro ele quer
		public void noviceSailorWantThisBook(Book book){
			NoviceSailorBooks.add(book);
		}
		
	// As vezes precisa de ajuda para saber o que quer
	// Consulta a lista de livros e depois pode ir na loja física para buscar
		public void noviceSailorWantListOfBooks(ArrayList<Book> books){
			NoviceSailorBooks.add(books.get(0)); // Esoclhe o primeiro livro, por exemplo
		}
}
