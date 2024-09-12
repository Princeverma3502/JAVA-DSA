package _2d_Array;
import java.util.Scanner;

public class transposeInPlace { // valid only for square matrix

  static void printMatrix(int[][] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  static void transposeInPlace(int[][] matrix, int r, int c){
    for(int i=0; i<c; i++){
      for(int j=i; j<r; j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the rows and columns of matrix");
    int r = sc.nextInt();
    int c = sc.nextInt();
    int totalelements = r*c;
    int[][] arr = new int[r][c];
    System.out.println("Enter " + totalelements + " elements of matrix ");
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
        arr[i][j] = sc.nextInt();
      }
    }

    System.out.println("Input Matrix");
    printMatrix(arr);
    System.out.println("Transposed Matrix");
    transposeInPlace(arr, r, c);
    printMatrix(arr);
  }
}
