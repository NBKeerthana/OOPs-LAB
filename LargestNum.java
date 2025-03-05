import java.util.Scanner;

public class LargestNum
{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a: ");
    int a = scanner.nextInt();
    System.out.print("Enter b: ");
    int b = scanner.nextInt();
    System.out.print("Enter c: ");
    int c = scanner.nextInt();

    if (a>b && a>c){
      System.out.println(a+" is greatest!");
    } else if (b>a && b>c){
      System.out.println(b+" is greatest!");
    }else if (c>a && c>b){
      System.out.println(c+" is greatest!");
    }else{
      System.out.println("Two or more elements are equal!");
    }
  }
}