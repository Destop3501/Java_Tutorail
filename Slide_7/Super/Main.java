public class Main {
    public static void main(String[] args){
        B b = new B();
        b.show();
    }
}

class A{
    String color = "White";
}

class B extends A{
    String color = "Black";

    void show(){
        System.out.println(super.color);
        System.out.println(color);
    }
}
