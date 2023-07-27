package oving1;

public class Account {
    private double balance;
    private double interestRate;

    public void deposit(double n) {
        if (n >= 0) {
            this.balance += n;
        }
    }

    public void addInterest() {
        this.balance += (this.interestRate * this.balance) / 100;

    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double k) {
        this.interestRate = k;
    }

    public String toString() {
        return "balance:" + balance + "\ninterestrate:" + interestRate;
    }

    public static void main(String[] args) {
        Account konto = new Account();
        konto.deposit(500);
        konto.setInterestRate(2);
        konto.addInterest();
        konto.getBalance();
        System.out.println(konto);

    }

}
