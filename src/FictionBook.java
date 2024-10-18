public class FictionBook extends Book {
    private String category;

    public FictionBook() {
        super();
    }

    public FictionBook(int bookCode, String author, double price, String name, String category) {
        super(bookCode, author, price, name);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount(){
        return getPrice() * 0.93;
    }
}
