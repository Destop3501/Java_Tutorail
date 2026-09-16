import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the First Value: ");
        double a = scan.nextDouble();

        System.out.print("Enter the Second Value: ");
        double b = scan.nextDouble();

        PythogoreanTherom pythogoren = new PythogoreanTherom();

        double hypotenuse = pythogoren.CalculateHypotenuse(a, b);

        System.out.printf("hypotenuse is %.2f%n", hypotenuse);

        scan.close();

    }
    
}
