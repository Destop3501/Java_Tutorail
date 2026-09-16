
public class StaticDemo {

    int num1;
    static int num2;

    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();

        s1.num1 = 15;
        s1.num2 = 17;

        System.out.println("s1.num1: " + s1.num1);
        System.out.println("s1.num2: " + s1.num2);

        s2.num1 = 22;
        s2.num2 = 28;

        System.out.println("s1.num1: " + s1.num1);
        System.out.println("s1.num2: " + s1.num2);

        System.out.println("s2.num1: " + s2.num1);
        System.out.println("s2.num2: " + s2.num2);

        StaticDemo.num2 = 15;

        System.out.println("s1.num2: " + s1.num2);
        System.out.println("s2.num2: " + s2.num2);
    }
}
