import java.util.ArrayList;
import java.util.List;

public class libraryM2 {
    private List<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Remove a book from the library
    public void removeBook(int bookId) {
        books.removeIf(book -> book.getBookId() == bookId);
    }

    // Find a book by ID
    public Book findBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    // Get a list of available books
    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    // Get a list of all books
    public List<Book> getAllBooks() {
        return books;
    }
}


/*
    Variables:
        books (List<Book>): Maintains a list of books in the library.

    Modifiers:
        private: Encapsulation is maintained by making the list of books private. It can only be accessed through methods provided by the class.

    Methods:
        Constructor: Initializes an empty list of books when a new library object is created.
        addBook(Book book): Adds a book to the library.
        removeBook(int bookId): Removes a book from the library based on its ID.
        findBookById(int bookId): Searches for a book in the library by its ID.
        getAvailableBooks(): Retrieves a list of all available books in the library.
        getAllBooks(): Retrieves a list of all books in the library.

Rationale:

    Encapsulation: Encapsulation is achieved by making the variables private and providing getter and setter methods to access and modify them. This protects the internal state of the objects and ensures data integrity.
    Data Types:
        int for bookId to represent unique identifiers.
        String for title and author to store textual data.
        boolean for available to represent the availability status of the book.
        List<Book> for books in the Library class to store multiple book objects.
    Modifiers:
        private is used to restrict direct access to variables and limit modification to controlled methods, enhancing encapsulation.
    Methods:
        Methods like addBook, removeBook, findBookById, getAvailableBooks, and getAllBooks provide essential functionalities for managing the library's books and their records.
        
        */
