package Loantask;

public class LoanSanction {
    public void loanprocess(LoanSeeker loanSeeker) {
        LoanSeeker loanSeeker1 = new LoanSeeker("bhagi", "7989453985", "hyd", 200000, 650);
        if (loanSeeker1.getCreditScore() >= 615 && loanSeeker1.getIncome() >= 150000) {
            System.out.println("eligible for loan ");
        } else {
            System.out.println("not eligible for loan");
        }
    }
}
