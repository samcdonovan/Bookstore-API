package samcdonovan.java.model;

/**
 * Book class containing data about each book in the database
 */
public class Book {

    private int id;
    private String title;
    private String author;
    private String isbn;
    private float price;

    /**
     * Book class constructor; creates a new Book object with a title, author, ISBN and a price.
     *
     * @param title The title of the book
     * @param author The book's author
     * @param isbn The unique ISBN for the book
     * @param price The price of the book at the bookstore
     */
    public Book(String title, String author, String isbn, float price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    /* Getters and setters */
    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public float getPrice() {
        return this.price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
