package Loantask;
public class LoanSeeker {
        private String name;
        private String phoneNumber;
        private String address;
        private int creditScore;
        private double income;
        public String bankAccountNo;
        public String branchName;
        private LoanDetails loanDetails;

        public LoanSeeker(String name,String phoneNumber,String address,double income,int creditScore){
         this.name=name;
         this.phoneNumber=phoneNumber;
         this.address=address;
         this.income=income;
         this.creditScore=creditScore;
        }
        public LoanSeeker(String name){
                this.name=name;
                this.loanDetails=new LoanDetails(1500000,"personalloan");
        }

        public String getName() {
                return name;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public String getAddress() {
                return address;
        }


        public int getCreditScore() {
                return creditScore;
        }

        public double getIncome() {
                return income;
        }

        public String getBankAccountNo() {
                return bankAccountNo;
        }

        public String getBranchName() {
                return branchName;
        }

        public LoanDetails getLoanDetails() {
                return loanDetails;
        }
}