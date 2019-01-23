package reflection.week9;

public class StudentsInfo {

    private String gender;
    private String educationLevel;
    private Integer mathScore;
    private Integer readingScore;
    private Integer writingScore;

    public StudentsInfo(String gender, String educationLevel, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.educationLevel = educationLevel;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public Integer getWritingScore() {
        return writingScore;
    }

    public Integer getAverageScore(){
        return (mathScore+readingScore+writingScore)/3;
    }
}
