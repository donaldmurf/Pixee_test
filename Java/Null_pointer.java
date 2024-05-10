public class Null_pointer {
    public static void main(String[] args) {
        String text = null;
        printLength(text);
    }

    private static void printLength(String text) {
        System.out.println(text.length());
    }
}

