import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class FileReadingWriting {
    public static void main(String[] args) {
        String name = "M. Oly Mahmud";
        int roll = 210614;
        double gpa = 3.33;

        try {
            FileWriter writer = new FileWriter("info.txt");
            writer.write(name + " " + roll + " " + gpa);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileReader reader = new FileReader("info.txt");
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
