package csvHandling;
 
import java.io.*;

import java.util.*;
 
public class CsvUpdateExample {
    public static void main(String[] args) {
        String file = "students.csv";
        List<String> lines = new ArrayList<>();
        // Step 1: Read the file
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Check if line contains Bob's record
                if (line.startsWith("2,")) { 
                    line = "2,Bob,75"; // Update marks
                }
                lines.add(line);
            }

        } catch (IOException e) {

            e.printStackTrace();

        }
        // Step 2: Write back to file
        try (FileWriter fw = new FileWriter(file)) {
            for (String l : lines) {
                fw.write(l + "\n");
            }
            System.out.println("CSV file updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

 