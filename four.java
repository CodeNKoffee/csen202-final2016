// Exercise
public class four {
  public static void main(String[] args) {
    int[] a = {1,2,3,4};
    int[] b = {5,2};
    int[] c = {6,6};
    System.out.println(minRec(a));
    System.out.println(minRec(b));
    System.out.println(minRec(c));
  }

  public static int minRec(int[] a) {
    return isHelper(a, 0, Integer.MAX_VALUE);
  }

  public static int isHelper(int[] a, int index, int min) {
    if (index == a.length) return min;
    else {
      if (a[index] < min) return isHelper(a, ++index, a[index]);
    }
    return min;
  }
}