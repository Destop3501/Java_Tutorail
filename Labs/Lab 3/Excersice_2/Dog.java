
public class Dog {

    String breed;
    String size;
    int age;
    String color;

    static String Vertebtate;

    public void Bark() {
        System.out.println("Barking");
    }

    public void Eat() {
        System.out.println("Eating");
    }

    public void displayInfo() {
        System.out.println("Breed: " + breed);
        System.out.println("Size: " + size);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
        if (Vertebtate != null) {
            System.out.println("Vertebtate: " + Vertebtate);
        }
    }
}
