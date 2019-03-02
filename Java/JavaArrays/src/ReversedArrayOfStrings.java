import java.util.Scanner;
public class ReversedArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        String[] reversedElements = new String[elements.length];
        for (int i = 0; i < elements.length ; i++) {
            reversedElements [i] =elements[elements.length - i - 1];
            
        }
        System.out.println(String.join(" ", reversedElements));
    }

}
