package oving2;

public class Digit {
    private int tallsystem;
    private int siffer; // disse attributtene skal være private for de skal kun brukes inne i klassen

    public Digit(int number) { // metodene er public for de kan brukes utenfor klassen, men de er begrens
        this.siffer = 0;
        if (number <= 36 && number > 0) {
            this.tallsystem = number;
        } else
            throw new IllegalArgumentException("The number must be between 1 and 36");

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
