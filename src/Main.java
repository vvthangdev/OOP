public class Main {
    public static void change(Student std){
        std = new Student("Hung", 1995);
    }

    public static void main(String[] args) {
        Student std = new Student("Nam", 1990);
        System.out.println(std.getYear());
        change(std);
        System.out.println(std.getYear());
    }
}
