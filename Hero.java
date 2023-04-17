public class Hero {
  String name;
  int hp;
  Sword sword;
  final int LEVEL = 10;
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した");
  }
  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + sec + "は座った");
    System.out.println("HPが" + sec + "回復した");
  }
  public Hero() {
    this.hp = 100;
    this.name = "義彦";
  }
}