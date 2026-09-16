public class CelsiuseCoverter {
    public void converter(double farenheit){
        System.out.printf("farenheit value is: %.2f%n", farenheit);
        double celsius = 5 * (farenheit - 32) / 9;
        System.out.printf("celsius value is: %.2f%n", celsius);
    }
}
