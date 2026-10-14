
import java.util.Scanner;

public class Main {

    public static void generateTable(int number) {
        System.out.println("\nTable of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Single Table");
        System.out.println("2. Tables in a Range");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter number: ");
            int number = sc.nextInt();
            generateTable(number);

        } else if (choice == 2) {
            System.out.print("Enter starting number: ");
            int start = sc.nextInt();

            System.out.print("Enter ending number: ");
            int end = sc.nextInt();

            if (start <= end) {
                for (int n = start; n <= end; n++) {
                    generateTable(n);
                }
            } else {
                System.out.println("Invalid range!");
            }
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
