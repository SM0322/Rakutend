// // import java.util.Date;
// // import java.util.Calendar;
// // import java.text.SimpleDateFormat;
// // import java.time.*;
// // import java.time.format.DateTimeFormatter;
// // import java.util.ArrayList;
// // import java.util.*;
// // import java.util.HashSet;
// // import java.util.Set;
// // import java.util.TreeSet;
// // import java.io.*;
// // public class Main {
// //   public static void main(String[] args) throws Exception {
// //     // FileReader fr = new FileReader("Rakuten/deta.txt");
// //     // int input = fr.read();
// //     // while (input != -1) {
// //     //   System.out.print((char)input);
// //     //   input = fr.read();
// //     // }
// //     // fr.close();
// //     FileWriter fw = new FileWriter("deta.txt");
// //     fw.write("そ");
// //     fw.close();
// //     // Person p = new Person();
// //     // p.setAge(-128);
// //     // System.out.println("プログラムが起動しました");
// //     // throw new IOException();
// //     // try {
// //     //   int i = Integer.parseInt("三");
// //     // } catch (NumberFormatException e) {
// //     //   System.out.println("NumberFormatException例外をcatchしました。");
// //     // }
// //     // try {
// //     //   String s = null;
// //     //   System.out.println(s.length());
// //     // } catch (NullPointerException e) {
// //     //   System.out.println("NullPointerException例外をcatchしました");
// //     //   System.out.println("--スタックトレース(ここから)--");
// //     //   e.printStackTrace();
// //     //   System.out.println("--スタックトレース(ここまで)--");
// //     // }
// //     // try {
// //     //   throw new UnsupportedMusicFileException
// //     //     ("未対応のファイルです");
// //     // } catch (Exception e) {
// //     //   e.printStackTrace();
// //     // }
// //     // try (FileWriter fw = new FileWriter("deta.txt");){
      
// //     //   System.out.println(fw.name);
// //     //   fw.write("hello");
// //     // } 
// //     // // catch (NullPointerException e) {
// //     // //   System.out.println("エラー:" + e.getMessage());
// //     //   catch(Exception e) {
// //     //   System.out.println("エラー:" + e.getMessage());
// //     // // } finally {
// //     // //   try {
// //     // //     System.out.println(fw.name);
// //     // //   } catch(IOException e) {
// //     // //     ;
// //     // //   }
// //     // //   // fw.close();
// //     // }
// //     // Set<String> colors = new HashSet<String>();
// //     // colors.add("赤");
// //     // colors.add("黄");
// //     // colors.add("青");
// //     // colors.add("赤");
// //     // System.out.println("色は" + colors.size() + "種類");
// //     // for (String s : colors) {
// //     //   System.out.print(s + "→");
// //     // }
// //     // Set<String> words = new TreeSet<String>();
// //     // words.add("赤");
// //     // words.add("黄");
// //     // words.add("青");
// //     // System.out.println("色は" + words.size() + "種類");
// //     // for (String s : words) {
// //     //   System.out.print(s + "→");
// //     // }
// //     // Map<String, Integer> prefs = new HashMap<String, Integer>();
// //     // prefs.put("京都府", 255);
// //     // prefs.put("東京都", 1261);
// //     // prefs.put("熊本県", 181);
// //     // int tokyo = prefs.get("東京都");
// //     // System.out.println("東京都の人口は" + tokyo);
// //     // // prefs.remove("京都府");
// //     // prefs.put("熊本県", 182);
// //     // System.out.println("熊本県の人口は" + prefs.get("熊本県"));
// //     // for (String key : prefs.keySet()) {
// //     //   int value = prefs.get(key);
// //     //   System.out.println(key + "の人口は" + value);
// //     // }
// //     // // Hero h = new Hero("ミナト");
// //     // List<Hero> list = new ArrayList<Hero>();
// //     // list.add(h);
// //     // System.out.println(list.get(0).name);
// //     // h.name = "菅原";
// //     // System.out.println(list.get(0).name);
// //     // Hero h1 = new Hero("斎藤");
// //     // Hero h2 = new Hero("鈴木");
// //     // List<Hero> heros = new ArrayList<Hero>();
// //     // heros.add(h1);
// //     // heros.add(h2);
// //     // for (Hero h : heros) {
// //     //   System.out.println(h.getName());
// //     // }
// //     // System.out.println(h1.money);
// //     // Map<Hero, Integer> heros = new HashMap<Hero, Integer>();
// //     // heros.put(h1, 3);
// //     // heros.put(h2, 7);
// //     // for (Hero key : heros.keySet()) {
// //     //   int value = heros.get(key);
// //     //   System.out.println(key.getName() + "が倒した敵=" + value);
// //     // }
// //   }
// //   // public static void subsub() throws IOException {
// //   //   FileWriter fw = new FileWriter("deta.txt");
// //   // }
// //   //   ArrayList<String> names = new ArrayList<String>();
// //   //   names.add("たなか");
// //   //   names.add("すずき");
// //   //   names.add("さいとう");
// //   //   Iterator<String> it = names.iterator();
// //   //   while (it.hasNext()) {
// //   //     String e = it.next();
// //   //     System.out.println(e);
// //   //   }
// //     // System.out.println(names.get(1));
// //     // for (int i = 0; i < names.size(); i++) {
// //     //   System.out.println(names.get(i));
// //     // }
// //     // for (String s : names) {
// //     //   System.out.println(s);
// //     // }
// //     // ArrayList<Integer> points = new ArrayList<Integer>();
// //     // points.add(10);
// //     // points.add(80);
// //     // points.add(75);
// //     // for (int i : points) {
// //     //   System.out.println(i);
// //     // }
// //     // points.add(1,20);
// //     // for (int i : points) {
// //     //   System.out.println(i);
// //     // }
// //     // points.set(1,30);
// //     // for (int i : points) {
// //     //   System.out.println(i);
// //     // }
// //     // Date now = new Date();
// //     // Calendar c = Calendar.getInstance();
// //     // c.setTime(now);
// //     // int day = c.get(Calendar.DAY_OF_MONTH);
// //     // day += 100;
// //     // c.set(Calendar.DAY_OF_MONTH, day);
// //     // Date future = c.getTime();
// //     // SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
// //     // System.out.println(f.format(future));
    
