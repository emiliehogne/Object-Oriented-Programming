package oving7;

public class SavingsAccount implements Account {
    protected double balance;
    protected double rente;

    SavingsAccount(double rente) {
        balance = 0;
        this.rente = rente;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        } else
            balance += amount;

    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        } else if (amount > balance) {
            throw new IllegalStateException();
        }
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void endYearUpdate() {
        balance += balance * rente;
    }

}
