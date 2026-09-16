
public class Cast {

    public static void main(String[] args) {
        int X = 5;
        double Y = 10.5;

        double xdouble = X;
        System.out.printf("Double: %.2f%n ", xdouble);

        long xlong = X;
        System.out.printf("long: %d%n ", xlong);

        float xfloat = X;
        System.out.printf("float: %.2f%n ", xfloat);

        int yint = (int) Y;
        System.out.printf("int: %d%n ", yint);

        long ylong = (long) Y;
        System.out.printf("long: %d%n ", ylong);
    }
}
