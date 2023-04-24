public class Hero extends Character {
  private String name;
  private int hp;
  Sword sword;
  private static int money;
  // staticをつけることでそのクラスに対して1つのみ存在し共有したいときに使う"
  
  final int LEVEL = 10;
  public String getName() {
    return this.name;
  }
  public int getHp() {
    return this.hp;
  }
  public int getGold() {
    return this.money;
  }
  public void setHp(int hp) {
    this. hp = hp;
  }
  void die() {
    System.out.println(this.name + "は死んでしまった");
    System.out.println("GAME OVER");
  }
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
  public String toString() {
    return "名前：" + this.name + "/HP:" + this.hp;
  }
  public boolean equals(Object o) {
    if (this == o) {return true;}
    if (o instanceof Hero) {
      Hero h = (Hero)o;
      if (this.name.equals(h.name)) {
        return true;
      }
    }
    return false;
  }
  public static void setRandomMoney() {
    int a = new java.util.Random().nextInt(10);
    a ++;
    Hero.money = (int)(a * 1000);
  }
  public Hero(String name) {
    this.name = name;
    this.hp = 100;
  }
  public Hero() {
    this("ダミー");
    System.out.println("Hero");
    // this.hp = 100;
    // this.name = "義彦";
  }
}