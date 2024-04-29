import java.util.ArrayList;

public class Library {
    private ArrayList<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Function to add a book to the library
    public void addBook(String bookTitle) {
        books.add(bookTitle);
        System.out.println(bookTitle + " has been added to the library.");
    }

    // Function to remove a book from the library
    public void removeBook(String bookTitle) {
        if (books.contains(bookTitle)) {
            books.remove(bookTitle);
            System.out.println(bookTitle + " has been removed from the library.");
        } else {
            System.out.println("The book " + bookTitle + " is not in the library.");
        }
    }

    // Function to display all books in the library
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Java Programming");
        library.addBook("Data Structures and Algorithms");
        library.addBook("Introduction to Algorithms");
        library.displayBooks();
        library.removeBook("Java Programming");
        library.displayBooks();
    }
}

