import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LexicalAnalyzer {
    public static void main(String[] args) {
        List<String> fileContents = readFile("test.ppll");
        for (String line : fileContents) {
            System.out.println(line);
        }
    }

    private static List<String> readFile(String fileName) {
        List<String> fileContents = new ArrayList<>();

        try {
            // Step 1: Open the file
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Step 2: Read the contents of the file and write to console
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileContents.add(line);
            }

            // Step 3: Close the file
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContents;
    }
}