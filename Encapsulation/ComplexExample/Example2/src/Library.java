import java.util.ArrayList;
import java.util.List;

public class Library {

    public class Book {
        private String title; // Encapsulated attribute
        private String author; // Encapsulated attribute
        private boolean available; // Encapsulated attribute

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.available = true; // By default, books are available when added to the library
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public boolean isAvailable() {
            return available;
        }

        public void borrow() {
            if (available) {
                available = false;
                System.out.println("You've borrowed: " + title);
            } else {
                System.out.println("Sorry, this book is already borrowed.");
            }
        }

        public void returnBook() {
            if (!available) {
                available = true;
                System.out.println("You've returned: " + title);
            } else {
                System.out.println("This book is already available in the library.");
            }
        }

        @Override
        public String toString() {
            return "Book Title: " + title + ", Author: " + author + ", Available: " + available;
        }
    }

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Added book to the library: " + title);
    }

    public void listBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("To Kill a Mockingbird", "Harper Lee");
        library.addBook("1984", "George Orwell");

        library.listBooks();

        library.books.get(0).borrow();
        library.books.get(1).borrow();
        library.books.get(0).returnBook();

        library.listBooks();
    }
}
