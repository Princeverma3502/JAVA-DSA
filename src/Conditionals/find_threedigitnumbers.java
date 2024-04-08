package Conditionals;
import java.util.Scanner;
public class find_threedigitnumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("The given number is three digit numbers.");
        }
        else{
            System.out.println("The given number is not a three digit number.");
        }
    }
}
