public class Fan {
    // Các hằng số cho tốc độ quạt
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Các thuộc tính của quạt
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Phương thức khởi tạo không tham số
    public Fan() {
        this.speed = SLOW; // Tốc độ mặc định
        this.on = false;   // Quạt tắt mặc định
        this.radius = 5;   // Bán kính mặc định
        this.color = "blue"; // Màu mặc định
    }

    // Getter và setter cho các thuộc tính
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString để hiển thị thông tin quạt
    @Override
    public String toString() {
        if (on) {
            return "Fan is on: speed = " + speed + ", color = " + color + ", radius = " + radius;
        } else {
            return "Fan is off: color = " + color + ", radius = " + radius;
        }
    }
}


//public class Main {
//    public static void main(String[] args) {
//        // Tạo đối tượng Fan 1
//        Fan fan1 = new Fan();
//        fan1.setSpeed(Fan.FAST); // Gán tốc độ lớn nhất
//        fan1.setRadius(10);       // Gán bán kính
//        fan1.setColor("yellow");  // Gán màu
//        fan1.setOn(true);         // Quạt ở trạng thái bật
//
//        // Tạo đối tượng Fan 2
//        Fan fan2 = new Fan();
//        fan2.setSpeed(Fan.MEDIUM); // Gán tốc độ trung bình
//        fan2.setRadius(5);          // Gán bán kính
//        fan2.setColor("blue");      // Gán màu
//        fan2.setOn(false);          // Quạt ở trạng thái tắt
//
//        // Hiển thị thông tin của các đối tượng Fan
//        System.out.println(fan1.toString());
//        System.out.println(fan2.toString());
//    }
//}
