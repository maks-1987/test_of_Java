package Patterns.Behavioral.Command;

public class DBRunner {
    public static void main(String[] args) {
        DataBase database = new DataBase();

        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
/*>>>   Inserting record...
        Updating record...
        Reading record...
        Deleting record...
        */