package Enum.RandomExmpl;

/**
 * В классе AskME создается экземпляр q, класса Question (и в этом классе
 * сразу создается экземпляр Random-класса rand). Далее вызываем метод
 * answer(q.ask()), в нем вызываем метод ask() через переменную q. В этом
 * методе объявляется перем prob и ей присваивается значение 100*rand(случайное
 * число). Тут же prob проверяет цикл if-else. Цикл возвращает Answers(например - NO).
 * No передается обратно в метод answer(q.ask()), который теперь принял
 * нужное значение (Answers result), далее выполнится цикл switch-case
 * для значения NO: System.out.println("Нет");
 */
enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}
