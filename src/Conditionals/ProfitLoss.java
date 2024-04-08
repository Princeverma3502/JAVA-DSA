package Conditionals;
import java.util.Scanner;
class ProfitLoss {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the selling price : ");
        float SP=sc.nextInt();
        System.out.print("Enter the cost price : ");
        float CP=sc.nextInt();
        System.out.println("Selling Price = "+SP);
        System.out.println("Cost Price = "+CP);
        if(SP>CP){
            float profit=SP-CP;
            System.out.println("You made a profit of "+profit);
        }
        if(CP>SP){
            float loss=CP-SP;
            System.out.println("You incurred a loss "+loss);
        }
        if(CP==SP){
            System.out.println("You neither made a profit nor incurred a loss.");
        }
    }

}
