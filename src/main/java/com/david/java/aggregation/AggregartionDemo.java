/**
 * 
 */
package com.david.java.aggregation;

/**
 * @author David
 *
 */
public class AggregartionDemo {
	public static void main(String[] args) {
		Author author = new Author("David", 26, "Bangalore");
		Book book = new Book("Perfect Life with God", 500, author);
		book.showDetails();
	}
}

class Author {
	String authorName;
	int age;
	String place;

	/**
	 * 
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

class Book {
	String bookName;
	int price;
	Author author;

	/**
	 * 
	 */
	public Book(String bookName, int price, Author author) {
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}

	/**
	 * 
	 */
	public void showDetails() {
		System.out
				.println("The details of the book is: \n" + " BookName:= "
						+ bookName + ",\n Price:= " + price + ",\n Author:= "
						+ author.getAuthorName() + ",\n Place:= "
						+ author.getPlace());
	}
}