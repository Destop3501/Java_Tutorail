
import java.io.*;
import java.util.Scanner;

public class FileScaner {

    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("src/test.txt");
        pw.println("Hello");
        pw.println("World");
        pw.flush();
        pw.close();

        File f = new File("src/test.txt");
        Scanner sc = new Scanner(f);

        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(s);
        }
        sc.close();
    }
}