// //     // LocalDate now = LocalDate.now();
// //     // LocalDate future = now.plusDays(100);
// //     // DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
// //     // System.out.println(future.format(fmt));
// //     // isValidPlayerName("宮迫信之介");
// //     // Bank a1 = new Bank("4649", 1592);
// //     // Bank a2 = new Bank("4649", 2000);
// //     // System.out.println(a1.toString());
// //     // Empty e = new Empty();
// //     // String s = e.toString();
// //     // System.out.println(s);
// //     // System.out.println(Hero.money);
// //     // Hero h1 = new Hero("湊1");
// //     // Hero h2 = new Hero("湊2tehbsrthnsrty");
// //     // System.out.println(isValidPlayerName(h1.name));
// //     // String s = "abc,def:ghi";
// //     // String[] words = s.split("[,:]");
// //     // for (String w : words) {
// //     //   System.out.println(w + "->");
// //     // }
// //     // final String FORMAT = "%-9s %-13s 所持金%,6d";
// //     // String s1 = String.format(FORMAT, h1.getName(), h1.getHp(), h1.getGold());
// //     // System.out.println(s1);
// //     // String s2 = String.format(FORMAT, h2.getName(), h2.getHp(), h2.getGold());
// //     // System.out.println(s2);
// //     // long start = System.currentTimeMillis();
// //     // long end = System.currentTimeMillis();
// //     // System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒でした");
// //     // Date now = new Date();
// //     // System.out.println(now);
// //     // System.out.println(now.getTime());
// //     // Date past = new Date(1600705425827L);
// //     // System.out.println(past);
// //     // Calendar c = Calendar.getInstance();
// //     // c.set(2023,4,20,16,8,30);
// //     // c.set(Calendar.MONTH, 9);
// //     // Date d = c.getTime();
// //     // System.out.println(d);
// //     // c.setTime(now);
// //     // int y = c.get(Calendar.YEAR);
// //     // System.out.println("今年は" + y + "年です");
// //     // SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
// //     // Date d = f.parse("2020/09/22 01:23:45");
// //     // System.out.println(d);
// //     // Date now = new Date();
// //     // String s = f.format(now);
// //     // System.out.println("現在は" + s + "です");
// //     // Instant i1 = Instant.now();
// //     // Instant i2 = Instant.ofEpochMilli(1600705425827L);
// //     // long l = i2.toEpochMilli();
// //     // ZonedDateTime z1 = ZonedDateTime.now();
// //     // ZonedDateTime z2 = ZonedDateTime.of(2020, 1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));
// //     // Instant i3 = z2.toInstant();
// //     // ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
// //     // System.out.println("東京" + z2.getYear() + z2.getDayOfMonth());
// //     // System.out.println("ロンドン" + z3.getMonth() + z3.getDayOfMonth());
// //     // if (z2.isEqual(z3)) {
// //     //   System.out.println("これらは同じ時間を指しています");
// //     // }
// //     // // Hero h2 = new Hero("湊");
// //     // if (a1.equals(a2) == true) {
// //     //   System.out.println("同じ内容です");
// //     // } else {
// //     //   System.out.println("違う内容です");
// //     // }
// //     // String s1 = "スッキリJava";
// //     // String s2 = "Java";
// //     // String s3 = "java";
// //     // if (s2.equals(s3)) {
// //     //   System.out.println("s2とs3は等しい");
// //     // }
// //     // if (s2.equalsIgnoreCase(s3)) {
// //     //   System.out.println("ケースを区別しなければs2とs3は等しい");
// //     // }
// //     // System.out.println("s1の長さは" + s1.length() + "です");
// //     // if (s1.isEmpty()) {
// //     //   System.out.println("s1は空文字です");
// //     // }
// //     // if (s1.contains("Java")) {
// //     //   System.out.println("文字列はJavaを含んでいます");
// //     // }
// //     // if (s1.endsWith("Java")) {
// //     //   System.out.println("文字列はJavaが末尾にあります");
// //     // }
// //     // System.out.println("文字列で最初にJavaが搭乗する位置は" + s1.indexOf("Java"));
// //     // System.out.println("文字列で最後にJavaが搭乗する位置は" + s1.lastIndexOf("Java"));
// //     // String s4 = "Java programing";
// //     // System.out.println("文字列の4文字目以降は" + s4.substring(3));
// //     // System.out.println("文字列の４＝８文字目は" + s4.substring(3, 8));
// //     // StringBuilder sb = new StringBuilder();
// //     // for (int i = 0; i < 100; i++) {
// //     //   sb.append(i+1).append(",");
// //     // }
// //     // String s = sb.toString();
// //     // String[] a = s.split(",");
// //     // System.out.println(s);
// //     // System.out.println(a);
// //     // String s = sb.toString();
// //     // h2.money += 5000;
// //     // System.out.println(Hero.money);
// //     // X obj = new A();
// //     // obj.a();
// //     // // obj.b(); Xという箱ではaのアクションしかないから
// //     // Y y1 = new A();
// //     // Y y2 = new B();
// //     // y1.a();
// //     // y2.a();
// //     // Y[] array = new Y[2];
// //     // array[0] = new A();
// //     // array[1] = new B();
// //     // for (int i = 0; i < array.length; i++) {
// //     //   System.out.println(array[i]);
// //     // }
// //     // Hero h = new Hero();
// //     // h.die();
// //     // King k = new King();
// //     // k.talk(h);
// //     // int baseHp = 25;
// //     // Theif t = new Theif("アサカ", baseHp);
// //     // heal(baseHp);
// //     // System.out.println(baseHp + ":" + t.hp);
// //     // heal(t);
// //     // System.out.println(baseHp + ";" + t.hp);
// //     // Matango m = new Matango('A');
// //     // superHero sh = new superHero();
// //     // sh.fly();
// //     // sh.attack(m);
// //     // sh.sleep();
// //     // poisonMatango pm = new poisonMatango('B');
// //     // // pm.attack(sh);
// //     // Hero h = new Hero();
// //     // h.attack(m);
// //     // Character c = new Hero();
// //     // System.out.println(c.name);
// //     // c.sleep();
// //     // Character c = new Character();
// //     // pm.attack(h);
// //     // Hero h = new Hero();
// //     // h.sleep();
// //     // Hero h1 = new Hero("湊");
// //     // h1.sleep();
// //     // h.name = "minato";
// //     // h.hp = 100;
// //     // System.out.println(h.name + "を呼びだした");
// //     // h.sit(5);
// //     // Matango m = new Matango();
// //     // m.hp = 50;
// //     // m.suffix = 'A';
// //     // m.run();
// //     // Cleric c = new Cleric();
// //     // c.name = "A";
// //     // c.hp = 50;
// //     // c.mp = 5;
// //     // c.pray(1);
// //     // Sword s = new Sword();
// //     // s.name ="炎の剣";
// //     // s.damage = 10;
// //     // Hero h1 = new Hero();
// //     // h1.name = "B";
// //     // h1.hp = 100;
// //     // h1.sword = s;
// //     // System.out.println("現在装備している武器は" + h1.sword.name + "です");
// //     // c.heal(h1);
// // }
// import java.awt.FlowLayout;
// import javax.swing.*;
// import java.util.*;
// import java.util.Arrays;
// import java.util.function.*;
// import static java.lang.System.*;
// import java.util.stream.*;
// import java.util.*;
// public class Main {
  
