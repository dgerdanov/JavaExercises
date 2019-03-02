import java.util.Scanner;

public class OldLibraryCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        int libraryCapacity = Integer.parseInt(scanner.nextLine());
        boolean isBookFound = false;
        String currentBook = "";
        int counterOfBooks = 0;

        while (!isBookFound && counterOfBooks < libraryCapacity) {
            currentBook = scanner.nextLine();
            if (currentBook.equalsIgnoreCase(bookName)) {
                isBookFound = true;
            }
            else{
                counterOfBooks++;
            }

        }
        if (isBookFound=true) {

            System.out.printf("You checked %d books and found it.", counterOfBooks);
        }
        else if (isBookFound=false) {

            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counterOfBooks);

        }

    }
}
