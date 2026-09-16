import java.util.Scanner;

public class Triangle {
    double a, b, c;

    public boolean triangleChecker(){
        if (a + b > c && b + c > a && c + a > b){
            return true;
        }
        return false;
    }

    public void getPerimeter(){
        System.out.printf("Perimeter is : %.2f%n", (a + b + c));
    }

    public static void main(String[] args){
        Triangle t = new Triangle();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter side A: ");
        t.a = scan.nextDouble();

        System.out.print("Enter side B: ");
        t.b = scan.nextDouble();

        System.out.print("Enter side C: ");
        t.c = scan.nextDouble();

        if (t.triangleChecker()){
            t.getPerimeter();       
        }
    }
}
