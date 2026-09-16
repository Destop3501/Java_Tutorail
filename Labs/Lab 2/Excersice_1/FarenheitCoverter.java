public class FarenheitCoverter{
    public void converter(double celsius){
        System.out.printf("celsius value is: %.2f%n", celsius);
        double farenheit = (9 * celsius / 5) + 32;
        System.out.printf("farenheit value is: %.2f%n", farenheit);
    }
}