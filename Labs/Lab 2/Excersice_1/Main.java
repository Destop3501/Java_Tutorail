
public class Main {

    public static void main(String[] args) {
        double farenheit = 212;
        double celsius = 98.5;

        CelsiuseCoverter celsiusconverter = new CelsiuseCoverter();
        celsiusconverter.converter(farenheit);

        FarenheitCoverter farenheitcoverter = new FarenheitCoverter();
        farenheitcoverter.converter(celsius);

    }
}
