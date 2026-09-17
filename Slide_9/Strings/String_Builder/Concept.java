
public class Concept {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        System.out.println(sb1.charAt(2));
        sb1.setCharAt(2, 'B');
        System.out.println(sb1);
        System.out.println(sb1.reverse());
        System.out.println(sb1.insert(1, "xyz"));
        System.out.println(sb1.deleteCharAt(1));
        System.out.println(sb1.delete(1, 3));
        System.out.println(sb1.append("Python"));
        sb1.setLength(6);
        System.out.println(sb1);
        String c = sb1.substring(1);
        System.out.println(c);
        System.out.println(sb1.substring(1));
        System.out.println(sb1.substring(2, 4));

        StringBuilder a = new StringBuilder("Hello");
        System.out.println(a.append(", World").reverse().replace(1, 2, "Earth"));
    }
}
