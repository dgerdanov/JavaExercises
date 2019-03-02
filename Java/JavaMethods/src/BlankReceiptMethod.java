import java.util.Scanner;
public class BlankReceiptMethod {
    public static void main(String[] args) {

        PrintWholeReceipt();
    }

    public static void PrintReceiptHeader() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cash Receipt");
        System.out.println("---------------");
    }
    public static void PrintReceiptBody() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Charged to:");
        System.out.println("Received by:");
    }
    public static void PrintReceiptFooter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\u00A9");

    }
    public static void PrintWholeReceipt() {
        Scanner scanner = new Scanner(System.in);
        PrintReceiptHeader();
       PrintReceiptBody();

       PrintReceiptFooter();

    }
}
