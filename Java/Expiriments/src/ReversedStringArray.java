import java.util.Arrays;
import java.util.Scanner;
public class ReversedStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] strings = scanner.nextLine().split("\\s+");

        for (int i = 0; i < strings.length / 2 ; i++) {
            String currentString = strings [i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i]=currentString;
            
        }

        System.out.println(String.join(" ",strings));

        }
    }

