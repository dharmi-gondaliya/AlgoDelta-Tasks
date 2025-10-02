
import java.util.Scanner;

public class Task6 {

    static void square(int i, int space) {

        for (int j3 = 1; j3 <= i; j3++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;
            for (int j2 = 1; j2 <= i; j2++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        scanner.close();
        if (num <= 0) {
            System.out.println("Number is not Valid");
        }

        for (int i = 1; i <= num; i++) {
            int space = num - 1;
            square(i, space);
        }

    }
}
