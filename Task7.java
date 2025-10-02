import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        scanner.close();
        if (num <= 0) {
            System.out.println("Number is not Valid");
        }

        int space = (num * 2) - 2;
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int j2 = 1; j2 <= space; j2++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }

        int space2 = 2;
        for (int i = 1; i <= num - 1; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("*");
            }
            for (int j2 = 1; j2 <= space2; j2++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num - i; j++) {
                System.out.print("*");
            }
            space2 += 2;
            System.out.println();

        }
    }
}
