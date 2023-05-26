package calcapp.main;
import calcapp.logics.CalcLogic;
public class Calc {
  public static void main (String[] args) {
    int a = 10;
    int b = 5;
    // int total = calcapp.logics.CalcLogic.add(a,b);
    int total = CalcLogic.add(a,b);
    // import後はここまで短縮化
    // int delta = calcapp.logics.CalcLogic.decrease(a,b);
    int delta = CalcLogic.decrease(a,b);
    System.out.println("足すと" + total + "引くと" + delta);
  }
}