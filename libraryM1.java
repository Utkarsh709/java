public class libraryM1 {
    private int bookId;
    private String title;
    private String author;
    private boolean available;

    // Constructor
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true; // By default, book is available when added to the library
    }

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}


/*

    Variables:
        bookId (int): Unique identifier for each book.
        title (String): Title of the book.
        author (String): Author of the book.
        available (boolean): Indicates whether the book is available for borrowing or not.

    Modifiers:
        private: Encapsulation is maintained by making variables private. They can only be accessed through getter and setter methods.

    Methods:
        Constructor: Initializes the book with the provided book ID, title, and author.
        Getters and Setters: Allow access and modification of private variables.
        
        
  */      
