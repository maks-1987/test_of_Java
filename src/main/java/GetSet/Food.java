package GetSet;
/**
 * Метод чтения ГЕТТЕР (от англ.- получатель) - спец метод, позволяющий получить
 * данные, доступ к которым напрямую ограничен. Это один из методов ООП, который
 * позволяет реализовать гибкий механизм инкапсуляции. В паре с Setter может ис-
 * пользоваться для организации свойств и методов в языках, где они не поддерживаются.
 */
public class Food {
    private int data;
    private boolean flag;

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    //Для булевых значений рекомендуется ставить префикс is-,
    //вместо get-
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
