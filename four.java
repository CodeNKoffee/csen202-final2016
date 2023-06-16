// Exercise
public class four {
  public static void main(String[] args) {
    int[] a = {1,2,3,4};
    int[] b = {5,0,2};
    int[] c = {6,6};
    System.out.println(minRec(a));
    System.out.println(minRec(b));
    System.out.println(minRec(c));
  }

  public static int minRec(int[] a) {
    return isHelper(a, 0, a[0]);
  }

  public static int isHelper(int[] a, int index, int min) {
    if (index == a.length) return min;
    else {
      if (a[index] < min) {
        min = a[index];
      }
      return isHelper(a, ++index, min);
    }
  }
}