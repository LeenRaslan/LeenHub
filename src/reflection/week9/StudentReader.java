package reflection.week9;

import week4.exc9.FileReader;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {
    FileReader reader = new FileReader();

    public List<StudentsInfo> getStudent() {
        return reader.asStream("reflection/week9/students-performance.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new StudentsInfo(e[0], e[1], Integer.valueOf(e[2]), Integer.valueOf(e[3]), Integer.valueOf(e[4])))
                .collect(Collectors.toList());
    }
}

