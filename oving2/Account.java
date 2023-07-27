package oving2;

public class Account {
    private double balance;
    private double interestRate;

    public Account(double balance, double interestRate) {
        if (balance >= 0 && interestRate >= 0) {
            this.balance = balance;
            this.interestRate = interestRate;
        } else
            throw new IllegalArgumentException("The number must be positive");

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else
            throw new IllegalArgumentException("The number must be positive");

    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate >= 0) {
            this.interestRate = interestRate;
        } else
            throw new IllegalArgumentException("The number must be positive");

    }

    public void deposit(double balance) {
        if (balance >= 0) {
            this.balance += balance;
        } else
            throw new IllegalArgumentException("The number must be positive");

    }

    public void withdraw(double balance) {
        if (balance >= 0 && this.balance >= balance) {
            this.balance -= balance;
        } else
            throw new IllegalArgumentException("The number must be positive");

    }

    public void addInterest() {
        this.balance += ((this.interestRate * this.balance) / 100);
    }

    @Override
    public String toString() {
        return ("balance: " + this.balance + "\n interestRate: " + this.interestRate);
    }

    public static void main(String[] args) {
        Account a = new Account(1, 10);
        a.getBalance();
        System.out.println(a);

    }

}
