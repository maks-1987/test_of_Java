package Constructor.ExampleConstr2;

class MyConstruct {
    private String nameConstr;
    //Это конструктор, в нем содержатся два поля String необходимых
    //для заполнения. И метод, выводящий имяКонструктора для каждого
    //нового экземпляра своё.
    MyConstruct(String folder, String name) {
        //Переданные сюда две переменные склеиваются в одну
        this.nameConstr = folder + name;
        //И выводятся результат на экран
        System.out.println("nameConstruct: " + nameConstr);
    }
}


