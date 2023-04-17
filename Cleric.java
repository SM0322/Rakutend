public class Cleric {
  String name;
  int hp;
  final int MAXHP = 50;
  int mp;
  final int MAXMP =10;
  public void selfAid() {
    this.hp = MAXHP;
    this.mp -= 5;
    System.out.println(this.name + "はセルフエイドを唱えた!");
    System.out.println(this.hp + "は最大まで回復した!");
  }
  public int pray(int sec) {
    int r = new java.util.Random().nextInt(3);
    int recoveryPoint = 3 + r;
    int recoverActual = Math.min(this.MAXMP - this.mp, recoveryPoint);
    System.out.println(recoverActual + "回復した！");
    return recoverActual;
  }
  public void heal(Hero h) {
    h.hp += 10;
    System.out.println(this.name + "は" + h.name + "のHPを回復した");
  }
}