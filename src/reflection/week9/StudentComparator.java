package reflection.week9;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentComparator {
    private StudentReader reader = new StudentReader();


    public Integer getNumbersOfBoysAndGirls() {
        return reader.getStudent().stream()
                .collect(Collectors.toList())
                .size();


    }

    public Integer getNumberOfGirls() {
        return reader.getStudent().stream()
                .filter(s -> s.getGender().equals("female"))
                .collect(Collectors.toList())
                .size();
    }


    public Integer getNumberOfBoys() {
        return reader.getStudent().stream()
                .filter(s -> s.getGender().equals("male"))
                .collect(Collectors.toList())
                .size();
    }

    public List<String> getEducationsAlphabeticallySorted() {
        return reader.getStudent().stream()
                .map(s->s.getEducationLevel())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }


    public Integer getScoreAboveNinty() {
        return reader.getStudent().stream()
                .filter(s -> s.getWritingScore() > 90)
                .filter(s -> s.getReadingScore() > 90)
                .filter(s -> s.getMathScore() > 90)
                .collect(Collectors.toList())
                .size();
    }

    public Integer getStudentsWithHundred() {
        return reader.getStudent().stream()
                .filter(s -> s.getMathScore().equals(100))
                .filter(s -> s.getReadingScore().equals(100))
                .filter(s -> s.getWritingScore().equals(100))
                .collect(Collectors.toList())
                .size();

    }

    public List<StudentsInfo> getStudentsWithHundredGenders() {
        return reader.getStudent().stream()
                .filter(s -> s.getMathScore().equals(100))
                .filter(s -> s.getReadingScore().equals(100))
                .filter(s -> s.getWritingScore().equals(100))
                .collect(Collectors.toList());
    }
}
