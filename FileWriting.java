import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt");
            String student = "M. Oly Mahmud";
            int roll = 210614;
            writer.write(student + "\n" + roll);
            writer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
