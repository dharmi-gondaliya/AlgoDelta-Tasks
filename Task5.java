import java.util.Scanner;

public class Task5 {
    static void diamond(int num){
         for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = num-1; i >= 1;i--) {
             for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
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
           diamond(i);
       }
       scanner.close();
    }
}
