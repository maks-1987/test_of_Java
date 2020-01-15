package Constructor.ExampleConstruct;

public class EmployeeRun {
    public static void main(String args[]){
      /* Создание двух объектов с помощью конструктора. */
        Employee empOne = new Employee("Олег Олегов");
        Employee empTwo = new Employee("Иван Иванов");

        // Вызов метода для каждого созданного объекта.
        empOne.empAge(26);
        empOne.empDesignation("Старший инженер-программист");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Инженер-программист");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}/*
>>>     Имя:Олег Олегов
        Возраст:26
        Наименование:Старший инженер-программист
        Заработная плата:1000.0
        Имя:Иван Иванов
        Возраст:21
        Наименование:Инженер-программист
        Заработная плата:500.0
*/
