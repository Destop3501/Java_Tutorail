
public class Main {

    public static void main(String[] args) {
        String a = new String("Batch 24 IT at");

        System.out.println(a.substring(2));
        System.out.println(a.substring(1, 4));
        System.out.println(a.replace("a", "B"));
        System.out.println(a.replaceFirst("a", "B"));
        System.out.println(a.replace("at", "B"));
        System.out.println(a.replaceFirst("at", "B"));
    }
}
