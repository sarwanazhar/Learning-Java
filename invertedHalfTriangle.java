public class invertedHalfTriangle {

  public static void main(String[] args) {
    int n = 4;

    // outer loop
    for (int i = n; i > 0; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}