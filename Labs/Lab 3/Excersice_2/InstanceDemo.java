
public class InstanceDemo {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.breed = "Neapolitan Mastiff";
        dog1.size = "Large";
        dog1.age = 5;
        dog1.color = "Black";

        Dog dog2 = new Dog();
        dog2.breed = "Maltese";
        dog2.size = "Small";
        dog2.age = 2;
        dog2.color = "White";

        Dog dog3 = new Dog();
        dog3.breed = "Chow Chow";
        dog3.size = "Medium";
        dog3.age = 3;
        dog3.color = "Brown";

        dog1.displayInfo();
        dog2.displayInfo();
        dog3.displayInfo();

        Dog.Vertebtate = "Mammals";

        dog1.displayInfo();
        dog2.displayInfo();
        dog3.displayInfo();

    }
}
