public class DivisionByZeroExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println(divide(a, b));
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}

