import java.util.Scanner;

public class ReversingArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arrOfElements = scanner.nextLine().split(" ");
        for (int i = 0; i < arrOfElements.length/2 ; i++) {
            String arrOldElements = arrOfElements[i];
            arrOfElements[i]= arrOfElements[arrOfElements.length-1-i];
            arrOfElements[arrOfElements.length - 1 - i] = arrOldElements;
            
        }
        System.out.println(String.join(" ", arrOfElements));

    }
}
