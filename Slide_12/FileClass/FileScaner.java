
import java.io.*;
import java.util.Scanner;

public class FileScaner {

    public static void main(String[] args) throws IOException {

        try (PrintWriter pw = new PrintWriter("src/test.txt")) {
            pw.println("Hello");
            pw.println("World");
            pw.flush();
        }

        try (Scanner sc = new Scanner(new File("src/test.txt"))) {
            while (sc.hasNext()) {
                String s = sc.nextLine();
                System.out.println(s);
            }
            sc.close();
        }
    }
}
