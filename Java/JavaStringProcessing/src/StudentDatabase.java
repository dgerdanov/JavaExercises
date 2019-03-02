import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("[,\\s-]+");
        double average = 0;
        for (int i = 1; i <= input.length ; i++) {
            average += Double.parseDouble(input[i]);
            if (i == input.length - 1) {
                average /=3;

            }
            
        }
        System.out.printf("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s%n","Name", "JAdv", "JavaOOP", "Average");
        System.out.printf("%1$-10f|%2$7f|%3$7f|%4$7f|%5$7f%n","Name", "JAdv", "JavaOOP", "Average",
                input[0],Double.valueOf(input[1]),Double.valueOf(input[2]),Double.valueOf(input[3]),average);

    }
}
