
public class Unchecked {

    public static void main(String[] args) {
        Dog a = new GermanShepard();
        a.show();
    }
}

class Dog {

    public void show() {
        System.out.println("Dog Class");
    }
}

class GermanShepard extends Dog {

    public void show() throws ArithmeticException {
        System.out.println("GermanShepard Class");
    }
}
