package Tasks;
import java.util.Scanner;
 class Task7
{
    private static Scanner sc = new Scanner(System.in);
    void sum()
     {
        System.out.println("Please enter a number:");
        int a= sc.nextInt();
        System.out.println("Please enter a number:");
        int b= sc.nextInt();
        int c= a*b;
        System.out.println("The multiplication result is:" + c);
    }
}
class knowledge extends Task7
{
 public static void main (String [] args)
  {
      System.out.println("Hello Inheritance");
      knowledge k = new knowledge();
      k.sum();
  }
}