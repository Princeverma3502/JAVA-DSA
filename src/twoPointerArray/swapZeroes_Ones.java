package twoPointerArray;
import java.util.Scanner;

public class swapZeroes_Ones {

  static void prinArray(int[] arr){
    int n = arr.length;
    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
   
//   static void Swap0_1(int[] arr){
//     int n =arr.length;
//     // to count the number of zeroes
//     int zeroes = 0;
//     for(int i=0; i<n; i++){
//       if(arr[i]==0){
//         zeroes++;
//       }
//     }

//     for(int i=0; i<n; i++){
//       if(i<zeroes){
//         arr[i]=0;
//       }
//       else{
//         arr[i]=1;
//       }
//     }
//  }
                                         //OR

  static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

  }
  static void SortZeroesAndOnes(int[] arr){
    int n =arr.length;
    int left =0,  right =n-1;
    while(left<right){
      if(arr[left]==1 && arr[right]==0){
       swap(arr, left, right);
       left++;
       right--;
      }

      if(arr[left]==0){
        left++;
      }

      if(arr[right]==1){
        right--;
      }
    }


  }





  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter " + n + " elements");
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("Original Array");
    prinArray(arr);
    SortZeroesAndOnes(arr);
    System.out.println("Sorted Array");
    prinArray(arr);
   
  }
}