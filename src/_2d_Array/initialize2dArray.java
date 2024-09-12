package _2d_Array;
import java.util.Scanner;

public class initialize2dArray {
  static void printArray(int[][] arr){
    for(int i=0; i<arr.length; i++){ // rows
      for(int j=0; j<arr[i].length; j++){ //column
        System.out.print(arr[i][j] +" ");
      }
      System.out.println();
    }
  }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row size: ");
    int r = sc.nextInt();
    System.out.print("Enter column size: ");
    int c = sc.nextInt();
    int[][] arr = new int[r][c];
    System.out.println("Enter " + r*c + " array elements: ");
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println();
    printArray(arr);
  }
}
