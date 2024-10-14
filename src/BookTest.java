public class BookTest {
    public static void main(String[] args) {

        Book[] books = new Book[6];
        books[0] = new Book(1, "hung", 1200, "Podcast chữa lành 1");
        books[1] = new Book(2, "hung", 950, "Podcast chữa lành 2");
        books[2] = new Book(3, "hung", 1500, "Podcast chữa lành 3");
        books[3] = new Book(4, "hung", 800, "Podcast chữa lành 4");
        books[4] = new Book(5, "hung", 1100, "Podcast chữa lành 5");
        books[5] = new Book(6, "hung", 2000, "Podcast chữa lành 6");

        // tính tổng
        double totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }

        System.out.println("Tổng giá của 6 cuốn sách: " + totalPrice);
        System.out.println("Những cuốn sách có giá > 1000:");
        for (Book book : books) {
            if (book.getPrice() > 1000) {
                System.out.println("Tên sách: " + book.getName() + ", Giá: " + book.getPrice() + ", Tác giả: " + book.getAuthor());
            }
        }
    }
}