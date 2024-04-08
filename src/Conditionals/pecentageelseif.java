package Conditionals;
import java.util.Scanner;
public class pecentageelseif {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter percentage : ");
        float n=sc.nextInt();
        if(n>90){
        System.out.println("Excellent");}
        else if(n>80){
        System.out.println("Very Good");}
        else if(n>70){
            System.out.println("Good");}
        else if(n>60){
            System.out.println("Can do better");}
        else if(n>50){
            System.out.println("Average");}
        else if(n>40){
            System.out.println("Below average");}
        else{
            System.out.println("Fail");}
    }
}
