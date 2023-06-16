// Exrecise 2
public class two {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    String op = args[args.length - 1];
    Arithmetic(x, y, op);
  }

  public static void Arithmetic(int x, int y, String op) {
    if (op.equals("+"))
      System.out.println(x + " " + op + " " + y + " = " + (x + y));
    else if (op.equals("-"))
      System.out.println(x + " " + op + " " + y + " = " + (x - y));
    else if (op.equals("*"))
      System.out.println(x + " " + op + " " + y + " = " + (x * y));
    else if (op.equals("/"))
      System.out.println(x + " " + op + " " + y + " = " + (x / y));
    else
      System.out.println("Invalid Operation");
  }
}