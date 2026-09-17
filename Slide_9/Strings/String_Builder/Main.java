
public class Main {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println("Capacity: " + sb1.capacity());
        System.out.println("Length: " + sb1.length());

        StringBuilder sb2 = new StringBuilder(20);
        System.out.println("Capacity: " + sb2.capacity());
        System.out.println("Length: " + sb2.length());

        StringBuilder sb3 = new StringBuilder("Hello");
        System.out.println("Capacity: " + sb3.capacity());
        System.out.println("Length: " + sb3.length());

        String s = "Java";
        s.concat(" Python");
        System.out.println(s);

        sb3.append(", World");
        System.out.println(sb3);
    }
}
