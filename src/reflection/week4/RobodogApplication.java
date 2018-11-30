package reflection.week4;

import week4.exc9.FileReader;

import java.util.*;

public class RobodogApplication {

    public static void main(String[] args) {
        FileReader fileReader1 = new FileReader();
        List<String> newFile = readFile(fileReader1);
        Set<String> fileReaders = new HashSet<>(newFile);
        System.out.println("Number of unique instructions: " + fileReaders.size());
        System.out.println("Commands: " + fileReaders);
//        fileReaders.addAll(lines);
//        System.out.println(fileReaders);

        }
    public static List<String> readFile(FileReader reader) {
        System.out.println("---- FILE");
        List<String> lines = reader.asLines("reflection/week4/robodog.txt");
        List<String> newFile = new ArrayList<>();
        for (String line : lines) {
            String replaced = line.replaceAll("!","");
            newFile.add(replaced);
            //System.out.println(replaced);
        }
        return newFile;
       // Map<String, Integer> frequency = new HashMap<>();
        //Collections.sort(frequency, Comparator.comparing(Map.Entry::getValue));

    }




}

