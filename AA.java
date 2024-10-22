import java.util.Scanner;

public class AA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");

            int number = sc.nextInt();

            if (number % 3 == 0) {
                count++;
            }
        }

        System.out.println("\nNumber of inputs divisible by 3: " + count);

    }
}