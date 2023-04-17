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
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃!");
    m.hp -= 5;
    System.out.println("5ポイントのダメージ！");
  }
  public Hero(String name) {
    this.name = name;
    this.hp = 100;
  }
  public Hero() {
    this("ダミー");
    // this.hp = 100;
    // this.name = "義彦";
  }
}