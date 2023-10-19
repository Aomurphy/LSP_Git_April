package org.howard.edu.lsp.midterm.problem1;

public class Book {

	    private String title;
	    private String author;
	    private int year;

	    public Book(String title, String author, int year) {
	        this.title = title;
	        this.author = author;
	        this.year = year;
	    }

	    @Override
	    public String toString() {
	        return "Book Title: " + title + "\nAuthor: " + author + "\nYear: " + year;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Book otherBook = (Book) obj;
	        return title.equals(otherBook.title) && author.equals(otherBook.author);
	    }

	    public static void main(String[] args) {
	        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
	        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
	        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

	        System.out.println("Book 1:\n" + book1);
	        System.out.println("Book 2:\n" + book2);
	        System.out.println("Book 3:\n" + book3);

	        System.out.println("book1 equals book2: " + book1.equals(book2));
	        System.out.println("book1 equals book3: " + book1.equals(book3));
	    }

	}


