public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.name = "minato";
    h.hp = 100;
    System.out.println(h.name + "を呼びだした");
    h.sit(5);
    Matango m = new Matango();
    m.hp = 50;
    m.suffix = 'A';
    m.run();
    Cleric c = new Cleric();
    c.name = "A";
    c.hp = 50;
    c.mp = 5;
    c.pray(1);
  }
}