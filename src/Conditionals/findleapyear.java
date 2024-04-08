package Conditionals;
import java.util.Scanner;
public class findleapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int y = sc.nextInt();
        if (y % 4 == 0) {
            System.out.println("The given year " + y + " is leap year. ");
        }
        else {
            System.out.println("Not a leap year.");
        }

    }
}