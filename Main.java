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
    // int fortune = new java.util.Random().nextInt(3);
    // fortune++;
    // switch (fortune) {
    //   case 1:
    //       System.out.println(fortune);
    //       break;
    //   case 2:
    //       System.out.println(fortune);
    //       break;
    //   case 3:
    //       System.out.println(fortune);
    //       break;
    //   default:
    //       System.out.println(fortune);
    // }
    // for (int i = 0; i < 10; i++) {
    //   System.out.println(i);
    // }
    int num = new java.util.Random().nextInt(100);
    num++;
    if ((num % 3 == 0) && (num % 5 == 0)) {
      System.out.println("FizzBazz");
      System.out.println(num);
    } else if (num % 3 == 0) {
      System.out.println("Fizz");
      System.out.println(num);
    } else if (num % 5 == 0) {
      System.out.println("Bazz");
      System.out.println(num);
    } else {
      System.out.println(num);
    }
    for (int i = 1; i <= 100; i++) {
      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println("FizzBazz");
        // System.out.println(i);
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
        // System.out.println(i);
      } else if (i % 5 == 0) {
        System.out.println("Bazz");
        // System.out.println(i);
      } else {
        System.out.println(i);
      }
    }
    for (int i = 1;i <= 100; i++) {
      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println("FizzBazz");
        // System.out.println(i);
      } else if ((i % 3 == 0) | (Integer.toString(i).contains("3"))) {
        System.out.println("Fizz");
        // System.out.println(i);
      } else if ((i % 5 == 0) | (Integer.toString(i).contains("5"))) {
        System.out.println("Bazz");
        // System.out.println(i);
      } else {
        System.out.println(i);
      }
    }
  }
}