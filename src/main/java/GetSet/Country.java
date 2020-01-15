package GetSet;

class Country {
    private String city;
    private String street;
    //Это конструктор класса
    Country(String city, String street) {
        this.city = city;
        this.street = street;
    }
    String getCity() {
        System.out.println("getCity: "+city+" "+street);
        return city;

    }
    void setCity(String city) {
        this.city = city;
        System.out.println("setCity: "+city+" "+street+", ул. еще не поменялась");
    }
    String getStreet() {
        System.out.println("getStreet: "+city+" "+street);
        return street;
    }
    void setStreet(String street) {
        this.street = street;
        System.out.println("setStreet: "+city+" "+street);
    }
}/*
>>>     getCity: Pavl Zavod
        getStreet: Pavl Zavod
        setCity: Pavlograd Zavod, ул. еще не поменялась
        setStreet: Pavlograd Zavodska
        getCity: Pavlograd Zavodska
        getStreet: Pavlograd Zavodska
        Pavlograd Zavodska
*/
