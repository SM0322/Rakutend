public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.name = "minato";
    h.hp = 100;
    System.out.println(h.name + "を呼びだした");
    h.sit(5);
  }
}