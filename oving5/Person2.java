package oving5;

public class Person2 implements Named {

    private String fullName;

    public Person2(String fullNameString) {
        this.fullName = fullNameString;

    }

    @Override
    public void setGivenName(String s) {

        this.fullName = s + this.fullName.substring(this.fullName.indexOf(" "));
    }

    @Override
    public String getGivenName() {
        return this.fullName.substring(0, this.fullName.indexOf(" "));

    }

    @Override
    public void setFamilyName(String s) {
        this.fullName = this.fullName.substring(0, this.fullName.indexOf(" ")) + " " + s;
    }

    @Override
    public String getFamilyName() {
        return this.fullName.substring(this.fullName.indexOf(" ") + 1);
    }

    @Override
    public void setFullName(String s) {
        this.fullName = s;
    }

    @Override
    public String getFullName() {
        return this.fullName;
    }

    public static void main(String[] args) {
        Person2 p2 = new Person2("Emilie Høgne");
        Person2 p3 = new Person2("Ingrid Lysaker");

        System.out.println(p2.getFamilyName());

    }
}
