
import java.io.*;

public class Printwriter {

    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("src/test.txt");

        pw.println("Moratuwa");
        pw.println("University");
        pw.println("Sliit");
        pw.flush();
        pw.close();

        FileReader fr = new FileReader("src/test.txt");
        BufferedReader bfr = new BufferedReader(fr);
        String s = bfr.readLine();
        while (s != null) {
            System.out.println(s);
            s = bfr.readLine();
        }
        bfr.close();
        fr.close();
    }
}
