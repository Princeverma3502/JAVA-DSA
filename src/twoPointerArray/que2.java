package twoPointerArray;
import java.util.Scanner;

public class que2 {
  static void prinArray(int[] arr){
    int n = arr.length;
    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
  }

  static void swap(int[] ans, int i ,int j){
    int temp = ans[i];
    ans[i] = ans[j];
    ans[j] = temp;

  }


  // static void reverse(int[] ans){
  //   int i=0, j = ans.length-1;
  //   while(i<j){
  //     swap(ans , i , j);
  //     i++;
  //     j--;
  //   }      
  // }

  static void Sorting(int[] arr){
    int n =arr.length;
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        if(arr[i]>arr[j]){
          swap(arr, i, j);
        }
      }
    }
  }

  static void SortSquared(int[] arr){
    int n = arr.length;
    int left=0, right = n-1, k=0;
    int[] ans = new int[n];
    while(left<=right){
      if(Math.abs(arr[left]) > Math.abs(arr[right])){
        ans[k++] = arr[left]*arr[left];
        left++;
      }
      else{
        ans[k++] = arr[right]*arr[right];
        right--;
      }
    }
    System.out.println("Original unsorted Array");
    prinArray(ans);
    Sorting(ans);
    System.out.println("\nSorted Array");
    prinArray(ans);
  }

  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the " + n + " array elements" );
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    } 
    SortSquared(arr);
  }
  
}
