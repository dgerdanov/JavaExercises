import java.util.Scanner;
public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrWeekdays  = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int currentDay = Integer.parseInt(scanner.nextLine());

        if (currentDay >=1 && currentDay<=7) {

            System.out.println(arrWeekdays[currentDay - 1]);

        }
    }
}
