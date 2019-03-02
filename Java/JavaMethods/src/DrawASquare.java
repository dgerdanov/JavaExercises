import java.util.Scanner;

public class DrawASquare {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cols = Integer.parseInt(console.nextLine());

        PrintSquare(cols);

    }

    static void PrintSquare(int cols){
        PrintHeader(cols);
        PrintMiddle(cols);
        PrintHeader(cols);
    }

    static void PrintHeader(int cols){
        for (int row = 0; row <2*cols ; row++) {
            System.out.print("-");
        }

        System.out.println();
    }

    static void PrintMiddle(int middlePart ){
        for (int row = 0; row <middlePart-2 ; row++) {
            System.out.print("-");
            for (int col = 0; col < middlePart-1; col++) {
                System.out.print("\\/");
            }

            System.out.println("-");
        }

    }
}