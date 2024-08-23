public class halfTriangle {

  public static void main(String args[]) {
    int n = 5;

    // outer loop
    for (int i = 1; i <= n; i++) {
      // inner loop
      for (int j = 1; j <= n; j++) {
        if (j <= i) {
          System.out.print("*");
        }else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
