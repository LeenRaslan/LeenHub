package week10.exc2;

import reflection.week9.StudentReader;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentInfo {
    private StudentReader reader = new StudentReader();


    public Map<String, Long> getNumberOfParentEducation(){
        return reader.getStudent().stream()
                .map(e-> e.getEducationLevel())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }
    public List<String> getMostAppearing() {
        return reader.getStudent().stream()
                .map(e-> e.getEducationLevel())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
    }

    public long getLowerGrades(){
        return reader.getStudent().stream()
                .filter(e-> e.getEducationLevel().contains("master's degree"))
                .filter(e-> e.getWritingScore()<60)
                .filter(e-> e.getReadingScore()<60)
                .filter(e-> e.getMathScore()<60)
                .count();
    }
    public List<String> getTopScore(){
        return reader.getStudent().stream()
                .map(e-> e.getAverageScore() + "  |  " + e.getGender())
                .sorted((e1, e2) -> e2.compareTo(e1))
                .limit(4)
                .collect(Collectors.toList());
    }
        public boolean getTheHigherEducationLevel(){
        return reader.getStudent().stream()
                .filter(e-> e.getWritingScore()>97)
                .filter(e-> e.getReadingScore()>97)
                .filter(e-> e.getMathScore()>97)
                .anyMatch(e-> e.getEducationLevel()== "some high school");

    }

}
