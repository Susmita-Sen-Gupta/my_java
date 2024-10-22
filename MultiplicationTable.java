
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("\nMultiplication table of " + number + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

    }
}
