
import java.io.*;

public class ErrorHandle {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("c:\\myfile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.read());
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
