package Loops;
import java.util.Scanner;
public class continue_que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int num=1; num<=n; num++){
            if(num%3==0){
             continue;
            }
            System.out.println(num);
        }
    }
}