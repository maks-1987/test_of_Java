package Patterns.Creational.AbstractFactory;

/**
 * Два метода обеспечат работу механизма. Они генерят абстрактные продукты Address и
 * PhoneNumber, на которые возлагается задача определения функциональности самих
 * продуктов. Address и PhoneNumber - абстрактные классы, в тех ситуациях, когда
 * нет необходимости помещать в них код (предназначенный для работы во всех конкретных
 * продуктах) их можно определить в виде интерфейсов.
 */
public interface AddressFactory {

    public Address createAddress();
    public PhoneNumber createPhoneNumber();

}
