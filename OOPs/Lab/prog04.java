// Write a java program which create a class named ACCOUNT and derive SAVINGS_ACCOUNT and FIXED_ACCOUNT acces from it.
// Define appropriate constructors and methods to access account details.

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
        System.out.println("Interest Rate : " + this.intRate + "% per annum");
    }
}

class FixedAccount extends Account {
    private float intRate;
    private int time;

    FixedAccount(String accNo, double bal, float intRate, int time) {
        super(accNo, bal);
        this.intRate = intRate;
        this.time = time;
    }

    void getFixedDetails() {
        System.out.println("Interest Rate : " + this.intRate + "% per annum");
        System.out.println("Time Period : " + this.time + " years");
    }
}

public class prog04 {
    public static void main(String[] args) {
        Account a = new Account("A12345", 1000.00);
        System.out.println("Account Details -");
        a.getAccDetails();

        SavingsAccount sa = new SavingsAccount("SA12345", 2000.00, 2.7f);
        System.out.println("\nSavings Account Details -");
        sa.getAccDetails();
        sa.getIntRate();

        FixedAccount fa = new FixedAccount("FA12345", 100000.00, 6.9f, 5);
        System.out.println("\nFixed Account Details -");
        fa.getAccDetails();
        fa.getFixedDetails();
    }
}