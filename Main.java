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
    // int num = new java.util.Random().nextInt(100);
    // num++;
    // if ((num % 3 == 0) && (num % 5 == 0)) {
    //   System.out.println("FizzBazz");
    //   System.out.println(num);
    // } else if (num % 3 == 0) {
    //   System.out.println("Fizz");
    //   System.out.println(num);
    // } else if (num % 5 == 0) {
    //   System.out.println("Bazz");
    //   System.out.println(num);
    // } else {
    //   System.out.println(num);
    // }
    // for (int i = 1; i <= 100; i++) {
    //   if ((i % 3 == 0) && (i % 5 == 0)) {
    //     System.out.println("FizzBazz");
    //     // System.out.println(i);
    //   } else if (i % 3 == 0) {
    //     System.out.println("Fizz");
    //     // System.out.println(i);
    //   } else if (i % 5 == 0) {
    //     System.out.println("Bazz");
    //     // System.out.println(i);
    //   } else {
    //     System.out.println(i);
    //   }
    // }
    // for (int i = 1;i <= 100; i++) {
    //   if ((i % 3 == 0) && (i % 5 == 0)) {
    //     System.out.println("FizzBazz");
    //     // System.out.println(i);
    //   } else if ((i % 3 == 0) | (Integer.toString(i).contains("3"))) {
    //     System.out.println("Fizz");
    //     // System.out.println(i);
    //   } else if ((i % 5 == 0) | (Integer.toString(i).contains("5"))) {
    //     System.out.println("Bazz");
    //     // System.out.println(i);
    //   } else {
    //     System.out.println(i);
    //   }
    // }
    // public static void main(String[] args)
    // String name = new java.util.Scanner(System.in).nextLine();
    // if (name.equals("湊")) {
    //   System.out.println(name);
    // } else {
    //   System.out.println("違います");
    // }
    // int isHungry = 1;
    // String food = "カレー";
    // System.out.println("こんにちは");
    // if (isHungry == 0) {
    //   System.out.println("おなかがいっぱいです");
    // } else {
    //   System.out.println("腹ペコです");
    //   System.out.println(food + "をいただきます");
    //   System.out.println("ごちそうさまでした");
    // }
    // System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更");
    // int selected = new java.util.Scanner(System.in).nextInt();
    // switch (selected) {
    //   case 1:
    //     System.out.println("検索します");
    //     break;
    //   case 2:
    //     System.out.println("登録します");
    //     break;
    //   case 3:
    //     System.out.println("削除します");
    //     break;
    //   case 4:
    //     System.out.println("変更します");
    //     break;
    // }
    // System.out.println("数当てゲーム");
    // int ans = new java.util.Random().nextInt(10);
    // for (int i = 0; i < 5; i++) {
    //   System.out.println("0~9の数字を入力してください");
    //   int num = new java.util.Scanner(System.in).nextInt();
    //   if (ans == num) {
    //     System.out.println("アタリ");
    //     break;
    //   } else {
    //     System.out.println("違います");
    //   }
    // }
    // System.out.println("ゲームを終了します");
    // int[] scores = {20,30,40,50,60};
    // int sum = 0;
    // for (int i = 0; i < scores.length; i++) {
    //   System.out.println(scores[i]);
    //   sum += scores[i];
    //   System.out.println(sum);
    // }
    // int[] seq = new int[10];
    // for (int i = 0; i < seq.length; i++) {
    //   seq[i] = new java.util.Random().nextInt(4);
    // }
    // for (int i = 0; i < seq.length; i++) {
    //   switch(seq[i]) {
    //     case 0:
    //       System.out.println("A");
    //       break;
    //     case 1:
    //       System.out.println("C");
    //       break;
    //     case 2:
    //       System.out.println("T");
    //       break;
    //     case 3:
    //       System.out.println("G");
    //       break;
    //   }
    // }
    int[] scores = {20,30,40,50,60};
    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]);
    }
    for (int value : scores) {
      System.out.println(value);
    }
    int[] arrayA = {1,2,3};
    int[] arrayB;
    arrayB = arrayA;
    arrayB[0] = 100;
    System.out.println(arrayA[0]);
    // boolean judge = true;
    // if (judge == true) {
    //   int[] array = {1,2,3};
    //   array = null;
    //   array[0] =10;
    // }
    int[] [] scoresA = {{20,30,40}, {50,60,70}};
    System.out.println(scoresA.length);
    System.out.println(scoresA[0] [0]);
    System.out.println(scoresA[0].length);
  }
}