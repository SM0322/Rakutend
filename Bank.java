// public class Bank {
//   String accountNumber;
//   int balance;
//   public String toString() {
//     return "￥" + this.balance + "(口座番号:" + this.accountNumber + ")";
//   }
//   public boolean equals(Object o) {
//     if (this == o) {return true;}
//     if (o instanceof Bank) {
//       Bank b = (Bank)o;
//       if (this.accountNumber.equals(b.accountNumber)) {
//         return true;
//       }
//     }
//     return false;
//   }
//   public Bank(String accountNumber, int balance) {
//     this.accountNumber = accountNumber;
//     this.balance = balance;
//   }
//   public Bank() {
//     this("ダミー", 0);
//   }
// }
import org.apache.commons.lang3.builder.*;

public class Bank {
  String name;
  String address;
  // ここから
  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof Bank)) return false;
    Bank r = (Bank)o;
    if (!this.name.equals(r.name)) return false;
    if (!this.address.equals(r.address)) return false;
    return true;
    // ここまでが等価かどうかの判断メソッド、しかしフィールドが増えるとその分コード量が増えてしまう。そこで
    return EqualsBuilder.reflectionEquals(this, o);
    // EqualsBuilderはこのクラスの持つすべてのフィールドが等価か調べる便利な非公式API
  }
  public int hashCode() {
      return HashCodeBuilder.reflectionHashCode(this);
    }
}