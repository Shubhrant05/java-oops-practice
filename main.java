public class main {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("B1", "Java Basics", "Author A", 2);
        Book book2 = new Book("B2", "OOP Concepts", "Author B", 1);

        // Create a user
        User user = new User("U1", "Shubhrant");

        // Borrow and return books
        user.borrowBook(book1); // Borrowing Successful
        user.borrowBook(book1); // Borrowing Successful
        user.borrowBook(book1); // No copies available
        user.borrowBook(book2); // Borrowing Successful
        user.borrowBook(book2); // No copies available

        // Displaying borrowed books
        user.displayBorrowedBooks();

        // Returning books
        user.returnBook(book1);
        user.displayBorrowedBooks();
    }
}
