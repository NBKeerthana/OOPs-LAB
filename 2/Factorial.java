import java.util.Scanner;

public class Factorial
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number to find its factorial:");
    int num = scanner.nextInt();

    int fact = 1;
    int i = 1;

    while (i<=num){
      fact *= i;
      i++;
    }
    System.out.println("Factorial of " + num + " is: " + fact);
  }
}