package calcapp.main;
public class Calc {
  public static void main (String[] args) {
    int a = 10;
    int b = 5;
    int total = calcapp.logics.CalcLogic.add(a,b);
    int delta = calcapp.logics.CalcLogic.decrease(a,b);
    System.out.println("足すと" + total + "引くと" + delta);
  }
}