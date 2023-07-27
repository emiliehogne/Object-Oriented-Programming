package oving2;

public class Vehicle {
    private char kjøretøy;
    private char drivstoff;
    private String registreringsnmr;

    public Vehicle(char c, char f, String s) {
        if (vehicleOK(c) && drivstoffOK(c, f) && registreringsnmrOK(c, f, s)) {
            this.kjøretøy = c;
            this.drivstoff = f;
            this.registreringsnmr = s;
        } else
            throw new IllegalArgumentException("ugyldig");

    }

    public boolean vehicleOK(char c) {
        if (c == 'M' || c == 'C') {
            return true;
        } else
            return false;
    }

    public boolean drivstoffOK(char kjøretøy, char drivstoff) {
        if ((kjøretøy == 'M' && drivstoff == 'H') || (drivstoff != 'H' && drivstoff != 'G' && drivstoff != 'E'
                && drivstoff != 'D')) {
            return false;
        } else
            return true;

    }

    public boolean registreringsnmrOK(char kjøretøy, char drivstoff, String reg) {
        boolean siffer = false;
        if (reg.substring(0, 2).matches(".*\\d.*") || reg.substring(0, 2).equals(reg.substring(0, 2).toLowerCase())
                || !(reg.substring(2).matches(".*\\d.*"))) {
            return false;
        }
        if ((kjøretøy == 'M' && reg.length() == 6) || (kjøretøy == 'C' && reg.length() == 7)) {
            siffer = true;
        }

        if (siffer && (drivstoff == 'E' && (reg.startsWith("EL") || reg.startsWith("EK")))) {

            return true;
        }

        else if (siffer && (drivstoff == 'H' && reg.startsWith("HY"))) {
            return true;
        } else if (siffer && ((drivstoff == 'G' || drivstoff == 'D') && (!reg.startsWith("EK") && !reg.startsWith("EL")
                && !reg.startsWith("HY") && !reg.contains("Å") && !reg.contains("Ø") && !reg.contains("Æ")))) {
            return true;
        }

        else
            return false;

    }

    public char getFuelType() {
        return this.drivstoff;
    }

    public String getRegistrationNumber() {
        return registreringsnmr;
    }

    public void setRegistrationNumber(String reg) {
        if (registreringsnmrOK(this.kjøretøy, this.drivstoff, reg)) {
            this.registreringsnmr = reg;
        } else
            throw new IllegalArgumentException("ugyldig");
    }

    public char getVehicleType() {
        return kjøretøy;
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle('C', 'G', "ADC456");
        System.out.println(car);
    }
}
