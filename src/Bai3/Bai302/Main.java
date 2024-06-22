package Bai3.Bai302;

public class Main {
    public static void main(String[] args) {
        Vec v1 = new Vec(9,21,27);
        Vec v2 = new Vec(3,7,9);

        Vec sum = v1.Add(v2);
        System.out.println(("Cong hai vecto: " + sum));

        Vec sub = v1.Sub(v2);
        System.out.println("Tru hai vecto: " + sub);

        Vec dev = v1.Div(v2);
        System.out.println("Chia hai vecto:" + dev);

        Vec mul = v1.Mul(v2);
        System.out.println("Nhan hai vecto:" + mul);

        Double dotpro;
        dotpro = v1.dotProduct(v2);
        System.out.println("Nhan vo huong: "+ dotpro);
    }
}
