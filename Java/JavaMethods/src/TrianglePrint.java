import java.util.Scanner;
public class TrianglePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        {
            for (int line = 1; line <= number; line++)
                PrintSide(1, line);

            for (int line = number - 1; line >= 1; line--)
                PrintSide(1, line);
        }


    }

    public static void PrintSide( int start, int end) {
        Scanner scanner = new Scanner(System.in);

        for (int position = start; position <=end ; position++) {
            System.out.println(position + " ");
            
        }
        System.out.println();


    }

}
