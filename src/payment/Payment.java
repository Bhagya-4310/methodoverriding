package payment;

import Constructer.Student;

public class Payment{
    private String amount;
    private Account fromAccount;
    private Account toAccount;
    private String phNo;

    public Payment(String amount, String phNo){
        this.amount = amount;
        this.phNo = phNo;
    }
    public Payment(String amount, Account fromAccount, Account toAccount) {
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }
    public String getAmount() {
        return amount;
    }
  /*  public String getFromAccount() {
        return fromAccount;
    }
    public String getToAccount() {
        return toAccount;
    } */
}