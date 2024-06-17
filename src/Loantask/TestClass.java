package Loantask;

public class TestClass {
    public static void main(String[] args) {
        LoanSanction loanSanction=new LoanSanction();
        loanSanction.loanprocess(new LoanSeeker("bhagi","7989453985","hyd",200000,650));
    }
}