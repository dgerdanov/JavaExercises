import java.util.Scanner;

public class ExamPreparationCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOFBadGrades = Integer.parseInt(scanner.nextLine());
        int counterOfBadGrades = 0;
        int counterOfTasks = 0;
        double sumOfGrades = 0;
        String lastTask = "";


        while (counterOfBadGrades < numberOFBadGrades) {

            String currentTask = scanner.nextLine();
            if (currentTask.equalsIgnoreCase("Enough")) {
                break;

            }

            int currentGrade = Integer.parseInt(scanner.nextLine());


            if (currentGrade <= 4) {
                counterOfBadGrades++;

            }
            counterOfTasks++;
            sumOfGrades += currentGrade;
            lastTask = currentTask;



        }
        if (counterOfBadGrades >= numberOFBadGrades) {

            System.out.printf("You need a break, %d poor grades.", counterOfBadGrades);

        } else {
            double averageGrade = sumOfGrades / counterOfTasks;
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.printf("Number of problems: %d%n", counterOfTasks);
            System.out.printf("Last problem: %s%n", lastTask);


        }


    }
}
