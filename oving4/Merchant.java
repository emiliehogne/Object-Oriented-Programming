package oving4;

public class Merchant {
    private double money;

    public Merchant(double start) {
        if (start < 0) {
            throw new IllegalArgumentException("number must be positive");
        } else
            this.money = start;

    }

    public void obtainItem(Item t) {
        t.changeOwner(this);

    }

    public void removeItem() {

    }

    public void sellItem(Item i, Merchant m) {
        if ((i.getPrice() > m.money) || !(i.getOwner().equals(this)) || (m == this)) {
            throw new IllegalStateException("Not allowed");
        }

        else {
            i.changeOwner(m);
            m.obtainItem(i);
            this.removeItem();
            this.money += i.getPrice();
            m.money -= i.getPrice();
        }
    }

}
