public class Main {
    public static void main(String[] args) {

        // 3 cuốn ProgrammingBook
        ProgrammingBook pBook1 = new ProgrammingBook(101, "Author 1", 1200, "Java 1", "Java", "ab");
        ProgrammingBook pBook2 = new ProgrammingBook(102, "Author 2", 800, "Java 2", "Java", "ab");
        ProgrammingBook pBook3 = new ProgrammingBook(103, "Author 3", 1600, "Java 3", "Java", "ab");


        // 3 cuốn FictionBook
        FictionBook fBook1 = new FictionBook(104, "Author 3", 2000, "Doraemon", "Hoạt Hình");
        FictionBook fBook2 = new FictionBook(105, "Author4", 600, "Viễn Tưởng 1", "Viễn tưởng");
        FictionBook fBook3 = new FictionBook(106, "Author 5", 700, "Cabybara", "Hoạt Hình");

        // tính tổng 6 cuốn sách
        double totalAmount = fBook1.getAmount() + fBook2.getAmount() + fBook3.getAmount() + pBook1.getAmount() + pBook2.getAmount() + pBook3.getAmount();
        System.out.println("The total of 6 books is : " + totalAmount);



    }
}