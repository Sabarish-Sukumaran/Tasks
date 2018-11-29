package Tasks;
import java.util.Scanner;
public class Prime_Or_Not
{
    Scanner sc = new Scanner(System.in);
    private void sum()
    {
        {
            System.out.print("Please enter a number:");
            int a = sc.nextInt();
            System.out.print("Please enter a number:");
            int b = sc.nextInt();
            int c;
            c = a + b;
            System.out.printf("The sum is:%d",+c);
        }
    }
    private void prime()
    {
        System.out.print("Please enter a number:");
        int c = sc.nextInt();
         if (c%2!= 0)
            {
                System.out.println(c + " is a prime number.");
            }
            else
                {
                System.out.println(c + " is not a prime number.");
                }
        }
    public static void main(String[] args)
    {
        Prime_Or_Not p = new Prime_Or_Not();
        p.prime();
        p.sum();
    }
}