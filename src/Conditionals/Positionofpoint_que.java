package Conditionals;
import java.util.*;
public class Positionofpoint_que {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x-coordinate : ");
        double x = sc.nextDouble();
        System.out.print("Enter y-coordinate : ");
        double y = sc.nextDouble();
        if(x==0){
            System.out.println("The given point lies on the y-axis.");
        }
        else if(y == 0){
            System.out.println("The given point lies on the x-axis.");
        }
        else if(x==0 && y==0){
            System.out.println("The given point lies on the origin.");
        }
        else{
            System.out.println("The given point lies in between the axes.");
            if(x>0 && y>0){
                System.out.println("The point lies in I Quadrant.");}
            if(x<0 && y>0){
                System.out.println("The point lies in II Quadrant.");}
            if(x<0 && y<0){
                System.out.println("The point lies in III Quadrant.");}
            if(x>0 && y<0){
                System.out.println("The point lies in IV Quadrant.");}
        }
    }
}
