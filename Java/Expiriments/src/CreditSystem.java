import java.util.Scanner;

public class CreditSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCourses = Integer.parseInt(scanner.nextLine());
        int credits = 0;
        int score = 0;
        int sumCredits = 0;
        int sumGrade = 0;
        int averageGrade = 0;


        for (int counterOfCourses = 0; counterOfCourses < numberOfCourses; counterOfCourses++) {

            int grade = Integer.parseInt(scanner.nextLine());
            score = grade % 10;
            credits = grade / 10;
            switch (grade) {

                case 1:
                    credits = 0;
                    break;


                case 2:
                    credits *= 0.5;
                    break;

                case 3:
                    credits *= 0.7;
                    break;
                case 4:
                    credits *= 0.85;
                    break;
                case 5:
                    credits *= 0.8;
                    break;
                default:
                    break;


            }

            sumCredits +=credits;
            sumGrade +=grade;
        }


        averageGrade = sumGrade/numberOfCourses;
        System.out.println(sumCredits);
        System.out.println(sumGrade);
    }
}
