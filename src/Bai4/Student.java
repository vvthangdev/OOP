package Bai4;

public class Student {
    private String name;
    private int year;
    public Student(String name, int year){
        this.name = name;
        this.year = year;
    }

    //Getter and setter:

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
