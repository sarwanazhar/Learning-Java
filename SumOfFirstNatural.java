import java.util.*;;

public class SumOfFirstNatural {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int temp = 0;
    for (int i = 1; i <= n; i++) {
      temp = i + temp;
    }
    System.out.println("The number is: ");
    System.out.println(temp);

  }
}
