package Bai3.Bai301;

public class Square {
    private double side;

    public Square(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calArea(){
        return side * side;
    }

    public double calPer(){
        return 4 * side;
    }

}