//     // JFrame frame = new JFrame("初めてのGUI");
//     // JLabel label = new JLabel("Hello! World!");
//     // JButton button = new JButton("押してね");
//     // frame.getContentPane().setLayout(new FlowLayout());
//     // frame.getContentPane().add(label);
//     // frame.getContentPane().add(button);
//     // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     // frame.setSize(300, 100);
//     // frame.setVisible(true);
//     // Hero a = new Hero("ミナト");
//     // System.out.println(a);
//     // Hero h1 = new Hero("ミナト");
//     // if (a.equals(h1)) {
//     //   System.out.println("等価である");
//     // } else if (a == h1) {
//     //   System.out.println("等値である");
//     // } else {
//     //   System.out.println("どちらでもない");
//     // }
//     // Hero h2 = h1;
//     // if (h1 == h2) {
//     //   System.out.println("等値である");
//     // } else {
//     //   System.out.println("どちらでもない");
//     // }
//     // Set<Hero> list = new HashSet<>();
//     // Hero h1 = new Hero();
//     // h1.name = "ミナト";
//     // list.add(h1);
//     // System.out.println("要素数" + list.size());
//     // h1 = new Hero();
//     // h1.name = "ミナト";
//     // list.remove(h1);
//     // System.out.println("要素数" + list.size());
//     // int a[] = {1,2,3,4,5};
//     // int[] b = {1,2,3,4,5};
//     // System.out.println("誤った判定" + a.equals(b));
//     // System.out.println("正しい判定" + Arrays.equals(a, b));
//     // List<Account> lists = new ArrayList<>();
//     // Account a1 = new Account();
//     // a1.number = 10;
//     // Account a2 = new Account();
//     // a2.number = 13;
//     // Account a3 = new Account();
//     // a3.number = 9;
//     // Account a4 = new Account();
//     // a4.number = 12;
//     // Account a5 = new Account();
//     // a5.number = 11;
//     // lists.add(a1);
//     // lists.add(a2);
//     // lists.add(a3);
//     // lists.add(a4);
//     // lists.add(a5);
//     // Collections.sort(lists);
//     // System.out.println(lists);
//     // Collections.sort(lists, new ZandakaComparator());
//     // System.out.println(lists);
//     // Hero h1 = new Hero("ミナト");
//     // Hero h2 = h1.clone();
//     // System.out.println(h1);
//     // System.out.println(h2);
//     // List<Book> lists = new ArrayList<>();
//     // Book b1 = new Book("Java入門", "2011/10/07", "スッキリわかる");
//     // Book b2 = new Book("Python入門", "2019/06/11", "カレーが食べたくなる");
//     // Book b3 = new Book("C言語入門", "2018/06/21", "ポインタも自由自在");
//     // lists.add(b1);
//     // lists.add(b2);
//     // lists.add(b3);
//     // Collections.sort(lists, new TitleComparator());
//     // System.out.println(lists);
//     // int r = new java.util.Random().nextInt(9);
//     // r++;
//     // System.out.println(r);
//   public static void prints(Object a,Object b) {
//     for (int i = 0; i < (Integer)b; i++) {
//       System.out.println(a);
//     }
//   }
//   public static void main(String[] args) {
//     // Object s = "こんにちは";
//     // s = new Hero();
//     // Object n = 1;
//     // prints(s, n);
//     // Pocket<Hero> p = new Pocket<>();
//     // // p.put("1192");
//     // // String s1 = p.get();
//     // // System.out.println(s1);
//     // Account a = new Account("1234567", AccountType.FUTSU);
//     // out.println(a.getaccountNo());
//     // out.println(a.getaccountType());
//     // // Outer.Inner ic = new Outer.Inner();
//     // Outer o = new Outer();
//     // // Outer.Inner oi = o.new Inner();
//     // o.OuterMethod();
//     // Pocket<Object> pocket = new Pocket<>();
//     // System.out.println("使い捨てのインスタンスを作りPocketに格納");
//     // pocket.put(new Object() {
//     //   String innerField;
//     //   void innerMethod(){
//     //   }
//     // });
//     // Optional<String> op1 = Optional.ofNullable("ミナト");
//     // Optional<String> op2 = Optional.ofNullable(null);
//     // System.out.println(op1);
//     // System.out.println(op2);
//     // System.out.println(op1.isPresent());
//     // System.out.println(op2.isPresent());
//     // System.out.println("勇者" + op1.get());
//     // // System.out.println("勇者" + op2.get());
//     // System.out.println("勇者" + op1.orElse("ななし"));
//     // System.out.println("勇者" + op2.orElse("ななし"));
//     // Optional<String> s = decorate("", '*');
//     // System.out.println(s.orElse("nullのために処理できません"));
//     // StrongBox<String> op3 = new StrongBox<String>(KeyType.DIAL);
//     // op3.put("ミナト");
//     // System.out.println(op3.get());
//     // System.out.println(twice(4));
//     // Function<String, Integer> func = Main::len;
//     // // /functionにlenという関数を代入
//     // int a2 = func.apply("Java");
//     // // Javaという引数でfuncを起動
//     // System.out.println("文字列[Java]は" + a2 + "文字です");
//     // Consumer<String> func2 = System.out::println;
//     // func2.accept("Hello, World");
//     // Supplier<String> func3 = System::lineSeparator;
//     // System.out.println("開業します" + func3.get());
//     // BiFunction<String, String, String> func4 = System::getProperty;
//     // System.out.println(func4.apply("java.version", "不明"));
//     // Function<String, Integer> func5 = 
//     // (String s2) -> { return s2.length(); };
//     // // s2 -> s2.length();
//     // // 上の行を省略しようとするとここまで省略可能
//     // int n = func5.apply("Java");
//     // System.out.println("文字列JAヴぁは" + n + "文字です");
//     // List<Hero> heros = new ArrayList<>();
//     // Collections.sort(list, (x,y) -> (x.zandaka - y.zandaka));
//     // boolean anyoneKnockedOut = false;
//     // for (Hero h : heros) {
//     //   if (h.hp == 0) {
//     //     anyoneKnockedOut = true;
//     //     break;
//     //   }
//     // }
//     // boolean anyoneKnockedOut1 = 
//     //   heros.stream().anyMatch(h -> h.hp ==0);
//     // heros.stream().forEach(h -> {
//     //   System.out.println("勇者" + h.name);
//     //   });
//     //   // 勇者のなめ￥前をそれぞれ表示
//     // Optional<Hero> hopt = heros.stream().findFirst();
//     // if (hopt.isPresent()) {
//     //   System.out.println("戦闘は" + hopt.get().name);
//     // }
//     // // findFirstで最初の要素を返す。からの場合も考えられるのでOptionalとifで対策
//     // Optional<Hero> hopt = heros.stream().max((x,y) -> x.hp - y.hp);
//     // if (hopt.isPresent()) {
//     //   System.out.println("最大Hpの勇者は" + hopt.get().name);
//     // }
//     // // maxで代償を比べて一番大きいものの名前を習得
//     // FuncList funclist = new FuncList();
//     // Func1 f1 = FuncList::isOdd;
//     // Func2 f2 = funclist::passCheck;
//     // System.out.println(f1.call(15));
//     // System.out.println(f2.call(66, "Smith"));
//     // Func1 f1 = x -> x % 2 == 1;
//     // Func2 f2 = (point, name) -> {
//     //   return name + "さんは" + ( point >65 ? "合格" : "不合格");
//     // };
//     // System.out.println(f1.call(15));
//     // System.out.println(f2.call(66, "Smith"));
//     IntPredicate f1 = x -> x % 2 == 1;
//     System.out.println(f1.test(15));
//     List<String> names = List.of("湊雄介", "浅香あゆみ", "菅原琢磨", "大江武人");
//     names.stream()
//     .filter( n -> n.length() <= 4)
//     .map(n -> n +"さん")
//     .forEach(System.out::println);
//   }
//   public static Optional<String> decorate(String s, char c) {
//     String r;
//     if (s == null || s.length() == 0) {
//       r = null;
//     } else {
//       r = c + s + c;
//     }
//     return Optional.ofNullable(r);
//   }
//   public static int twice(int x) {
//     return x *2;
//   }
//   public static Integer len(String s) {
//     return s.length();
//   }
// }
// import org.apache.logging.log4j;
 
