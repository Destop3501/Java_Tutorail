
public class Triangle {

    double height;
    double base;
    double hypotenuse;

    public void FindArea() {
        double area = 0.5 * height * base;
        System.out.printf("Area is: %.2f%n", area);
    }

    public double FindHypotenuse() {
        double Hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return Hypotenuse;
    }

    public void FindPerimeter() {
        double perimeter = height + base + FindHypotenuse();
        System.out.printf("Perimeter is: %.2f%n", perimeter);
    }
}
