import java.util.Scanner;

public class Main {

    public static void PrintTriangle(int n, int m) {

        int x = m/n;
        int c = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
            c = c + x;
        }
    }

    public static void PrintRectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 1 for triangle or 2 for rectangle: ");
        int input = keyboard.nextInt();

        System.out.println("Enter height: ");
        int height = keyboard.nextInt();

        System.out.println("Enter width: ");
        int width = keyboard.nextInt();

        if (input == 1) {
            PrintTriangle(height, width);
        } else if (input == 2) {
            PrintRectangle(height, width);
        } else {
            System.out.println("Invalid input");
        }

    }
}
