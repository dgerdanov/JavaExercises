import java.util.Scanner;

public class SumMatrixElements {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String sizes = scanner.nextLine();
        int[][] matrix = MatrixReader(sizes);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        int sumOfElements = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sumOfElements += matrix[row][col];
            }
        }

        System.out.println(sumOfElements);
    }

    private static int[][] MatrixReader(String sizes) {
        String[] matrixLenght = sizes.split(", ");
        int[][] matrix = new int[Integer.parseInt(matrixLenght[0])][Integer.parseInt(matrixLenght[1])];
        for (int row = 0; row < matrix.length; row++) {
            String[] separator = scanner.nextLine().split(", ");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = Integer.parseInt(separator[col]);
            }
        }
        return matrix;
    }
}