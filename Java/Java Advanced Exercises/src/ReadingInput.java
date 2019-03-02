import java.util.Scanner;
import java.lang.String;
public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        String firstWord = input.next("\\w+");
        String secondWord = input.next("\\w+");
        int firstInt = input.nextInt();
        int secondInt = input.nextInt();
        int thirdInt = input.nextInt();
        input.nextLine();
        String thirdWord = input.next("\\w+");
        int sum = firstInt + secondInt + thirdInt;
        System.out.println(firstWord + " " + secondWord+ " " + thirdWord+" " +sum);


    }
}
