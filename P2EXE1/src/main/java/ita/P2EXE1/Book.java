package ita.P2EXE1;

public class Book {
    String bookTitle;
    String bookAuthor;
    double bookPrice;
    int bookRate = 0;

    public Book(String title, String author, double price) {
        if(title == null && author == null) {
            throw new IllegalArgumentException("Can't be null");
        }
        if(title.isEmpty() && author.isEmpty()) {
            throw new IllegalArgumentException("Can't be empty");
        }
        bookTitle = title;
        bookAuthor = author;
        bookPrice = price;
    }

    public String getTitle() {
        return bookTitle;
    }
    public String getAuthors( ) {
        return bookAuthor;
    }
    public double getPrice(){
    	return bookPrice;
    }

    public String toString( ) {
        return bookTitle + bookAuthor;
    }
    public int compareTo(Book other){
        return bookTitle.compareTo(other.bookTitle);
    }
    public boolean equals(Object o) {
         if(!(o instanceof Book)) {
             return false;
        }
         Book b = (Book) o;
         return b.bookTitle.equals(bookTitle)
                 && b.bookAuthor.equals(bookAuthor);
    }
}
