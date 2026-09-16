public class Calculater {
    int number1;
    int number2;

    public void Addition(){
        int sum = number1 + number2;
        System.out.printf("Sum is : %d%n", sum);
    }

    public void Subtraction(){
        int sub = number1 - number2;
        System.out.printf("sub is : %d%n", sub);
    }

    public void Multiplication(){
        int product = number1 * number2;
        System.out.printf("Product is : %d%n", product);
    }

    public void Divition(){
        double divide = number1 / number2;
        System.out.printf("Divition is : %f%n", divide);
    }

    public void Module(){
        int mod = number1 % number2;
        System.out.printf("Module is : %d%n", mod);
    }
}