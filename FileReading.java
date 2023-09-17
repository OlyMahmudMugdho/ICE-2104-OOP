import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class FileReading {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("student.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
