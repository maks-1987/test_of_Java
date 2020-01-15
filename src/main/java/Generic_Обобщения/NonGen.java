package Generic_Обобщения;

/**
 * Класс NonGen заменяет все обращения к типу Т на обращен к типу Object.
 * Это позволяет классу NonGen хранить объекты любого типа, как это делает
 * и обобщенная версия. Однако это не позволяет компилятору Java иметь
 * какую-то реальную информацию о типе данных, в действительности сохраняемых
 * в объекте класса NonGen, что плохо по двум причинам. Во-первых, для
 * извлечения сохраненных данных требуется явное приведение. Во-вторых,
 * многие ошибки несоответствия типов не могут быть обнаружены до
 * времени выполнения.
 */
//Похожий на класс Gen, но без ОБОБЩЕНИЙ
class NonGen {
    Object ob;// ob теперь имеет тип Object
    // Передать конструктору ссылку на объект типа Object
    NonGen(Object о) {
        ob = о ;
    }
    // Вернуть тип Object.
    Object getob() {
        return ob;
    }
    // Показать тип ob.
    void showType() {
        System.out.println("Типом ob является " + ob.getClass().getName());
    }
}
