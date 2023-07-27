package oving5;

public class Person1 implements Named {

    private String givenName;
    private String familyName;

    public Person1(String g, String f) {
        this.givenName = g;
        this.familyName = f;
    }

    @Override
    public void setGivenName(String s) {

        this.givenName = s;
    }

    @Override
    public String getGivenName() {
        return this.givenName;
    }

    @Override
    public void setFamilyName(String s) {
        this.familyName = s;
    }

    @Override
    public String getFamilyName() {
        return this.familyName;
    }

    @Override
    public void setFullName(String s) {
        this.givenName = s.substring(0, s.indexOf((" ")));
        this.familyName = s.substring(s.indexOf(" ") + 1);

    }

    @Override
    public String getFullName() {
        return givenName + " " + familyName;
    }

    public static void main(String[] args) {

    }
}
