import java.util.Scanner;

public class GradeGenerater {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Marks : ");
        double marks = scan.nextDouble();

        if (marks>=100 && marks<=0){
            System.out.println("marks should be in range 0-100");
        }
        else{
            if (marks>=75){
                System.out.println("Grade is : A");
            }
            else if (marks>=65){
                System.out.println("Grade is : B");
            }
            else if (marks>=55){
                System.out.println("Grade is : C");
            }
            else {
                System.out.println("Subject Fail");
            }
        }

        int X = 55;
        int Y = 15;

        if (X>0 && Y>0){
            System.out.println("X and Y are Positive");
        }
        if (X - Y > 0){
            System.out.println("Diferent between X and Y are Positive");
        }
        int count = 0;
        while (count != 3){
            if (Y % 10 == 0){
                break;
            }
            Y = (Y / 10);
            if (count == 2){
                System.out.println("Y having a 3 digit");
                break;
            }
            count++;
        }
        
    }
}
