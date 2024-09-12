package twoPointerArray;
import java.util.Scanner;

public class que {
  static void prinArray(int[] arr){
    int n = arr.length;
    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  
  static void Swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }


  static void Sort0_1(int[] arr){
    int n = arr.length;
    int left=0, right=n-1;
    while(left<right){
      if(arr[left]%2!=0 && arr[right]%2==0){
        Swap(arr, left, right);
        left++;
        right--;
      }
      if(arr[left]%2==0){
        left++;
      }
      if(arr[right]%2!=0){
        right--;
      }

    }
  }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    n = arr.length;
    System.out.println("Enter " + n + " elements");
    for(int i=0; i<n; i++){
      arr[i]= sc.nextInt();
    }
    System.out.println("Original Array");
    prinArray(arr);
    Sort0_1(arr);
    System.out.println("Sorted Array");
    prinArray(arr);
  }
}
