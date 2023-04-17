public class superHero extends Hero {
  boolean flying;
  public void fly() {
      this.flying = true;
      System.out.println("飛び上がった");
  }
  public void land() {
      this.flying = false;
      System.out.println("着地した");
  }
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は深く眠って回復した");
  }
  public void attack(Matango m) {
    super.attack(m);
    if (this.flying) {
      super.attack(m);
    }
  }
}