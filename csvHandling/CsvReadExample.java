package csvHandling;
 
import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;
 
public class CsvReadExample {

    public static void main(String[] args) {
        String file = "students.csv";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {

                String[] values = line.split(","); // Split by comma

                System.out.println("ID: " + values[0] + ", Name: " + values[1] + ", Marks: " + values[2]);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}

 