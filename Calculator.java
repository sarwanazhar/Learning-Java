import java.util.Scanner;

/**
 * Main
 */
public class Calculator {

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("\n \n Welcome to the calculator \n");
    System.out.println("Enter 2 numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("\n 1 for + \n 2 for * \n 3 for remainder \n 4 for division \n");
    int operator = sc.nextInt();
    int total;

    switch (operator) {
      case 1:
        total = a+b;
        System.out.println(total);
        break;

      case 2:
        total = a*b;
        System.out.println(total);
        break;

      case 3:
        total = a%b;
        System.out.println(total);
        break;
      
      case 4:
       total = a/b;
       System.out.println(total);
       break;
    
      default:
        System.out.println("Invalid operator");
        break;
    }


  }
}