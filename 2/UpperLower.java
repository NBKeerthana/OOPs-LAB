import java.util.Scanner;

public class UpperLower{
  public static void main(String[] args)
  {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter start value: ");
     int sum = scanner.nextInt();

     System.out.print("Enter stop value: ");
     int n = scanner.nextInt();


     for (int i = sum + 1; i<=n; ++i)
     {
       sum+=i;
     }
     System.out.println("Sum = " + sum);
  }
}