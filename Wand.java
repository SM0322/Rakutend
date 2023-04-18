public class Wand {
  private String name;
  public void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException("名前がnull");
    }
    if (name.length() < 3) {
      throw new IllegalArgumentException("名前が3文字以下");
    }
    this.name = name;
  }
  private double power;
  public double getPower() {
    return this.power;
  }
  public void setPower(double power) {
    if (power < 0.5 || power > 100) {
      throw new IllegalArgumentException("増幅率は0.5以上100未満");
    }
    this.power = power;
  }
}