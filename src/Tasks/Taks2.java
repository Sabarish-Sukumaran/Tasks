package Tasks;
import java.util.Scanner;
public class Taks2
{
     public static void main(String[] args)
     {
         new Taks2().option();
     }
      private void option()
      {
         System.out.println("1 = Fibonacci \n 2 = Prime or not \n 3 = Odd or Even");
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter a number of your choice:");
         int a= sc.nextInt();
         switch(a)
         {
             case 1:
             {
                 Scanner s = new Scanner (System.in);
                 System.out.println("Please Specify the Range:");
                 int n=s.nextInt(),d=0,e=1;
                 for(int j=0;j<=n;j++)
                 {
                     System.out.print( d + " ");
                     int sum=a+e;
                     d=e;
                     e=sum;
                 }
             }
             break;
             case 2:
                 {
                 System.out.print("Please enter a number:");
                 int q = sc.nextInt();
                     if ( q%2!= 0)
                     {
                         System.out.println(q + " is a prime number.");
                     } else
                         {
                         System.out.println(q + " is not a prime number.");
                         }

             }
             break;
             case 3:
             {
                 System.out.print("Please enter a number:");
                 int t=sc.nextInt();
                 if (t%2==0)
                 {
                     System.out.println("This is an even number");
                 }
                 else
                 {
                     System.out.println("This is an odd number");
                 }
             }
             break;
             default:
             {
                 System.out.println("Please Enter a number between 1 to 3:");
                 option();
             }
         }
     }

}

