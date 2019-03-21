import java.util.Scanner;

public class ArrayDayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arrDaysOfWeek = {"Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int dayInput = Integer.parseInt(scanner.nextLine());
        if (dayInput >= 1 && dayInput <= 7) {

                System.out.println(arrDaysOfWeek[dayInput-1]);
        }
        else{

            System.out.println("Invalid Day");
        }
    }
}
