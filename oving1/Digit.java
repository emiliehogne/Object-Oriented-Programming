package oving1;

public class Digit {
    private int tallsystem;
    private int siffer;

    public Digit(int number) {
        this.tallsystem = number;
        this.siffer = 0;

    }

    public int getValue() {
        return this.siffer;
    }

    public boolean increment() {
        if ((this.siffer + 1) == this.tallsystem) {
            this.siffer = 0;
            return true;
        } else {
            this.siffer += 1;
            return false;
        }
    }

    public int getBase() {
        return this.tallsystem;
    }

    @Override
    public String toString() {

        return Integer.toHexString(getValue()).toUpperCase();
    }

    public static void main(String[] args) {
        Digit d = new Digit(10);
        d.getValue();
        d.increment();
        System.out.println(d);

    }
}
