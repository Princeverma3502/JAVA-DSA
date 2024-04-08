package Conditionals;
import java.util.Scanner;
public class comparisionareaperimeter {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  length of the rectangle : ");
        float l=sc.nextInt();
        System.out.print("Enter breadth of the rectangle : ");
        float b=sc.nextInt();
        float area= l*b;
        float peri= 2*(l+b);
        System.out.println("length = "+l);
        System.out.println("Breadth = "+b);
        if(area>peri){
            System.out.println("The area of the rectangle is greater than its perimeter");
        }
        else if(area<peri){
            System.out.println("The area of the rectangle is less than its perimeter");
        }
        else{
            System.out.println("Area is equal to the perimeter");

        }



    }
}
