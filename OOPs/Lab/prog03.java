// Write a java program to create ACCOUNT calass and define constructor(s) and method for it.
// Derive saving-ACCOUNT class from Account class and provide constructor of Account class.
// Make necessary assumption where required.

class Account {
    private String accNo;
    private double bal;

    Account(String accNo, double bal) {
        this.accNo = accNo;
        this.bal = bal;
    }

    void getAccDetails() {
        System.out.println("Account No. : " + this.accNo);
        System.out.println("Balance : " + this.bal);
    }
}

class SavingsAccount extends Account {
    private float intRate;

    SavingsAccount(String accNo, double bal, float intRate) {
        super(accNo, bal);
        this.intRate = intRate;
    }

    void getIntRate() {
        System.out.println("Interest Rate : " + this.intRate);
    }
}

public class prog03 {
    public static void main(String[] args) {
        Account a = new Account("A12345", 1000.00);
        System.out.println("Account Details -");
        a.getAccDetails();

        SavingsAccount sa = new SavingsAccount("SA12345", 2000.00, 2.7f);
        System.out.println("\nSavings Account Details -");
        sa.getAccDetails();
        sa.getIntRate();
    }
}