package Tasks;

import java.util.Scanner;

public class Common {
    protected void sum() {
        {
            int a = 100, b = 100, c;
            c = a + b;
            System.out.println("The sum of a+b =" + c);
        }
    }

    protected void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int a = sc.nextInt();
        for (int i = 2; i <= a / 2; ++i) {
            if (a % i == 0) {
                System.out.println(a + " is a prime number.");
            } else {
                System.out.println(a + " is not a prime number.");
            }
        }
    }
}
