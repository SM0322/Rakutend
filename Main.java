public class Main {
  public static void heal(int hp) {
    hp += 10;
  }
  public static void heal(Theif t) {
    t.hp += 10;
  }
  public static void main(String[] args) {
    int baseHp = 25;
    Theif t = new Theif("アサカ", baseHp);
    heal(baseHp);
    System.out.println(baseHp + ":" + t.hp);
    heal(t);
    System.out.println(baseHp + ";" + t.hp);
    Matango m = new Matango('A');
    superHero sh = new superHero();
    sh.fly();
    sh.attack(m);
    sh.sleep();
    poisonMatango pm = new poisonMatango('B');
    pm.attack(sh);
    // Hero h = new Hero();
    // h.sleep();
    // Hero h1 = new Hero("湊");
    // h1.sleep();
    // h.name = "minato";
    // h.hp = 100;
    // System.out.println(h.name + "を呼びだした");
    // h.sit(5);
    // Matango m = new Matango();
    // m.hp = 50;
    // m.suffix = 'A';
    // m.run();
    // Cleric c = new Cleric();
    // c.name = "A";
    // c.hp = 50;
    // c.mp = 5;
    // c.pray(1);
    // Sword s = new Sword();
    // s.name ="炎の剣";
    // s.damage = 10;
    // Hero h1 = new Hero();
    // h1.name = "B";
    // h1.hp = 100;
    // h1.sword = s;
    // System.out.println("現在装備している武器は" + h1.sword.name + "です");
    // c.heal(h1);
  }
}