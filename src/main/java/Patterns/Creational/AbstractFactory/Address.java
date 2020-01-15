package Patterns.Creational.AbstractFactory;

public abstract class Address {

    static final String EOL_STRING = System.getProperty("line.separator");
    static final String SPACE = " ";
    private String street;
    private String city;
    private String region;
    private String postalCode;

    public abstract String getCountry();

    String getStreet() {
        return street;
    }

    public void setStreet(String newStreet) {
        this.street = newStreet;
    }

    String getCity() {
        return city;
    }

    public void setCity(String newCity) {
        this.city = newCity;
    }

    String getRegion() {
        return region;
    }

    public void setRegion(String newRegion) {
        this.region = newRegion;
    }

    String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String newPostalCode) {
        this.postalCode = newPostalCode;
    }

}
