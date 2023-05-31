// public class Account implements Comparable<Account> {
//   int number;
//   int zandaka;
//   public int compareTo(Account obj) {
//     if (this.number < obj.number) {
//       return -1;
//     }
//     if (this.number > obj.number) {
//       return 1;
//     }
//     return 0;
//   }
// }
// public class Account {
//   private String accountNo;
//   private int zandaka;
//   private AccountType accountType;
//   public Account(String aNo, AccountType aType) {
//     this.accountNo = aNo;
//     this.accountType = aType;
//   }
//   public static final int FUTSU = 1;
//   public static final int TOUZA = 2;
//   public static final int TEIKI = 3;
//   public String getaccountNo() {
//     return this.accountNo;
//   }
//   public void setaccountNo(String accountNo) {
//     this.accountNo = accountNo;
//   }
//   public AccountType getaccountType() {
//     return this.accountType;
//   }
//   public void setaccountType(AccountType accountType) {
//     this.accountType = accountType;
//   }
// }

/**
 * 口座クラス
 * このクラスは一つの銀行口座を示す
 * javac -Xlintオプションを加えることでコンパイルの際に警告を出してくれる
 * @author 南
 * @deprecated 代わりにNewAccountクラスを使え
 */
// @SupperessWarning("serial")
// public class Account {
//   /**残高*/
//   private int zandaka;
//   /**口座名義人*/
//   private String owner;
//   /**
//     * 送金を行うメソッド、このメソッドを動かすと他の口座に送金する
//   */
//   @Override
//   public void transfer() {
//     System.out.println("A");
//   }
// }
public class Account {
  String owner;
  int zandaka;
  public Account(String owner, int zandaka) {
    this.owner = owner;
    this.zandaka = zandaka;
  }
  public void transfer(Account dest, int amount) {
    dest.zandaka += amount;
    zandaka -= amount;
    assert this.zandaka >= 0;
    // アサーション: 品質面ではテストのことを考えつつ可動クラスを作る方がよい。
    // そのための補助として稼働コードの中に直接簡易テストを仕込める
  }
}