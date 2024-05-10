import java.io.FileInputStream;

public class ImproperExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("non_existent_file.txt");
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}

