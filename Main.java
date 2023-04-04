public class Main {
  public static void main(String[] args) {
    // int a=5;
    // int b= 4;
    // int m = Math.max(a, b);
    // int min = Math.min(a,b);
    // System.out.println(m + min);
    // int r = new java.util.Random().nextInt(10);
    // System.out.println(r);
    // String s = new java.util.Scanner(System.in).nextLine();
    // int i = new java.util.Scanner(System.in).nextInt();
    // System.out.println("ようこそ占いの館へ");
    // System.out.println("あなたの名前を入力してください");
    // String name = new java.util.Scanner(System.in).nextLine();
    // System.out.println("年齢を入力してください");
    // String ageString = new java.util.Scanner(System.in).nextLine();
    // int age = Integer.parseInt(ageString);
    // int fortune = new java.util.Random().nextInt(3);
    // fortune++;
    // System.out.println("占いの結果が出ました");
    // System.out.println(age + "歳の" + name + "さん、あなたの運記番号は" + fortune +"です");
    // System.out.println("1:2:3:4");
    int fortune = new java.util.Random().nextInt(3);
    fortune++;
    switch (fortune) {
      case 1:
          System.out.println(fortune);
          break;
      case 2:
          System.out.println(fortune);
          break;
      case 3:
          System.out.println(fortune);
          break;
      default:
          System.out.println(fortune);
    }
    }
}