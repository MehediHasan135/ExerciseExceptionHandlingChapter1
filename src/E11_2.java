//E11_2
import java.io.*;
public class E11_2 {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File tempFile = new File("temp.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter writer = new PrintWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    writer.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error handling the file: " + e.getMessage());
        }
        if (inputFile.delete()) {
            if (!tempFile.renameTo(inputFile)) {
                System.out.println("Failed to rename the temporary file.");
            }
        } else {
            System.out.println("Failed to delete the original file.");
        }
    }
}
