public class Account{
  double balance;
  int accountNumber;
  public Account(double b, int a){
    balance = b;
    accountNumber = a;
  }
  public Account(int a){
    accountNumber = a;
  }
  public int getAccountNumber(){
    return accountNumber;
  }
  public double getBalance(){
    return balance;
  }
  public void setBalance(double b){
    balance = b;
  }
  public void credit(double amount){
    balance = balance + amount;
  }
  public void debit(double amount){
    if (balance>= amount){
      balance = balance - amount;
    }
    else{
      System.out.println("Amount withdrawn exceeds the current balance!");
    }
  }
  public String toString(){
    return "Account number: " + accountNumber + " balance : " + balance;
  }
}
