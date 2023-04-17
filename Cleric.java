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
}