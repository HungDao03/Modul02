import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value a (should not be 0):");
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("Value of a must not be 0.");
            return; // Kết thúc chương trình nếu a = 0
        }

        System.out.println("Enter value b:");
        int b = sc.nextInt();

        System.out.println("Enter value c:");
        int c = sc.nextInt();

        QuadraticEquation user = new QuadraticEquation(a, b, c);

        double delta = user.getDiscriminant();

        if (delta > 0) {
            System.out.println("The equation has two roots: " + user.getRoot1() + " and " + user.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root: " + user.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}