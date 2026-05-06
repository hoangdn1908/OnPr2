package Library_Management;

public class Book extends LibraryItem<String>{
    private String author;
    private String isbn;

    public Book(String id, String title, String author, String isbn)
    {
        super(id, title);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String getInfo() {
        return "[Book] ID: " + getId() + "| Title: " + getTitle() + "| Author: "  + getAuthor() + "| ISBN: " + getIsbn();
    }
}
