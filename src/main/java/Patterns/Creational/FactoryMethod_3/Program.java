package Patterns.Creational.FactoryMethod_3;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }
    // Метод вызывает определенную фабрику разработчиков в зависимости от специальности
    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        }else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        }else {
            throw new RuntimeException(speciality + " is unknown specialty.");
        }
    }
}
