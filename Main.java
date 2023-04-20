public class Main {
  // public static void heal(int hp) {
  //   hp += 10;
  // }
  // public static void heal(Theif t) {
  //   t.hp += 10;
  // }
  public static void main(String[] args) {
    Bank a1 = new Bank("4649", 1592);
    Bank a2 = new Bank("4649", 2000);
    System.out.println(a1.toString());
    // Empty e = new Empty();
    // String s = e.toString();
    // System.out.println(s);
    // System.out.println(Hero.money);
    // Hero h1 = new Hero("湊");
    // Hero h2 = new Hero("湊");
    if (a1.equals(a2) == true) {
      System.out.println("同じ内容です");
    } else {
      System.out.println("違う内容です");
    }
    String s1 = "スッキリJava";
    String s2 = "Java";
    String s3 = "java";
    if (s2.equals(s3)) {
      System.out.println("s2とs3は等しい");
    }
    if (s2.equalsIgnoreCase(s3)) {
      System.out.println("ケースを区別しなければs2とs3は等しい");
    }
    System.out.println("s1の長さは" + s1.length() + "です");
    if (s1.isEmpty()) {
      System.out.println("s1は空文字です");
    }
    if (s1.contains("Java")) {
      System.out.println("文字列はJavaを含んでいます");
    }
    if (s1.endsWith("Java")) {
      System.out.println("文字列はJavaが末尾にあります");
    }
    System.out.println("文字列で最初にJavaが搭乗する位置は" + s1.indexOf("Java"));
    System.out.println("文字列で最後にJavaが搭乗する位置は" + s1.lastIndexOf("Java"));
    String s4 = "Java programing";
    System.out.println("文字列の4文字目以降は" + s4.substring(3));
    System.out.println("文字列の４＝８文字目は" + s4.substring(3, 8));
    // h2.money += 5000;
    // System.out.println(Hero.money);
    // X obj = new A();
    // obj.a();
    // // obj.b(); Xという箱ではaのアクションしかないから
    // Y y1 = new A();
    // Y y2 = new B();
    // y1.a();
    // y2.a();
    // Y[] array = new Y[2];
    // array[0] = new A();
    // array[1] = new B();
    // for (int i = 0; i < array.length; i++) {
    //   System.out.println(array[i]);
    // }
    // Hero h = new Hero();
    // h.die();
    // King k = new King();
    // k.talk(h);
    // int baseHp = 25;
    // Theif t = new Theif("アサカ", baseHp);
    // heal(baseHp);
    // System.out.println(baseHp + ":" + t.hp);
    // heal(t);
    // System.out.println(baseHp + ";" + t.hp);
    // Matango m = new Matango('A');
    // superHero sh = new superHero();
    // sh.fly();
    // sh.attack(m);
    // sh.sleep();
    // poisonMatango pm = new poisonMatango('B');
    // // pm.attack(sh);
    // Hero h = new Hero();
    // h.attack(m);
    // Character c = new Hero();
    // System.out.println(c.name);
    // c.sleep();
    // Character c = new Character();
    // pm.attack(h);
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