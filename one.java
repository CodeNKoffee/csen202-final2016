// Exercise 1
public class one {
  public static void main(String[] args) {
    System.out.println(majority(true, true, true));
    System.out.println(majority(true, true, false));
    System.out.println(majority(true, false, false));
    System.out.println(majority(false, false, false));
    numbers();
    newArr();
    
  }

  // A
  public static boolean majority(boolean x, boolean y, boolean z) {
    int count = 0;
    if (x) count++;
    if (y) count++;
    if (z) count++;
    return count >= 2;
  }

  // B
  public static void numbers() {
    int n = 10;
    for (int i = 0; i < n; i++) {
      for (int j = 0; (j < n) && (j != i); j++) {
        System.out.println(i + "-" + j);
      }
    }
  }

  // C
  public static void newArr() {
    int[] a = { 1, 6, 5, 3, 0, 2, 4 };
    int n = a.length;
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
        b[a[i]] = i;
    }

    System.out.println("Array b:");
    for (int i = 0; i < n; i++) {
        System.out.println("b[" + i + "] = " + b[i]);
    }

    System.out.println();
    
    int[] c = new int[n];
    for (int i = 0; i < n; i++) {
        c[i] = a[b[i]];
    }

    System.out.println("Array c:");
    for (int i = 0; i < n; i++) {
        System.out.println("c[" + i + "] = " + c[i]);
    }
}

}