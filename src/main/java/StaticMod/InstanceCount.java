package StaticMod;
/**
 * Статич. методы не могут обращаться к нестатич. методам или нестатич. переменным.
 * В обычные методы передается (неявно) ссылка на объект, у которого этот метод
 * вызывают. Переменная, которая хранит эту ссылку наз-ся this. В статич. методе
 * вместо ссылки на объект передается null. Поэтому он не может обращаться к не-
 * статич. переменным и методам.
 * Статич. метод вызывается до того, как будут создаваться какие-либо объекты.
 */
public class InstanceCount {
    private static int numInstances = 0; //без статик полей не работает
    protected static int getCount() {
        return numInstances;
    }
    private static void addInstance() {
        numInstances++;
    }
    InstanceCount() {
        InstanceCount.addInstance();
    }
    public static void main(String[] arguments) {
        System.out.println("Начиная с " +
                InstanceCount.getCount() + " экземпляра");
        for (int i = 0; i < 500; i++){
            new InstanceCount();
        }
        System.out.println("Создано " +
                InstanceCount.getCount() + " экземпляров");
    }
}
