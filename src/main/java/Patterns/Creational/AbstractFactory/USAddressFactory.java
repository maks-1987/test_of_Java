package Patterns.Creational.AbstractFactory;

/**
 * Этот класс реализует интерф AddressFactory, а также подклассы USAddress и
 * USPhoneNumber классов Address и PhoneNumber, соответственно.
 * Набор классов AddressFactory, Address и PhoneNumber облегчает процесс расширен.
 * возможностей системы для поддержки форматов адресов и номер телеф, принятых в др.
 * странах. Теперь для добавления функции поддержки форматов к.-либо дополнительной
 * страны, достаточ определить конкретный класс механизма и соответствующий ему
 * конкретн класс продукта.
 * Например, классы, которые можно использовать для добавления поддержки форматов,
 * принятых во Франции - FrenchAddress, FrenchAddressFactory, FrenchPhoneNumber.
 */
public class USAddressFactory implements AddressFactory {

    @Override
    public Address createAddress() {
        return new USAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new USPhoneNumber();
    }
}
