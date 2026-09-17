import java.io.*;

public class Starter{
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter =  new FileWriter("src/test.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println("Hello World");
        printWriter.close();
        fileWriter.close();
    }
}