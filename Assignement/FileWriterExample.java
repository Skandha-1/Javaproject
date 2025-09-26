package Assignement;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) {
		try { 
			FileWriter writer=new FileWriter("Assignmentoutput.txt");
			writer.write("Welcome to java ");
			writer .write("Hello, Java File Handling!");
			writer.close();
			System.out.println("Data Written to file Successfully");

		}
			catch(IOException e){
				e.printStackTrace();
				
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	