// public class Main {
//     public static void main(String[] args) throws Exception {
        
//         try {
//             File file = new File("c:\\Sample\\Test.txt");
//             // 書き込み用の新しいファイルの作成
//             FileWriter filewriter = new FileWriter(file);
//             // FileWrterをインスタンス化
         
//             filewriter.write("abc");
//             // 作成したファイルに書き込み
//             filewriter.close();
//             // ファイルを閉じる(一連の動作で必ず必要)
         
//             System.out.println("テキストファイルの作成に成功しました");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.*;
import java.text.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
// import com.fasterxml.jackson.databind.*;
// import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
// import org.apache.commons.*;
public class Main {
  // public static void main(String[] args) throws IOException {
    // File file = new File("Test1.txt");
    // FileWriter fw = new FileWriter(file);
    // fw.write('A');
    // fw.flush();
    // fw.close();
    // FileReader fr = new FileReader("Test1.txt");
    // System.out.println("全ての情報を読み込みます");
    // int i = fr.read();
    // while (i != -1) {
    //   char c = (char)i;
    //   System.out.println(c);
    //   i = fr.read();
    // }
    // System.out.println("全て読み込みました");
    // fr.close();
    // FileOutputStream fos = new FileOutputStream("Test8.txt");
    // CipherOutputStream cos = new ChipherOutputStream(fos, algo);
    // cos.write(65);
    // cos.flush();
    // cos.close();
    // FileWriter fw = null;
    // try {
    //   fw = new FileWriter("Test6.txt");
    //   fw.write('A');
    //   fw.flush();
    // } catch (IOException e) {
    //   System.out.println("書き込みエラーです");
    // } finally {
    //   if (fw != null) {
    //     try {
    //       fw.close();
    //     } catch (IOException e2) {}
    //   }
    // }
    // String msg = "第一土曜日は資源ごみの回収日です";
    // Reader sr = new StringReader(msg);
    // System.out.println((char)sr.read());
    // System.out.println((char)sr.read());
    // ByteArrayOutputStream baos = new ByteArrayOutputStream();
    // baos.write(65);
    // baos.write(66);
    // byte[] data = baos.toByteArray();
    // for (byte b : data) {
    //   System.out.println(b);
    // }
    // FileReader fr = new FileReader("Test1.txt");
    // System.out.println("全ての情報を読み込みます");
    // BufferedReader br =  new BufferedReader(fr);
    // String line = null;
    // while ((line = br.readLine()) != null) {
    //   int i = fr.read();
    //   System.out.println(i + "。全て読み込みました");
    // }
    
