package _2d_Array;
import java.util.Scanner;

public class rotationOfMatrixBy90Degree {

  static void printMatrix(int[][] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  static void transposeInPlace(int[][] arr, int r, int c){
    for(int i=0; i<r; i++){
      for(int j=i; j<c; j++){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
  }
  
  static void reverseArray(int[] arr){
    int i=0, j= arr.length-1;

    while(i<j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }
   
  static void rotateMatrixBy90(int[][] matrix, int n){
    // transpose
    transposeInPlace(matrix , n, n);

    // reverse each row of transposed matrix
    for(int i=0; i<n; i++){
      reverseArray(matrix[i]);
    }
  }

  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the rows and columns of matrix ");
    int r= sc.nextInt();
    int c = sc.nextInt();
    int totalelements = r*c;
    int[][] matrix = new int[r][c];
    System.out.println("Enter " + totalelements + " values");
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
        matrix[i][j] = sc.nextInt();
      }
    } 

    System.out.println("Input Matrix");
    printMatrix(matrix);

    rotateMatrixBy90(matrix, r);

    System.out.println("90 Degree Rotated Matrix");
    printMatrix(matrix);
  }
}
