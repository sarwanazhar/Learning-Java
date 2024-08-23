import java.util.Scanner;

public class EvenNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number you want to check if it's even or not: ");
    int n = sc.nextInt();

    if (n % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }

    System.out.print("Do you want the even numbers from 0 to the number you provided (y/n): ");
    String ans = sc.next();

    if (ans.equals("y")) {  // Use .equals() to compare strings
      System.out.println("\nHere are the even numbers between 0 and " + n + ":");

      for (int i = 1; i <= n; i++) {  
        if (i % 2 == 0) {
          System.out.println(i);
        }
      }
    } else {
      System.out.println("Bye");
    }
  }
}
