/*write a program to find out whether a student is pass or fail, if it requires total 40% and at
atleast 33% in each subject to pass . Assume 3 subjects.
*/package Conditionals;

import java.util.Scanner;
public class greatest_of_threenumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greatest of given three numbers.");
        }
        else if(b>a && b>c){
            System.out.println(b+" is greatest of given three numbers.");
        }
        else{
            System.out.println(c+" is greatest of givethree numbers.");
        }
    }
}
