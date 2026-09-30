import java.util.*;
class Book
{
    private int bookId;
    private String title;
    private String author;
    private double price;

    static int count = 0;

    Book(int bookId, String title, String author, double price)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;

        count++;
    }

    void display()
    {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------------");
    }

    boolean search(int bookId)
    {
        return this.bookId == bookId;
    }

    boolean search(String title)
    {
        return this.title.equalsIgnoreCase(title);
    }

    Book costlier(Book b)
    {
        if(this.price > b.price)
            return this;
        else
            return b;
    }
}

public class Booktest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book(101, "Java", "James Gosling", 500);
        Book b2 = new Book(102, "Python", "Guido van Rossum", 600);
        Book b3 = new Book(103, "C++", "Bjarne Stroustrup", 450);

        System.out.println("===== BOOK DETAILS =====");

        b1.display();
        b2.display();
        b3.display();

        System.out.println("===== SEARCH BY BOOK ID =====");

        int id = 102;

        if(b1.search(id))
            System.out.println("Book found: Java");
        else if(b2.search(id))
            System.out.println("Book found: Python");
        else if(b3.search(id))
            System.out.println("Book found: C++");
        else
            System.out.println("Book not found");

        System.out.println("\n===== SEARCH BY TITLE =====");

        String title = "C++";

        if(b1.search(title))
            System.out.println("Book found: Java");
        else if(b2.search(title))
            System.out.println("Book found: Python");
        else if(b3.search(title))
            System.out.println("Book found: C++");
        else
            System.out.println("Book not found");

        System.out.println("\n===== COSTLIER BOOK =====");

        Book expensive = b1.costlier(b2);

        System.out.println("Costlier book:");
        expensive.display();

        System.out.println("Total number of books created: " + Book.count);

        sc.close();
    }
}