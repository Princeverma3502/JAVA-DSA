package Conditionals;
import java.util.Scanner;
public class Tocheckstudent_passorfail {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter English Marks : ");
        float a = sc.nextInt();
        System.out.print("Enter Mathematics Marks : ");
        float b = sc.nextInt();
        System.out.print("Enter Chemistry Marks : ");
        float c = sc.nextInt();
        double avg= (a+b+c)/3.0;
        if(avg>40 && a>33 && b>33 && c>33){
            System.out.println("Congratulations , You have been promoted.");
        }
        else{
            System.out.println("Sorry, You have not been promoted.");
        }
    }
}
