import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
  public static void main(String[] args) throws Exception {
    Set<String> colors = new HashSet<String>();
    colors.add("赤");
    colors.add("黄");
    colors.add("青");
    colors.add("赤");
    System.out.println("色は" + colors.size() + "種類");
  }
  //   ArrayList<String> names = new ArrayList<String>();
  //   names.add("たなか");
  //   names.add("すずき");
  //   names.add("さいとう");
  //   Iterator<String> it = names.iterator();
  //   while (it.hasNext()) {
  //     String e = it.next();
  //     System.out.println(e);
  //   }
    // System.out.println(names.get(1));
    // for (int i = 0; i < names.size(); i++) {
    //   System.out.println(names.get(i));
    // }
    // for (String s : names) {
    //   System.out.println(s);
    // }
    // ArrayList<Integer> points = new ArrayList<Integer>();
    // points.add(10);
    // points.add(80);
    // points.add(75);
    // for (int i : points) {
    //   System.out.println(i);
    // }
    // points.add(1,20);
    // for (int i : points) {
    //   System.out.println(i);
    // }
    // points.set(1,30);
    // for (int i : points) {
    //   System.out.println(i);
    // }
    // Date now = new Date();
    // Calendar c = Calendar.getInstance();
    // c.setTime(now);
    // int day = c.get(Calendar.DAY_OF_MONTH);
    // day += 100;
    // c.set(Calendar.DAY_OF_MONTH, day);
    // Date future = c.getTime();
    // SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    // System.out.println(f.format(future));
    
    // LocalDate now = LocalDate.now();
    // LocalDate future = now.plusDays(100);
    // DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    // System.out.println(future.format(fmt));
    // isValidPlayerName("宮迫信之介");
    // Bank a1 = new Bank("4649", 1592);
    // Bank a2 = new Bank("4649", 2000);
    // System.out.println(a1.toString());
    // Empty e = new Empty();
    // String s = e.toString();
    // System.out.println(s);
    // System.out.println(Hero.money);
    // Hero h1 = new Hero("湊1");
    // Hero h2 = new Hero("湊2tehbsrthnsrty");
    // System.out.println(isValidPlayerName(h1.name));
    // String s = "abc,def:ghi";
    // String[] words = s.split("[,:]");
    // for (String w : words) {
    //   System.out.println(w + "->");
    // }
    // final String FORMAT = "%-9s %-13s 所持金%,6d";
    // String s1 = String.format(FORMAT, h1.getName(), h1.getHp(), h1.getGold());
    // System.out.println(s1);
    // String s2 = String.format(FORMAT, h2.getName(), h2.getHp(), h2.getGold());
    // System.out.println(s2);
    // long start = System.currentTimeMillis();
    // long end = System.currentTimeMillis();
    // System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒でした");
    // Date now = new Date();
    // System.out.println(now);
    // System.out.println(now.getTime());
    // Date past = new Date(1600705425827L);
    // System.out.println(past);
    // Calendar c = Calendar.getInstance();
    // c.set(2023,4,20,16,8,30);
    // c.set(Calendar.MONTH, 9);
    // Date d = c.getTime();
    // System.out.println(d);
    // c.setTime(now);
    // int y = c.get(Calendar.YEAR);
    // System.out.println("今年は" + y + "年です");
    // SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    // Date d = f.parse("2020/09/22 01:23:45");
    // System.out.println(d);
    // Date now = new Date();
    // String s = f.format(now);
    // System.out.println("現在は" + s + "です");
    // Instant i1 = Instant.now();
    // Instant i2 = Instant.ofEpochMilli(1600705425827L);
    // long l = i2.toEpochMilli();
    // ZonedDateTime z1 = ZonedDateTime.now();
    // ZonedDateTime z2 = ZonedDateTime.of(2020, 1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));
    // Instant i3 = z2.toInstant();
    // ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
    // System.out.println("東京" + z2.getYear() + z2.getDayOfMonth());
    // System.out.println("ロンドン" + z3.getMonth() + z3.getDayOfMonth());
    // if (z2.isEqual(z3)) {
    //   System.out.println("これらは同じ時間を指しています");
    // }
    // // Hero h2 = new Hero("湊");
    // if (a1.equals(a2) == true) {
    //   System.out.println("同じ内容です");
    // } else {
    //   System.out.println("違う内容です");
    // }
    // String s1 = "スッキリJava";
    // String s2 = "Java";
    // String s3 = "java";
    // if (s2.equals(s3)) {
    //   System.out.println("s2とs3は等しい");
    // }
    // if (s2.equalsIgnoreCase(s3)) {
    //   System.out.println("ケースを区別しなければs2とs3は等しい");
    // }
    // System.out.println("s1の長さは" + s1.length() + "です");
    // if (s1.isEmpty()) {
    //   System.out.println("s1は空文字です");
    // }
    // if (s1.contains("Java")) {
    //   System.out.println("文字列はJavaを含んでいます");
    // }
    // if (s1.endsWith("Java")) {
    //   System.out.println("文字列はJavaが末尾にあります");
    // }
    // System.out.println("文字列で最初にJavaが搭乗する位置は" + s1.indexOf("Java"));
    // System.out.println("文字列で最後にJavaが搭乗する位置は" + s1.lastIndexOf("Java"));
    // String s4 = "Java programing";
    // System.out.println("文字列の4文字目以降は" + s4.substring(3));
    // System.out.println("文字列の４＝８文字目は" + s4.substring(3, 8));
    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < 100; i++) {
    //   sb.append(i+1).append(",");
    // }
    // String s = sb.toString();
    // String[] a = s.split(",");
    // System.out.println(s);
    // System.out.println(a);
    // String s = sb.toString();
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