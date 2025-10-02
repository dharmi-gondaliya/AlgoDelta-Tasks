import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Number is not Valid");
        }

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i*2)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int star = num-1;
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (star*2)-1; k++) {
                System.out.print("*");
            }
            star--;
            System.out.println();
        }
    }
}