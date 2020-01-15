package GetSet;

public class Invocation {
    public static void main(String[] args) {
        Country c = new Country("Pavl", "Zavod");
        c.getCity();
        c.getStreet();
        c.setCity("Pavlograd");
        c.setStreet("Zavodska");
        System.out.print(c.getCity() +" "+ c.getStreet());
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
