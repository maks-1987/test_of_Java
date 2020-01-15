package Patterns.Behavioral.Command;

public class InsertCommand implements Command {
    DataBase database;

    InsertCommand(DataBase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }

}
