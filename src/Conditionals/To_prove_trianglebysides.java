package Conditionals;
import java.util.Scanner;  
public class To_prove_trianglebysides {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first side of the triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter second side : ");
        int b = sc.nextInt();
        System.out.print("Enter third side : ");
        int c = sc.nextInt();
        if((a+b)>c && (b+c)>a && (a+c)>b){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }
}
