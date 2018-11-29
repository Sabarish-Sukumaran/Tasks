package Tasks;
import java.util.Scanner;
public class Odd_or_Even {
public static void main (String [] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a number:");
    int a=sc.nextInt();
        if (a%2==0)
        {
            System.out.println("This is an even number");
        }
        else
        {
            System.out.println("This is an odd number");
        }
    }
}

