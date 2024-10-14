public class Book {
    private int bookCode;  // id
    private String author; // tác giả
    private double price; // giá tiền
    private String name;

    public Book() {
    }

    public Book(int bookCode, String author, double price, String name) {
        this.bookCode = bookCode;
        this.author = author;
        this.price = price;
        this.name = name;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
