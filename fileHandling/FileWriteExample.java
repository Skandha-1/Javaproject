package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) {
		try {
			FileWriter writer=new FileWriter("ExampleOutput.txt");
			writer.write("Hello this Written using FileWriter!\n");
			writer.write("Java File Handling Example");
			writer.close();
			System.out.println("Data Written to file Successfully");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
