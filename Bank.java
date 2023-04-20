public class Bank {
  String accountNumber;
  int balance;
  public String toString() {
    return "￥" + this.balance + "(口座番号:" + this.accountNumber + ")";
  }
  public boolean equals(Object o) {
    if (this == o) {return true;}
    if (o instanceof Bank) {
      Bank b = (Bank)o;
      if (this.accountNumber.equals(b.accountNumber)) {
        return true;
      }
    }
    return false;
  }
  public Bank(String accountNumber, int balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }
  public Bank() {
    this("ダミー", 0);
  }
}