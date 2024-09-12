package _2d_Array;

import java.util.Scanner;

public class spiralOrder {

  static void printMatrix(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  static void spiralOrder(int[][] matrix, int r, int c) {
    int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
    int totalelements = 0;

    while (totalelements < r * c) {

      // topRow -> leftCol to rightCol
      for (int j = leftCol; j <= rightCol; j++) {
        System.out.print(matrix[topRow][j] + " ");
        totalelements++;
      }
      topRow++;

      // rightCol -> topRow to bottomRow
      for (int i = topRow; i <= bottomRow; i++) {
        System.out.print(matrix[i][rightCol] + " ");
        totalelements++;
      }
      rightCol--;

      // bottomRow -> rightCol to leftCol
      for (int j = rightCol; j >= leftCol; j--) {
        System.out.print(matrix[bottomRow][j] + " ");
        totalelements++;
      }
      bottomRow--;

      // leftCol -> bottomRow to topRow
      for (int i = bottomRow; i >= topRow; i--) {
        System.out.print(matrix[i][leftCol] + " ");
        totalelements++;
      }
      leftCol++;

    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the rows and columns of matrix");
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] matrix = new int[r][c];
    System.out.println("Enter " + r * c + " values");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    System.out.println("Input Matrix");
    printMatrix(matrix);

    System.out.println("Print Matrix in Spiral order ");
    spiralOrder(matrix, r, c);

  }

}
