package oving2;

public class UpOrDownCounter {

    private int counter;
    private int end;

    public UpOrDownCounter(int start, int end) {
        if (start == end) {
            throw new IllegalArgumentException("Start og slutt på være ulike tall.");
        } else {
            this.counter = start;
            this.end = end;
        }

    }

    public int getCounter() {
        return this.counter;
    }

    public boolean count() {
        if (this.counter < this.end) {
            this.counter++;
            return countCheck();
        }

        else if (this.counter > this.end) {
            this.counter -= 1;
            return countCheck();
        }

        else
            return false;

    }

    private boolean countCheck() {
        if (this.counter == this.end) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public String toString() {
        return "UpOrDownCounter [counter=" + counter + ", end=" + end + "]";
    }

    public static void main(String[] args) {
        UpOrDownCounter count = new UpOrDownCounter(3, 9);
        count.count();
        count.count();
        System.out.println(count.count());
    }

}
