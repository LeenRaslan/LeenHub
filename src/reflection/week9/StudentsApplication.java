package reflection.week9;

public class StudentsApplication {

    public static void main(String[] args) {

        StudentComparator comparator = new StudentComparator();

        System.out.println("Total number of Student performance entries: " + comparator.getNumbersOfBoysAndGirls());
        System.out.println("Number of female students: "+ comparator.getNumberOfGirls());
        System.out.println("Number of male students: " + comparator.getNumberOfBoys());
        System.out.println("Parental education levels sorted alphabetically: " + comparator.getEducationsAlphabeticallySorted());
        System.out.println("Number of students with scores higher than 90: " + comparator.getScoreAboveNinty() );
        System.out.println("Number of students with scores equal to 100: " +comparator.getStudentsWithHundred());
        System.out.println("Genders of these students are: " + comparator.getStudentsWithHundredGenders());


    }

}