import java.util.Arrays;
import java.util.Scanner;

public class ShockwaveCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = 0;
            }
        }

        String[] input = scanner.nextLine().split(" ");
        while(!"Here".equals(input[0])){
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int x2 = Integer.parseInt(input[2]);
            int y2 = Integer.parseInt(input[3]);

            for (int row = x1; row <= x2; row++) {
                for (int col = y1; col <= y2; col++) {
                    matrix[row][col] += 1;
                }
            }

            input = scanner.nextLine().split(" ");
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
