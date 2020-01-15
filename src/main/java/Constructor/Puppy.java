package Constructor;

public class Puppy{
    //Это конструктор и у него один параметр, name.
    private Puppy(String name){
        System.out.println("Передаваемое имя: " + name );
    }
    public static void main(String []args) {
        //Создание объекта myPuppy.
        Puppy myPuppy = new Puppy( "Багет" );
        Puppy myPuppy1 = new Puppy( "Багет" );

        System.out.println(myPuppy.equals(myPuppy1));//Сравнение по ссылке
        System.out.println(myPuppy==myPuppy1);
        System.out.println(myPuppy.hashCode());
        System.out.println(myPuppy1.hashCode());
        System.out.println(myPuppy instanceof Puppy);
    }
}/*
>>> Передаваемое имя: Багет
    Передаваемое имя: Багет1
    false
    false
    1163157884
    1956725890
    true
*/
