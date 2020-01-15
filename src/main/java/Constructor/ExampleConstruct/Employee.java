package Constructor.ExampleConstruct;

class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    // Это конструктор класса Employee.
    Employee(String name){
        this.name = name;
    }
    // Присвоение возраста работника переменной age.
    void empAge(int empAge){
        age =  empAge;
    }
    /* Присвоение переменной designation. */
    void empDesignation(String empDesig){
        designation = empDesig;
    }
    /* Присвоение переменной salary. */
    void empSalary(double empSalary){
        salary = empSalary;
    }
    /* Вывод подробной информации. */
    void printEmployee(){
        System.out.println("Имя:"+ name );
        System.out.println("Возраст:" + age );
        System.out.println("Наименование:" + designation );
        System.out.println("Заработная плата:" + salary);
    }
}