import java.util.Scanner;

public class Q6_GabrielLima {
    
    public static void main(String[] args) {
        int[][] matrixA = generateRandomMatrix(3, 4); // matriz A 3x4
        int[][] matrixB = generateRandomMatrix(4, 2); // matriz B 4x2
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);
        printMatrix(resultMatrix);
    }
    
    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // valores aleatórios entre 0 e 9
            }
        }
        return matrix;
    }
    
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrices cannot be multiplied");
        }
        int[][] resultMatrix = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return resultMatrix;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}