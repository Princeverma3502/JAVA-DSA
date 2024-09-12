package _2d_Array;
import java.util.Scanner;

public class additionOfMatrix {
  
  static void printMatrix(int[][] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  static void addMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
    if(r1!=r2 || c1!=c2){
      System.out.print("Wrong Input - Addition not possible");
      return;
    }
    int[][] sum = new int[r1][c1];

    for(int i=0; i<r1; i++){ //row
      for(int j=0; j<c1; j++){ //column
        sum[i][j] = a[i][j] + b[i][j];
      }
    }
    printMatrix(sum);
  }

  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows and columns of matrix 1");
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int[][] a = new int[r1][c1];
    System.out.println("Enter matrix values");
    for(int i=0; i<r1; i++){
      for(int j=0; j<c1; j++){
        a[i][j] = sc.nextInt();
      }
    }

    System.out.println("Enter number of rows and coummns of matrix 2");
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
    int[][] b = new int[r2][c2];
    System.out.println("Enter matrix values");
    for(int i = 0; i<r2; i++){
      for(int j=0; j<c2; j++){
        b[i][j] = sc.nextInt();
      }
    } 

    System.out.println("Matrix 1");
    printMatrix(a);
    System.out.println("Matrix 2");
    printMatrix(b);

    System.out.println("Addition of Matrix");
    addMatrix(a, r1, c1, b, r2, c2);
  }
}
 