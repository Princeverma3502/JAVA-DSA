package Conditionals;
import java.util.Scanner;
public class age_comparision_que {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Ram`s age :  ");
        int r = sc.nextInt();
        System.out.print("Enter Shyam`s age : ");
        int s = sc.nextInt();
        System.out.print("Enter Ajay`s age : ");
        int a = sc.nextInt();
        if(r<s && r<a){
            System.out.println("Ram is younger than Ajay and Shyam.");
        }
        else if(s<a && s<r){
            System.out.println("Shyam is younger than Ajay and Ram.");
        }
        else{
            System.out.println("Ajay is younger than Ram and Shyam.");
        }
    }
}
