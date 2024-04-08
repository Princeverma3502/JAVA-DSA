package Conditionals;
import java.util.Scanner;
public class divisibility {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int a =sc.nextInt();
        if(a%5==0){
        System.out.println("number is divisible by 5");
        }
        else{
            System.out.println("number is not divisible by 5");
        }
    }

}
