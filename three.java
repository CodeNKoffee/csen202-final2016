// Exercise 3
public class three {
  public static void main(String[] args) {
    int p = Integer.parseInt(args[0]);
    int q = Integer.parseInt(args[1]);
    System.out.println(gcf(p, q));
  }

  public static int gcf(int p, int q) {
    // Base Case
    if (p == q) return p;

    // Call GCF with smaller and abs (difference)
    int smaller = Math.min(p, q);
    int difference = Math.abs(p - q);
    return gcf(smaller, difference);
  }
}