import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try {
            // Step 1: Open the file
            FileReader fileReader = new FileReader("test.ppll");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Step 2: Read the contents of the file and write to console
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Step 3: Close the file
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