    // fr.close();
  //   public static void main(String[] args) throws Exception {
  //   String inFile = args[0];
  //   String outFile = args[1];
  //   FileInputStream fis = new FileInputStream(inFile);
  //   FileOutputStream fos = new FileOutputStream(outFile);
  //   int i = fis.read();
  //   while (i != -1) {
  //     fos.write(i);
  //     i = fis.read();
  //   }
  //   fos.flush();
  //   fos.close();
  //   fis.close();
  // }
  public static void saveToHeroFile(Hero h) throws IOException {
    Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
    w.write(h.name + "￥n");
    w.write(h.getHp() + "￥n");
    // w.write(h.mp + "￥n");
    w.flush();
    w.close();
  }
  public static void main(String[] args) throws Exception {
    // Hero h = new Hero("ミナト");
    // // saveToHeroFile(h);
    // String s = "みなと,あすか,すがわら";
    // String[] st = s.split(",");
    // // split(",")で文字列に分割されそれを配列に格納する
    // for (String t : st) {
    //   System.out.println(t);
    // }
    // FileReader fr = new FileReader("rpgdata.csv");
    // Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
    // for (CSVRecord r : records) {
    //   String name = r.get(0);
    //   String hp = r.get(1);
    //   String mp = r.get(2);
    //   System.out.println(name + "/" + hp + "/" + mp);
    // }
    // fr.close();
    // Reader fr = new FileReader("rpgdata.properties");
    // Properties p = new Properties();
    // p.load(fr);
    // String name = p.getProperty("heroName");
    // String strHp = p.getProperty("HeroHp");
    // int hp = Integer.parseInt(strHp);
    // System.out.println("勇者の名前:" + name);
    // System.out.println("勇者のHP:" + hp);
    // fr.close();
    // Writer fw = new FileWriter("rpgdata.properties");
    // Properties p = new Properties();
    // p.setProperty("heroName", "浅香");
    // p.setProperty("heroHp", "62");
    // p.setProperty("heroMP", "45");
    // p.store(fw, "勇者の情報");
    // fw.close();
    // ResourceBundle rb = ResourceBundle.getBundle("rpgdata");
    // String heroName = rb.getString("heroName");
    // System.out.println("勇者の名前:" + heroName);
    // Locale loc = Locale.getDefault();
    // System.out.println(loc.getCountry() + "-" + loc.getLanguage());
    // String now = (new SimpleDateFormat()).format(new Date());
    // ResourceBundle rb1 = ResourceBundle.getBundle("messages");
    // System.out.println(rb1.getString("CURRENT_TIME_IS") + now);
    // InputStream is = new FileInputStream("rpgsave.xml");
    // Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
    // Element hero = doc.getDocumentElement();
    // Element weapon = findChildByTag(hero, "weapon");
    // Element power = findChildByTag(weapon, "power");
    // String value = power.getTextContent();
    // ObjectMapper mapper = new ObjectMapper();
    // JsonNode root = mapper.readTree(new File("hero.json"));
    // JsonNode hero = root.get("hero");
    // JsonNode weapon = hero.get("weapon");
    // System.out.println("名前:" + hero.get("name").textValue());
    // System.out.println("武器:" + weapon.get("name").textValue());
    Hero h1 = new Hero("ミナト");
    FileOutputStream fos = new FileOutputStream("rpgsave.dat");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(h1);
    oos.flush();
    oos.close();
    FileInputStream fis = new FileInputStream("rpgsave.dat");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Hero h2 = (Hero)ois.readObject();
    ois.close();
  }
  // static Element findChildByTag(Element self, String name) throws Exception {
  //   NodeList children = self.getChildNodes();
  //   for (int i = 0; i < children.getLength(); i++) {
  //     if (children.item(i) instanceof Element) {
  //       Element e = (Element)children.item(i);
  //       if (e.getTagName().equals(name)) {
  //         return e;
  //       }
  //     }
  //   }
  //   return null;
  // }
}
  

