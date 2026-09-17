
import java.io.FileNotFoundException;

public class ExceptionDemo {

    // 1. Throwing an Unchecked Exception (RuntimeException)
    public static void checkAge(int age) {
        if (age < 18) {
            // Explicitly creating and throwing an exception object
            throw new IllegalArgumentException("Access denied: Age must be 18 or older.");
        }
        System.out.println("Access granted!");
    }

    // 2. Throwing a Checked Exception (requires 'throws' in the signature)
    public static void openFile(String fileName) throws FileNotFoundException {
        if (!fileName.equals("config.txt")) {
            // Explicitly throwing a checked exception
            throw new FileNotFoundException("The file '" + fileName + "' does not exist.");
        }
        System.out.println("File opened successfully!");
    }

    public static void main(String[] args) {
        // Handling the Unchecked Exception
        try {
            checkAge(15); // Triggers the 'throw' statement inside checkAge
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("---");

        // Handling the Checked Exception
        try {
            openFile("missing_file.txt"); // Triggers the 'throw' statement inside openFile
        } catch (FileNotFoundException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
