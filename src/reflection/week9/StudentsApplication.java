package reflection.week9;

import week4.exc9.FileReader;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsApplication {

    public static void main(String[] args) {
        new FileReader().asStream("reflection/week9/students-performance.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new StudentsInfo(e[0], e[1], Integer.valueOf(e[2]), Integer.valueOf(e[3]), Integer.valueOf(e[4])))
                .sorted(Comparator.comparing(StudentsInfo::getEducationLevel))
                .collect(Collectors.toList())
                .forEach(e-> System.out.println("education level: " + e.getEducationLevel()));
                //.filter(e -> e.getMathScore() > 90 && e.getReadingScore() > 90 && e.getWritingScore() > 90)
                //.filter(e -> e.getMathScore() == 100 && e.getReadingScore() == 100 && e.getWritingScore() == 100)
                //.collect(Collectors.toList())


    }
    // .count()
    // .filter(e-> e.contains("female")
    // .
}
