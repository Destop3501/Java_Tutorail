
public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();

        System.out.println();
        Cat cat2 = new Cat("Black");

        System.out.println();
        Cat cat3 = new Cat(10, 20);
    }
}

class Felidea {

    Felidea() {
        System.out.print("Felidea Family");
    }

    Felidea(String color) {
        this();
        System.out.println(color);
    }
}

class Cat extends Felidea {

    Cat() {
        System.out.println("default");
    }

    Cat(String color) {
        super(" " + color);
    }

    Cat(double weight, double height) {
        System.out.println(" " + height + " and " + weight);
    }
}
