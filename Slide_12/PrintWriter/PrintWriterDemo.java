
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

    public static void main(String[] args) throws IOException {
        try (PrintWriter pw = new PrintWriter("src/test.txt")) {
            pw.println("Moratuwa");
            pw.println("University");
            pw.println("Sliit");
            pw.flush();
            pw.close();
        }

        try (BufferedReader bfr = new BufferedReader(new FileReader("src/test.txt"))) {
            String s = bfr.readLine();
            while (s != null) {
                System.out.println(s);
                s = bfr.readLine();
            }
            bfr.close();
        }
    }
}
