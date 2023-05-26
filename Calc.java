public class Calc {
  public static void main (String[] args) {
    int a = 10;
    int b = 5;
    int total = CalcLogic.add(a,b);
    int delta = CalcLogic.decrease(a,b);
    System.out.println("足すと" + total + "引くと" + delta);
  }
}