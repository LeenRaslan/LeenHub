package week10.exc2;

public class StudentApplication {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();

        System.out.println("Parent education level appearances:");
        System.out.println(studentInfo.getNumberOfParentEducation()+"\n");

        System.out.println("Parent education level appearances sorted top bottom:");
        studentInfo.getMostAppearing().forEach(System.out::println);
        System.out.println("\n");

        System.out.println("Number of students with high parent education and lower scores than 60: "
                +studentInfo.getLowerGrades()+"\n");

        System.out.println("Genders and average scores of the top four average score students: ");
        studentInfo.getTopScore().forEach(System.out::println);
        System.out.println("\n");

        System.out.println("Is there any student with a parent education level of some high school that has at least 97 in every topic?");
        System.out.println(studentInfo.getTheHigherEducationLevel());
    }
}
