//E11_4
import java.io.*;
public class E11_4 {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                writer.printf("/* %d */ %s%n", lineNumber++, line);
            }
        } catch (IOException e) {
            System.out.println("Error handling the file: " + e.getMessage());
        }
    }
}

