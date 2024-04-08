package Conditionals;
import java.util.*;
public class positionofpoint_wrtcircle {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the x-coordinate of circle : ");
    double x1 = sc.nextDouble();
    System.out.print("Enter the y-coordinate of circle : ");
    double y1 = sc.nextDouble();
    System.out.print("Enter the x-coordinate : ");
    double x = sc.nextDouble();
    System.out.print("Enter the y-coordinate : ");
    double y = sc.nextDouble();
    System.out.print("Enter the radius of the circle : ");
    double r=sc.nextDouble();
    double z = (x-x1)*(x-x1) + (y-y1)*(y-y1);
    System.out.println("Distance of the point from centre is "+z);
    System.out.println("Radius square = "+(r*r));
    if(z>(r*r)){
        System.out.println("The given point lies outside the circle. ");
    }
    else if(z==(r*r)){
        System.out.println("The given point lies on the circle. ");
    }
    else{
        System.out.println("The given point lies inside the circle.");
    }
}
}
