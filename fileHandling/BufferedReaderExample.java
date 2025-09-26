package fileHandling;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class BufferedReaderExample {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("ExampleOutput.txt"));
			String line;
			System.out.println("Reading file using BufferedReader");
			while((line = br.readLine())!= null) {
				System.out.println(line);
			}
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		
		}
		}
 
}
 
 