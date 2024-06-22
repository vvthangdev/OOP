public class OddChecker {
    // Phương thức kiểm tra số lẻ
    public boolean checkOdd(int i) {
        return (i % 2 != 0);
    }

    // Phương thức chính để kiểm tra
    public static void main(String[] args) {
        OddChecker checker = new OddChecker();

        // Kiểm tra các trường hợp khác nhau
        System.out.println("Testing checkOdd method:");

        int testNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int num : testNumbers) {
            boolean result = checker.checkOdd(num);
            System.out.println("checkOdd(" + num + ") = " + result);
        }
    }
}
