package lab1;
import java.util.Scanner;
import StrCal.StringCalculator;

public class Main {
    public static void main(String[] args) {

        StringCalculator calculator = new StringCalculator();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the string: ");
            String string = scanner.nextLine();

            int sum = calculator.add(string);

            System.out.println("The sum of the numbers is: " + sum);

        } catch (Exception e) {
            System.out.println("Something went wrong!!!");
        }


    }
}
