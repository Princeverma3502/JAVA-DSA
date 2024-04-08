package Conditionals;
import java.util.Scanner;
public class absoutenumber {
    public static void main(String[]args){
     Scanner obc=new Scanner(System.in);
     System.out.println("Enter your number");
     int a = obc.nextInt();
     if(a>=0){
         System.out.println("The absolute value of "+a+ " is "+a);
     }
     else{
         System.out.println("The absolute value of "+a+ " is "+(a*(-1)));
     }
    }
}
