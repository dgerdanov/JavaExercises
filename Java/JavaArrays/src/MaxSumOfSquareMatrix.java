import java.util.Scanner;

public class MaxSumOfSquareMatrix {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String size = scanner.nextLine();
        int[][] matrix = MatrixReader(size);
        int[][] result = new int[2][2];
        int bestSum = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > bestSum) {
                    bestSum = sum;
                    result[0][0] = matrix[row][col];
                    result[0][1] = matrix[row][col + 1];
                    result[1][0] = matrix[row + 1][col];
                    result[1][1] = matrix[row + 1][col + 1];
                }
            }
        }

        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println(bestSum);
    }

    private static int[][] MatrixReader(String sizes) {
        String[] matrixLenght = sizes.split(", ");
        int[][] matrix = new int[Integer.parseInt(matrixLenght[0])][Integer.parseInt(matrixLenght[1])];
        for (int row = 0; row < matrix.length; row++) {
            String[] reminder = scanner.nextLine().split(", ");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = Integer.parseInt(reminder[col]);
            }
        }
        return matrix;
    }
}
