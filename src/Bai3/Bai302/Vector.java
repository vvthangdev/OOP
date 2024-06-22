package Bai3.Bai302;

public class Vector {
    // Các thành phần của vector
    private double x;
    private double y;
    private double z;

    // Constructor để khởi tạo vector với các giá trị x, y, z
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Phương thức cộng vector
    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    // Phương thức trừ vector
    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    // Phương thức nhân vector với một hằng số
    public Vector multiply(double scalar) {
        return new Vector(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    // Phương thức nhân vô hướng hai vector
    public double dotProduct(Vector other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    // Phương thức hiển thị vector dưới dạng chuỗi
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    // Phương thức chính để kiểm tra các phương thức của lớp Vector
    public static void main(String[] args) {
        // Tạo hai vector ví dụ
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);

        // Cộng vector
        Vector sum = v1.add(v2);
        System.out.println("Cộng vector: " + sum);

        // Trừ vector
        Vector diff = v1.subtract(v2);
        System.out.println("Trừ vector: " + diff);

        // Nhân vector với hằng số
        double scalar = 2.0;
        Vector scaled = v1.multiply(scalar);
        System.out.println("Nhân vector với hằng số: " + scaled);

        // Nhân vô hướng hai vector
        double dotProduct = v1.dotProduct(v2);
        System.out.println("Nhân vô hướng hai vector: " + dotProduct);
    }
}
