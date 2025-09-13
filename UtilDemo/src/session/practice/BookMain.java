package session.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class BookMain {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        Book storyBook = new Book("Moral story", "notMe", 199.0);
        Book historybook = new Book("History", "Bose", 299.0);
        Book geographybook = new Book("Geography", "Gallileo", 499.0);
        Book physics = new Book("Theory of Relativity", "Einsten", 999.0);

        bookList.add(storyBook);
        bookList.add(historybook);
        bookList.add(geographybook);
        bookList.add(physics);

        System.out.println("Using iterator");
        Iterator<Book> i = bookList.iterator();
        while (i.hasNext()) {
            Book book =  i.next();
            System.out.println(book.toString());
        }

        System.out.println("Using list iterator");
        ListIterator<Book> li = bookList.listIterator(bookList.size());
        while (li.hasPrevious()) {
            Book book = li.previous();
            System.out.println(book.toString());
        }

    }
}
