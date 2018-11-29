package Tasks;

import java.util.Scanner;

public class Task6 {
    static
    {
        System.out.println("Hi this is a static block");
    }
        public static void main (String[]args)
        {
            Task6 t = new Task6();
            t.prime();
        }
        private void prime ()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number:");
            int a = sc.nextInt();
            {
                if (a % 2 != 0)
                {
                    System.out.println(a + " is a prime number.");
                }
                else
                    {
                    System.out.println(a + " is not a prime number.");
                    }
            }
        }

    }