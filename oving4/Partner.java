package oving4;

public class Partner {
    private String name;
    private Partner partneren;

    public Partner(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public Partner getPartner() {
        return this.partneren;
    }

    public void setPartner(Partner p) {
        if (this.partneren == p) {
            return;
        }

        else if (this.partneren == null) {
            this.partneren = p;
            p.partneren = this;

        }

        else if (p == null) {
            this.partneren.setPartner(null);
            this.partneren = null;

        }

        else {
            this.partneren.setPartner(null);
            this.partneren = null;

            p.partneren.setPartner(null);
            p.partneren = null;

            p.partneren = this;
            this.partneren = p;

        }
        /*
         * if (p == null) {
         * this.partneren.setPartner(null);
         * this.partneren = null;
         * 
         * } else if ((this.partneren == null) && (p.partneren == null)) {
         * this.partneren = p;
         * p.setPartner(this);
         * 
         * } else if (p.partneren == null) {
         * this.partneren.setPartner(null);
         * this.partneren = null;
         * this.partneren = p;
         * p.setPartner(this);
         * }
         * 
         * else if (this.partneren == null) {
         * p.partneren.setPartner(null);
         * p.partneren = null;
         * p.partneren = this;
         * this.partneren = p;
         * 
         * } else {
         * this.partneren.setPartner(null);
         * this.partneren = null;
         * 
         * p.partneren.setPartner(null);
         * p.partneren = null;
         * 
         * p.partneren = this;
         * this.partneren = p;
         * 
         * }
         */
    }

    @Override
    public String toString() {
        return "Partner [name=" + name + ", partneren=" + partneren + "]";
    }

    public static void main(String[] args) {
        Partner p1 = new Partner("Emilie");
        Partner p2 = new Partner("Maiken");
        p1.setPartner(p2);
        System.out.println(p2);

    }

}
