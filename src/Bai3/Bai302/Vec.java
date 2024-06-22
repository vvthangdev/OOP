package Bai3.Bai302;

public class Vec {

    private double x;
    private double y;
    private double z;

    //constructor:
    public Vec(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec Add(Vec other){
        return new Vec(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vec Sub(Vec other){
        return new Vec(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public Vec Div(Vec other) {
        return new Vec(this.x / other.x, this.y / other.y, this.z / other.z);
    }

    public Vec Mul(Vec other){
        return new Vec(this.x * other.x, this.y * other.y, this.z * other.z);
    }

    //Nhan vo huong
    public double dotProduct(Vec other){
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    @Override
    public  String toString(){
        return( "(" + x + "," + y + "," + z + ")");
    }
}
