public class halfTriangle {

  public static void main(String args[]) {
    int n = 4;

    // outer loop
    for (int i = 1; i <= n; i++) {
      // inner loop
      for (int j = 1; j <= n; j++) {
        if (j <= i) {
          System.out.print("*");
        }else {
          System.out.print("");
        }
      }
      System.out.println();
    }

    System.out.println("\n\n");
    // Another way of doing it this was the way in solution
    for (int i = 1; i <= n; i++) {
      // inner loop
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}
