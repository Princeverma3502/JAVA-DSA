package _2d_Array;
import java.util.Scanner;

public class transposeOfMatrix {

  static void printMatrix(int[][] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
   
  static int[][] transpose(int[][] matrix, int r, int c){
    int[][] ans = new int[c][r];
     
    for(int i=0; i<c; i++){
      for(int j=0; j<r; j++){
        ans[i][j] = matrix[j][i];
      }
    }
    return ans;
  }

  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the rows and columns of the matrix ");
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] matrix = new int[r][c];
    int totalelements = r*c;
    System.out.println("Enter " + totalelements + " values of matrix");
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("Input Matrix");
    printMatrix(matrix);
    System.out.println("Transposed Matrix");
    int[][] ans = transpose(matrix, r, c);
    printMatrix(ans);
    
  }
  
}
