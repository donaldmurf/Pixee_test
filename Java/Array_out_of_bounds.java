public class Array_out_of_bounds {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        printElement(numbers, 5);
    }

    private static void printElement(int[] array, int index) {
        System.out.println(array[index]);
    }
}

