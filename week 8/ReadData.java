import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadData {
    public static void main(String[] args) {
        try {
            // Create a FileWriter
            FileWriter writer = new FileWriter("output.txt");
            String data = "This is a line of text inside the file.";
            writer.write(data);
            writer.close();

            // Create a FileReader
            FileReader reader = new FileReader("output.txt");
            int character;
            while ((character = reader.read())!= -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}