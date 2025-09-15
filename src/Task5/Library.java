package Task5;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Додано книгу: " + book.getTitle());
    }

    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.checkOut();
                return;
            }
        }
        System.out.println("Книгу \"" + title + "\" не знайдено.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Книгу \"" + title + "\" не знайдено.");
    }

    public void showBooks() {
        System.out.println("Книги у бібліотеці:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " — " + book.getAuthor() +
                    (book.isAvailable() ? " (доступна)" : " (зайнята)"));
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("Пригоди Шерлока Холмса", "Артур Конан Дойл");
        Book b2 = new Book("Майстер і Маргарита", "Михайло Булгаков");

        library.addBook(b1);
        library.addBook(b2);

        library.showBooks();

        library.checkOutBook("Пригоди Шерлока Холмса");
        library.showBooks();

        library.returnBook("Пригоди Шерлока Холмса");
        library.showBooks();
    }
}

