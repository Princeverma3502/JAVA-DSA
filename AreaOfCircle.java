package BasicsOfJava;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius = ");
        double radius=sc.nextInt();
        double $pi=3.14;
        double area = $pi * radius * radius;
        System.out.println("Area of the given circle is "+area);
        double circum = 2 * $pi * radius;
        System.out.println("Circumference of the given circle is "+circum);

    }
}