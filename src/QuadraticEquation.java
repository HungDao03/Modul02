import java.util.Scanner;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Phương thức tính delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }
}

//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter value a (should not be 0):");
//        int a = sc.nextInt();
//        if (a == 0) {
//            System.out.println("Value of a must not be 0.");
//            return; // Kết thúc chương trình nếu a = 0
//        }
//
//        System.out.println("Enter value b:");
//        int b = sc.nextInt();
//
//        System.out.println("Enter value c:");
//        int c = sc.nextInt();
//
//        QuadraticEquation user = new QuadraticEquation(a, b, c);
//
//        double delta = user.getDiscriminant();
//
//        if (delta > 0) {
//            System.out.println("The equation has two roots: " + user.getRoot1() + " and " + user.getRoot2());
//        } else if (delta == 0) {
//            System.out.println("The equation has one root: " + user.getRoot1());
//        } else {
//            System.out.println("The equation has no roots");
//        }
//    }
//}