//E11_1
import java.io.*;
public class E11_1 {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter("hello.txt")) {
            out.println("Hello, World!");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
        try (BufferedReader in = new BufferedReader(new FileReader("hello.txt"))) {
            String line = in.readLine();
            System.out.println("File content: " + line);
        } catch (IOException e) {
            System.out.println("Error reading from the file: " + e.getMessage());
        }
    }
}

