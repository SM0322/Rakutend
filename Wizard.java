public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;
  public void heal(Hero h) {
    int basePoint = 10;
    int recoverPoint = (int)(basePoint * this.wand.getPower());
    h.setHp(h.getHp() + recoverPoint);
    System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した!");
  }
  public void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException("名前がnull");
    }
    if (name.length() < 3) {
      throw new IllegalArgumentException("名前が3文字以下");
    }
    this.name = name;
  }
  public void setHp(int hp) {
    if (hp < 0) {
      throw new IllegalArgumentException("HPは０以上");
      this.hp = 0;
    } else {
      this.hp = hp;
    }
  }
  public void setMp(int mp) {
    if (mp < 0) {
      throw new IllegalArgumentException("MPは０以上");
    }
    this.mp = mp;
  }
  public void setWand(Wand wand) {
    if (wand == null) {
      throw new IllegalArgumentException("杖を装備してください");
    }
    this.wand = wand;
  }
}