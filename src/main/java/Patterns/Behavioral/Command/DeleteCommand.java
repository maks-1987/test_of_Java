package Patterns.Behavioral.Command;

public class DeleteCommand implements Command {
    DataBase database;

    DeleteCommand(DataBase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
