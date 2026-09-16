
import java.util.Scanner;

public class Student {

    public static String getFullName(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }

    public static double getBMI(Double weight, Double height) {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        String firstName;
        String lastName;
        double Height;
        double Weight;
        double BMI;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        firstName = scanner.next();

        System.out.print("Enter Last Name: ");
        lastName = scanner.next();

        System.out.print("Enter Weight (kg): ");
        Weight = scanner.nextDouble();

        System.out.print("Enter Height (m): ");
        Height = scanner.nextDouble();

        String fullName = getFullName(firstName, lastName);
        BMI = getBMI(Weight, Height);

        System.out.println("Full Name: " + fullName);
        System.out.println("BMI: " + BMI);
    }
}