// public class Main {
//   // public static void hello(Hero h) {
//   //     System.out.println(h.getName() + "さん、こんにちは");
//   //   }
//   // public static void methodA() {
//   //   System.out.println("methodA");
//   //   Hero h = new Hero("ミナト");
//   //   hello(h);
//   // }
//   // public static void helloName(String name) {
//   //     System.out.println(name + "さん、こんにちは");
//   // }
//   // // public static void circleCalcAns(int r) {
//   // //   double area = r * r * 3.14;
//   // //   System.out.println("半径" + r + "の円の面積は" + area + "です");
//   // // }
//   // public static double triangleCalcArea(int x, int y) {
//   //   double area = x * y / 2;
//   //   return area;
//   // }
//   // public static double circleCalcAns(int r) {
//   //   double area = r * r * 3.14;
//   //   return area;
//   // }
//   // public static int add(int x, int y) {
//   //   return x + y;
//   // }
//   // public static int add(int x, int y, int z) {
//   //   return x + y + z;
//   // }
//   // public static double add(double x, double y) {
//   //   return x + y;
//   // }
//   // public static String add(String x, String y) {
//   //   return x + y;
//   // }
//   // public static void printArray(int[] array) {
//   //   // for (int value : array) {
//   //   //   System.out.println(value);
//   //   // }
//   //   for (int i = 0; i < array.length; i++) {
//   //     array[i]++;
//   //   }
//   // }
//   // public static int[] makeArray(int size) {
//   //   int[] newArray = new int[size];
//   //   for (int i = 0; i < newArray.length; i++) {
//   //     newArray[i] = i;
//   //   }
//   //   return newArray;
//   // }
//   // public static void introduceOneself() {
//   //   String name = "みなと";
//   //   int age = 20;
//   //   double toll = 179.9;
//   //   char eto = '牛';
//   //   System.out.println("私の名前は" + name + "です。" + "年齢は" + age + "で、身長は" + toll + "です。干支は" + eto + "です。");
//   // }
//   // public static void email(String title, String address, String text) {
//   //   System.out.println(address + "に以下のメールを送信しました");
//   //   System.out.println("件名:" + title);
//   //   System.out.println("本文:" + text);
//   // }
//   // public static void email(String address, String text) {
//   //   System.out.println(address + "に以下のメールを送信しました");
//   //   System.out.println("件名:無題");
//   //   System.out.println("本文:" + text);
//   // }
//   // public static void main(String[] args) {
//   //   // Hero h = new Hero("ミナト");
//   //   // // hello(h);
//   //   // methodA();
//   //   // helloName("mianto");
//   //   // circleCalcAns(10);
//   //   // System.out.println(triangleCalcArea(10, 20));
//   //   // System.out.println(add(10,20));
//   //   // System.out.println(add(10,20,30));
//   //   // System.out.println(add(10.0,20.0));
//   //   // System.out.println(add("10","20"));
//   //   // int[] scores = {10, 20, 30, 40, 50};
//   //   // for (int value : scores) {
//   //   //   System.out.println(value);
//   //   // }
//   //   // printArray(scores);
//   //   // for (int value : scores) {
//   //   //   System.out.println(value);
//   //   // }
//   //   // for (int value1 : makeArray(5)) {
//   //   //   System.out.println(value1);
//   //   // }
//   //   introduceOneself();
//   //   email("a", "b", "c");
//   //   email("a", "b");
//   //   System.out.println(triangleCalcArea(10, 20));
//   //   System.out.println(circleCalcAns(10));
//   // }
//   //   int[] scores = {20, 30, 40, 50, 60};
//   //   System.out.println(scores.length);
//   //   System.out.println(scores[0]);
//   //   int sum = 0;
//   //   int count = 0;
//   //   for (int i =0; i < scores.length; i++) {
//   //     System.out.println(scores[i]);
      
