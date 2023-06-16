public class five {

  public static void main(String[] args) {
    int[][] a = new int[][]{
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                          };
    int[][] b = new int[][]{
                            {2, 7, 6},
                            {9, 5, 1},
                            {4, 3, 8}
                          };
    System.out.println(checkMagicSquare(a));
    System.out.println(checkMagicSquare(b));
  }

  private static String checkMagicSquare(int[][] a) {
    int[] row = new int[a.length];
    int[] col = new int[a.length];
    int diag1 = 0;
    int diag2 = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        row[i] += a[j][i];
        col[i] += a[i][j];
        if (i == j) {
          diag1 += a[i][j];
        }
        if (i == a.length - 1 - j) {
          diag2 += a[i][j];
        }
      }
    }
    boolean f1 = true;
    boolean f2 = true;
    boolean f3 = diag1 == diag2;
    for (int i = 0; i <= row.length / 2 && f1; i++) {
      f1 = row[i] == row[row.length - 1 - i];
    }
    for (int i = 0; i <= col.length / 2 && f2; i++) {
      f2 = col[i] == col[col.length - 1 - i];
    }
    if (f1 && f2 && f3) {
      return "This is a magic square with sum " + diag1;
    } else {
      return "This is not a magic square";
    }
  }
}
