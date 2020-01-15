package Constructor.ExampleConstr2;

class Constr2 {
    public static void main(String[] args) {
        //Создаем экземпляры класса MyConstruct. Внутри него есть конструктор, который
        //выводит строку из двух переменных типа String, склеивая их. Получим вывод
        //строки, но для каждого экземпляра СВОЁ nameConstruct: folder + name
        MyConstruct construct1 = new MyConstruct("folder1", "name1");
        MyConstruct construct2 = new MyConstruct("folder2", "name2");
        MyConstruct construct3 = new MyConstruct("folder3", "name3");
    }
}/*
>>>     nameConstruct: folder1name1
        nameConstruct: folder2name2
        nameConstruct: folder3name3
*/
