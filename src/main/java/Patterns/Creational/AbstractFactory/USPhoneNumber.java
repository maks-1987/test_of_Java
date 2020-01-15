package Patterns.Creational.AbstractFactory;

public class USPhoneNumber extends PhoneNumber {

    private static final String COUNTRY_CODE = "01";
    private static final int Number_LENGTH = 10;

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
