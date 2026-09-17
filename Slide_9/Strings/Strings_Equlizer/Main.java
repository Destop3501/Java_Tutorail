
public class Main {

    public static void main(String[] args) {
        String a = "Ruwan";
        String b = "Ruwan";

        if (a == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String c = new String("Hasintha");
        String d = new String("Hasintha");

        if (c == d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (c.equals(d)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (a.equals(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
