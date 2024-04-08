package Loops;
import java.util.Scanner;
public class break_que {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int num=1; num<n; num++){
            if(num%3==0){
            break;}
            System.out.println(num);

        }


    }
}
