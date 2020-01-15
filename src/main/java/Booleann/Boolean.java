package Booleann;

import PrivateMod.Logger;

public class Boolean {
    public static void main(String[] args) {
        Logger log = new Logger();
        Logger log2 = new Logger();
        //Ссылка log и log2 ссылаются на разные объекты, хоть они и одинаково звучат
        //Кажд раз выделяется новый кусок памяти на создание нового объекта
        boolean isTrue = (log.equals(log2));
        //Проверим ХЭШ-код созданных объектов
        int logHash = (log.hashCode());
        int log2Hash = (log2.hashCode());
        //Убедимся, что ХЭШ-код не совпадает, поэтому вывод FALSE
        System.out.println(isTrue);
        System.out.println(logHash);
        System.out.println(log2Hash);
    }
}/*
>>> false
    1163157884
    1956725890
*/