package Enum;

/**
 * каждая константа перечисления является объектом своего класса перечисления.
 * То есть, когда вы определяете конструктор для перечисления, он вызывается
 * при каждом создании константы перечисления. Также каждая константа
 * перечисления имеет свою собственную копию переменных экземпляра, объявленных
 * перечислением. Данная версия перечисления Apple2 добавляет следующее. Первое
 * — это переменная экземпляра price, которая применяется для хранения цены
 * каждого сорта яблок. Второе — конструктор Apple2(), которому передается
 * цена яблок. Третье — метод getPrice(), возвращающий значение цены.
 * Когда в методе main() объявляется переменная, конструктор Apple2() вызывается
 * однажды для каждой объявленной константы. Аргументы конструктору передаются
 * помещением их в скобки после каждой константы 'Jonathan(10)'. Эти переменные
 * передаются параметру 'p' конструктора Apple2(), который затем присваивает
 * их переменной экземпляра price. Поскольку копия перем-й экземпляра price
 * существует для каждой перечислимой конст-ты, значение, ассоциированное
 * с одной константой, отделено и отличается от значения, ассоциировнного
 * с другой константой.
 */
enum Apple2 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price;// цена каждого яблока
    // Конструктор
    Apple2(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
