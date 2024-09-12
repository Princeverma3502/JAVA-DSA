package twoPointerArray;
import java.util.Scanner;

public class q {
  static void sumOfOdd(int n){
    int sum = 0;
    for(int i=0; i<=n; i++){
      if(i%2 !=0){
        sum = sum + i;
      }
    }
    System.out.println("The sum of first  " + n +" odd numbers is " + sum);
  }

  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    sumOfOdd(n);
  }
}
