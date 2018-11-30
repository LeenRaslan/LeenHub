package week4.exc9;

import java.util.List;

public class LoremIpsumApplication {

    public static void main(String[] args) {

        FileReader reader = new FileReader();
        readText(reader);
    }

    public static void readText(FileReader reader) {
        System.out.println("---- TEXT");
        List<String> lines = reader.asLines("week4/exc9/lorem-ipsum");
        for (String line : lines) {
            System.out.println(line);
            
        }

    }
}
