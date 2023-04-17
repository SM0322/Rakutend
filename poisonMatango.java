public class poisonMatango extends Matango {
  int poisonCount = 5;
  public void attack(Hero h) {
    super.attack(h);
    if (this.poisonCount > 0) {
      System.out.println("さらに毒の胞子をばらまいた!");
      int damage = h.hp / 5;
      h.hp -= damage;
      this.poisonCount--;
      System.out.println(damage + "ポイントのダメージ!");
    }
  }
  public poisonMatango(char suffix) {
    super(suffix);
  }
}