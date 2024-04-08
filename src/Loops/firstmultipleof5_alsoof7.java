package Loops;
import java.util.Scanner;
public class firstmultipleof5_alsoof7 {
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number : ");
       int n = sc.nextInt();
       int num=1;
       while(num<=n){
           if(num%5==0 && num%7==0) {
               System.out.println("Found ans " +num);
               continue;
           }
         num++;
       }
   }
}
