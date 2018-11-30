package reflection.week4;

import week4.exc9.FileReader;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobodogApplication {

    public static void main(String[] args) {
        FileReader fileReader1 = new FileReader();
        readFile(fileReader1);
        Set<FileReader> fileReaders = new HashSet<>();
        fileReaders.add(fileReader1);

        }
    public static void readFile(FileReader reader) {
        System.out.println("---- FILE");
        List<String> lines = reader.asLines("reflection/week4/robodog.txt");
        for (String line : lines) {
            String replaced = line.replaceAll("!","");
            System.out.println(replaced);


        }

    }




}

