public class Book {
    // Attributes
    private String bookId;
    private String title;
    private String author;
    private int quantity; // Number of copies available

    // Constructor
    public Book(String bookId, String title, String author, int quantity) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.quantity = quantity; // Set the initial quantity
    }

    // Getters and Setters
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Check availability
    public boolean isAvailable() {
        return quantity > 0;
    }

    // Update quantity when borrowed
    public void borrow() {
        if (quantity > 0) {
            quantity--;
        } else {
            System.out.println("No copies available for the book: " + title);
        }
    }

    // Update quantity when returned
    public void returnBook() {
        quantity++;
    }

    // Override toString for book details
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available Copies: " + quantity;
    }
}
