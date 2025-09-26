package programs;

public class Book {
    // Instance variables
    String title;
    String author;
 
    // Constructor to initialize title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
 
    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
    class AssignmentDay3_4{
    // Main method to demonstrate object creation
    public static void main(String[] args) {
        // Creating multiple Book objects
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");
 
        // Displaying book details
        System.out.println("Book 1:");
        book1.displayInfo();
 
        System.out.println("\nBook 2:");
        book2.displayInfo();
 
        System.out.println("\nBook 3:");
        book3.displayInfo();
    }
}
 
