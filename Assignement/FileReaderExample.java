package Assignement;
import java.io.FileReader;
import java.io.IOException;
 
public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("AssignmentOutput.txt");
            int ch;
            System.out.println("Reading file content:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch); // convert int to char
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 