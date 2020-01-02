import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // test your program here
        Library library = new Library();
        Book hp = new Book("Harry Potter", "Bloomberg", 2005);
        Book lotr = new Book("The Fellowship of the Ring", "Puffin", 1960);
        Book lotr2 = new Book("The Two Towers", "Puffin", 1965);
        Book lotr3 = new Book("The Return of the King", "Puffin", 2005);
        library.addBook(hp);
        library.addBook(lotr);
        library.addBook(lotr2);
        library.addBook(lotr3);
        library.printBooks();
        
        // Test search functionality.
        ArrayList<Book> hpBooks = library.searchByTitle("Harry Potter");
        ArrayList<Book> puffinBooks = library.searchByPublisher("Puffin");
        ArrayList<Book> year05Books = library.searchByYear(2005);
        
        System.out.println(hpBooks + "\n");
        System.out.println(puffinBooks + "\n");
        System.out.println(year05Books + "\n");
        
        System.out.println(StringUtils.included("pianoman", "pianoM"));
        System.out.println(StringUtils.included("pianoman", ""));
    }
}
