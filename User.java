import java.util.ArrayList;
import java.util.List;

public class User{
    // Attributes
    private String userId;
    private String name;
    private List<Book> borrowedBooks;

    // Constructor
    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Borrow a book
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.borrow(); // Decrease quantity
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, no copies of \"" + book.getTitle() + "\" are available.");
        }
    }

    // Return a book
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook(); // Increase quantity
            System.out.println(name + " returned the book: " + book.getTitle());
        } else {
            System.out.println("The book \"" + book.getTitle() + "\" is not in your borrowed list.");
        }
    }

    // Display borrowed books
    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has not borrowed any books.");
        } else {
            System.out.println(name + " has borrowed the following books:");
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}

   
