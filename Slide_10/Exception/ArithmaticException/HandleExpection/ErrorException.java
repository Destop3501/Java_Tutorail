
public class ErrorException {

    public static void main(String[] args) {
        int n1 = 35;
        int n2 = 0;

        try {
            divider(n1, n2);
        } catch (ArithmeticException e) {
            System.out.println("Invalid denominator... try again.");
        }
    }

    public static void divider(int n1, int n2) {
        System.out.println(n1 / n2);
    }
}
