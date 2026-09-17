
import java.io.*;

public class Error {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader("c:\\myfile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.read());
        bufferedReader.close();
    }
}
