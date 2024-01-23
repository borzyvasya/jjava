import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(parseFileToString());
    }
    public static List<String> parseFileToString() {
        File file = new File("src/People.txt");
        List<String> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                people.add(line);

                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();

                people.add(line);
            }
            return people;

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect entrance file");
        }

        return null;
    }
}