//   //     sum += scores[i];
//   //     System.out.println(sum);
//   //     if (scores[i] >= 50) {
//   //       count++;
//   //     }
//   //     System.out.println(count);
//   //   }
//   //   int[] seq = new int[10];
//   //   for (int i = 0; i < seq.length; i++) {
//   //     seq[i] = new java.util.Random().nextInt(4);
//   //   }
//   //   for (int i = 0; i < seq.length; i++) {
//   //     switch (seq[i]) {
//   //       case 0:
//   //         System.out.println("A");
//   //         break;
//   //       case 1:
//   //         System.out.println("T");
//   //         break;
//   //       case 2:
//   //         System.out.println("C");
//   //         break;
//   //       case 3:
//   //         System.out.println("G");
//   //         break;
//   //     }
//   //   }
//   //   for (int value : scores) {
//   //     System.out.println(value);
//   //   }
//   //   // int[] [] scores2 = {{20,30,40}, {100,120,200}};
//   //   // for (int value : scores2) {
//   //   //   System.out.println(value);
//   //   // }
//   //   int[] points = new int[4];
//   //   double[] weights = new double[5];
//   //   boolean[] answer = new boolean[3];
//   //   String[] names = new String[3];
//   //   int[] moneyLists = {121902, 8302, 55100};
//   //   for (int value : moneyLists) {
//   //     System.out.println(value);
//   //   }
//   //   int[] numbers = {3, 4, 9};
//   //   System.out.println("画面に数字を入力してください");
//   //   int input = new java.util.Scanner(System.in).nextInt();
//   //   for (int i = 0; i < numbers.length; i++) {
//   //     if (numbers[i] == input) {
//   //       System.out.println("アタリ" + numbers[i]);
//   //     } else {
//   //       System.out.println("ハズレ" + numbers[i]);
//   //     }
//   //   hello();
//   //   }
    
//   // }
//   // Logger logger = LogManager.getLogger(Main.class);
//     // if (args.length != 2) {
//     //   logger.error("起動引数の数が異常:" + args.length);
//     // }
  
// }