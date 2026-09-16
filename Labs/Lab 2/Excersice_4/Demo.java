
public class Demo {

    public static void main(String[] args) {
        Triangle traingle = new Triangle();
        traingle.height = 0.4;
        traingle.base = 0.3;

        traingle.FindArea();

        double hypotenuse = traingle.FindHypotenuse();

        System.out.printf("Hypotenuse is: %.2f%n", hypotenuse);

        traingle.FindPerimeter();
    }
}
