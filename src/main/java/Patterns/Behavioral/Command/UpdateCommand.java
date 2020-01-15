package Patterns.Behavioral.Command;

public class UpdateCommand implements Command {
    DataBase database;

    UpdateCommand(DataBase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
