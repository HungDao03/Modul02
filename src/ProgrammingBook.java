public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook() {
        super();
    }

    public ProgrammingBook(int bookCode, String author, double price, String name, String language, String framework) {
        super(bookCode, author, price, name); // Gọi constructor của lớp cha (Book)
        this.language = language;
        this.framework = framework;
    }

    // Getter và Setter cho thuộc tính language
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    // Getter và Setter cho thuộc tính framework
    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public double getAmount(){
        return getPrice() * 0.95;
    }
}
