package BasicsOfJava;
import java.util.Scanner;
public class percentageof5marks {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Maths Marks = ");
        double m1 = sc.nextInt();
        System.out.print("Enter your English Marks = ");
        double m2= sc.nextInt();
        System.out.print("Enter your Hindi Marks = ");
        double m3=sc.nextInt();
        System.out.print("Enter your Physics Marks = ");
        double m4=sc.nextInt();
        System.out.print("Enter your Chemistry Marks = ");
        double m5=sc.nextInt();
        System.out.print("Enter Total Marks per subject = ");
        double tp=sc.nextInt();
        double Total=tp*5;
        double total = (m1+m2+m3+m4+m5);
        double average=total/5;
        double percentage =(total/Total)*100;
        System.out.println("Total Marks Obtained is "+total);
        System.out.println("Average of marks is "+average);
        System.out.println("Percentage of Marks is "+percentage);

    }


}
