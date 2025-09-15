package Task5;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Книгу \"" + title + "\" видано.");
        } else {
            System.out.println("Книга \"" + title + "\" вже зайнята.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Книгу \"" + title + "\" повернули.");
        } else {
            System.out.println("Книга \"" + title + "\" вже доступна.");
        }
    }
}

