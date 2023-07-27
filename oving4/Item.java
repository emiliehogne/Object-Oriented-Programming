package oving4;

public class Item {
    private String navn;
    private String type;
    private double price;
    private Merchant eier;

    public Item(String navn, String type, double price) {
        if (navn == "") {
            throw new IllegalArgumentException("Du må gi navn");
        } else {
            this.navn = navn;
        }
        if (type == "Weapon" || type == "Armour" || type == "Potion" || type == "Valuable") {
            this.type = type;
        } else {
            throw new IllegalArgumentException("hh");
        }

        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Gyldig ");
        }
    }

    public Merchant getOwner() {
        return this.eier;

    }

    public void changeOwner(Merchant eier) {
        this.eier = eier;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [navn=" + navn + ", type=" + type + ", pris=" + price + ", eier=" + eier + "]";
    }

}
