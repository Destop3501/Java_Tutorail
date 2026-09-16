
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog Eat");
    }

    @Override
    public void run() {
        System.out.println("Dog Run");
    }

    public void bark() {
        System.err.println("Bark");
    }
}
