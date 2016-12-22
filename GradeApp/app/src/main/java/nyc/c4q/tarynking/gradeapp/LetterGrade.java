package nyc.c4q.tarynking.gradeapp;

/**
 * Created by tarynking on 9/18/16.
 */
public class LetterGrade {

    public static String gradeLetter(int number){
        String grade = "A";
        String gradeColor = "green";
        if (number == 100) {
            grade = "A+";
        } else if (number >= 90 && number <= 99) {
            grade = "A";
        } else if (number >= 80 && number <= 89) {
            grade = "B";
        } else if (number >= 70 && number <= 79) {
            grade = "C";
        } else if (number >= 60 && number <= 69) {
            grade = "D";
        } else if (number >= 0 && number <= 59) {
            grade = "F";
        } else {
            grade = "?";
        }
        return grade;
    }
}

