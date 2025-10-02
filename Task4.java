import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Number is not Valid");
        }


        for (int i = 1; i <= num-1; i++) {
            int a = i;
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= num; k++) {
                System.out.print(a++);
            }
            System.out.println();
        }

        int b = num;
        for (int i = 1; i <= num; i++) {
            int q = b;
            for (int j = 0; j < num-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                
                System.out.print(q++);
            }

            b--;
            System.out.println();
        }

    }
}
