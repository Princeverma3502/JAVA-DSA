package Conditionals;
 import java.util.Scanner;
public class divisibility_question {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your number : ");
    int n = sc.nextInt();
    if(n%5==0 && n%3!=0){
        System.out.println("The number is divisible by 5 but not 3.");
    }
}
}
