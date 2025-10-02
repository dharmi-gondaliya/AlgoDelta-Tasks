import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        scanner.close();
        if (num <= 0) {
            System.out.println("Number is not Valid");
        }

        
    }
}
