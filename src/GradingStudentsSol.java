import java.lang.reflect.Array;
import java.util.Arrays;

public class GradingStudentsSol {
//4
//73
//67
//38
//33

    public static void main(String[] args){

        int[] grades = {4, 73, 67, 38, 33};

        System.out.println(Arrays.toString(gradingStudents(grades)));
    }


    static int[] gradingStudents(int[] grades){

        int[] roundedGrades = new int[grades.length - 1];
        int num = 0;

        if (grades[0] >= 1 && grades[0] <= 60) {
            for (int i = 1; i < grades.length; i++) {
            if (grades[i] <  38 ) {
                roundedGrades[i-1] = grades[i];
                continue;
            }else {
                num = grades[i] - grades[i] % 5;
            }

                if (grades[i] < 0 || grades[i] > 100) {
                    continue;
                }

                if ((num + 5) - grades[i] < 3) {
                    num = grades[i] - grades[i] % 5;
                    roundedGrades[i-1] = num + 5;
                }else {
                    roundedGrades[i-1] = grades[i];
                }
            }
        }

        return roundedGrades;
    }
}
