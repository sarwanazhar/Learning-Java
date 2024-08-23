public class HollowRectangle {

  public static void main(String[] args) {
    int row = 5;
    int col = 7;


    // did this first try without seeing solution XD
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= col; j++) {
        if (j == 1 | i == 1 | j == col | i == row) {
          System.out.print("*");
        }else{
         System.out.print(" "); 
        }
      }
      System.out.println();
    }

  }
}
