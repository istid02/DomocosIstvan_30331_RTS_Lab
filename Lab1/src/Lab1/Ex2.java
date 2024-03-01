package Lab1;

public class Ex2 {
	
	public static void main(String[] args) {
        int[][] matrix1 = {
            {2, 3, 1},
            {7, 1, 6},
            {9, 2, 4}
        };

        int[][] matrix2 = {
            {8, 5, 3},
            {3, 9, 2},
            {2, 7, 3}
        };

        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        int[][] productMatrix = multiplyMatrices(matrix1, matrix2);

        System.out.println("Sum of the matrices:");
        printMatrix(sumMatrix);

        System.out.println("\nProduct of the matrices:");
        printMatrix(productMatrix);
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sum = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;
        int[][] product = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
