import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        printTriangle(numberInput);

    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

    }

    public static void printTriangle(int numberInput) {
        for (int line = 1; line <= numberInput; line++)
            printLine(1, line);

        for (int line = numberInput - 1; line >= 1; line--)
            printLine(1, line);
    }


}
