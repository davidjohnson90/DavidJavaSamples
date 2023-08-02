/**
 * This is the main class that demonstrates aggregation between the Book and Author classes.
 */
package com.david.java.aggregation;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The AggregationDemo class contains the main method to demonstrate aggregation.
 * It creates an instance of the Author class and an instance of the Book class,
 * passing the Author instance as an argument to the Book constructor.
 * Then, it calls the showDetails() method of the Book class to display book details along with the author's information.
 *
 * @author David
 */
public class AggregationDemo {
    public static void main(String[] args) {
        Author author = new Author("David", 26, "Bangalore");
        Book book = new Book("Perfect Life with God", 500, author);
        book.showDetails();
    }
}

/**
 * The Author class represents an author with properties such as authorName, age, and place.
 */
class Author {
    String authorName;
    int age;
    String place;

    /**
     * Constructor to create an Author object with the specified authorName, age, and place.
     *
     * @param authorName The name of the author.
     * @param age        The age of the author.
     * @param place      The place where the author resides.
     */
    public Author(String authorName, int age, String place) {
        this.authorName = authorName;
        this.age = age;
        this.place = place;
    }

    /**
     * @return the authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

}

/**
 * The Book class represents a book with properties such as bookName, price, and an Author object.
 */
class Book {
    private static final Logger logger = Logger.getLogger(Book.class.getName());
    String bookName;
    int price;
    Author author;

    /**
     * Constructor to create a Book object with the specified bookName, price, and author.
     *
     * @param bookName The name of the book.
     * @param price    The price of the book.
     * @param author   The author of the book (an instance of the Author class).
     */
    public Book(String bookName, int price, Author author) {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }

    /**
     * This method displays the details of the book, including the bookName, price, authorName, and place.
     */
    public void showDetails() {
        logger.log(Level.INFO, "The details of the book are:\n" + " BookName: " + bookName + ",\n" + " Price: " + price + ",\n" + " Author: " + author.getAuthorName() + ",\n" + " Place: " + author.getPlace());
    }
}
