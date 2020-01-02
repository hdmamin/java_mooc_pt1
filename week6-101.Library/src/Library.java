/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hmamin
 */
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    
    public Library() {
        this.books = new ArrayList<Book>();
    }
    
    public void addBook(Book book) {
        this.books.add(book);
    }
    
    public void printBooks() {
        for (Book book:this.books) {
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> matches = new ArrayList<Book>();
        for (Book book:this.books) {
            if (StringUtils.included(book.title(), title)) {
                matches.add(book);
            }
        }
        return matches;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> matches = new ArrayList<Book>();
        for (Book book:this.books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                matches.add(book);
            }
        }
        return matches;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> matches = new ArrayList<Book>();
        for (Book book:this.books) {
            if (book.year() == year) {
                matches.add(book);
            }
        }
        return matches;
    }
}
