public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.eat();

        Dog dog = new Dog();
        System.out.println(dog.weight);
        dog.eat();
        dog.barking();
    }
}
