package csvHandling;

import java.io.FileWriter;
import java.io.IOException;

public class CsvWriterExample {

	public static void main(String[] args) {
		String file="students.csv";
		try(FileWriter fw= new FileWriter(file)){
			fw.write("Id,Name,Marks\n");
			fw.write("1,Skandha,85\n");
			fw.write("2,bob,55\n");
			fw.write("1,Alice,65\n");
          System.out.println("CSv file created sucessfully !");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
