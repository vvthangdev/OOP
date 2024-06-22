package Bai3.Bai301;

public class Circle {
    private double radius;
    //constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //Getter
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double calArea(){
        return Math.PI * radius * radius;
    }
    public double calCircum(){
        return Math.PI * 2 * radius;
    }
}
