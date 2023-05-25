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
public class Account {
  private String accountNo;
  private int zandaka;
  private AccountType accountType;
  public Account(String aNo, AccountType aType) {
    this.accountNo = aNo;
    this.accountType = aType;
  }
  public static final int FUTSU = 1;
  public static final int TOUZA = 2;
  public static final int TEIKI = 3;
  public String getaccountNo() {
    return this.accountNo;
  }
  public void setaccountNo(String accountNo) {
    this.accountNo = accountNo;
  }
  public AccountType getaccountType() {
    return this.accountType;
  }
  public void setaccountType(AccountType accountType) {
    this.accountType = accountType;
  }
}