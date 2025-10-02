import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Number is not Valid");
        }

        int i1 = 0;
        int i1_ = 1;
        int i1__ = 2;
        int i2 = 1;
        int i3 = 0;
        int out1 = 3;
        int out2 = 2;
        int o2 = 2;
        int out3 = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < (num * 4) + 1; j++) {

                if (i == 0) {
                    if (j == ((2 * i1) + 2)) {
                        System.out.print(out1 + " "); 
                        out1 = (3 * i1__) + i1_;
                        i1__++;
                        i1_++;
                        i1 += 2;
                    } else {
                        System.out.print("  "); 
                    }
                }

                if (i == 1) {
                    if (j == i2) {
                        System.out.print(out2 + " "); 
                        out2 = 2 * o2++;
                        i2 += 2;
                    } else {
                        System.out.print("  "); 
                    }
                }

                if (i == 2) {
                    if (j == i3) {
                        System.out.print(out3 + " "); 
                        out3 += 4;
                        i3 += 4;
                    } else {
                        System.out.print("  "); 
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
