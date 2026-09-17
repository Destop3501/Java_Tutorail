
import java.io.*;

public class ThrowsException {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileReader fileReader = new FileReader("c:\\myfile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.read());
        bufferedReader.close();
    }
}
