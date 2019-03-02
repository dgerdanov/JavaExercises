import java.util.Scanner;
public class SalaryFines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int openedTabs = Integer.parseInt(scanner.nextLine());
        double salary = Integer.parseInt(scanner.nextLine());

        boolean isSalaryLost = false;

        for (int tabsCounter = 0; tabsCounter < openedTabs; tabsCounter++) {
            String siteName = scanner.nextLine();

            switch (siteName) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0){
                isSalaryLost = true;
                break;
            }
        }
        if (isSalaryLost){
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", salary);
        }
    }
}
