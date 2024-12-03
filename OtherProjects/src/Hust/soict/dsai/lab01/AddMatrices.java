package Hust.soict.dsai.lab01;

import java.util.Scanner;
public class AddMatrices {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of rows: ");
        int rows = keyboard.nextInt();
        System.out.println("Please enter the number of columns: ");
        int cols = keyboard.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        System.out.println("The first matrix:");
        inputMatrix(keyboard, matrixA, rows, cols);
        System.out.println("The second matrix:");
        inputMatrix(keyboard, matrixB, rows, cols);

        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Here's the sum of the two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    private static void inputMatrix(Scanner keyboard, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Please enter element ["+ (i+1) + "][" + (j+1) + "]: ");
                matrix[i][j] = keyboard.nextInt();
            }
        }
    }
}