package Patterns.Creational.AbstractFactory;

public class FrenchPhoneNumber extends PhoneNumber {

    private static final String COUNTRY_CODE = "33";
    private static final int Number_LENGTH = 9;

    @Override
    public String getCountryCode() {
        return COUNTRY_CODE;
    }

    public void setPhoneNumber(String newNumber) {
        if (newNumber.length() == Number_LENGTH) {
            super.setPhoneNumber(newNumber);
        }
    }
}
