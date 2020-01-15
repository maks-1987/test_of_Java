package Patterns.Behavioral.Command;

public class SelectCommand implements Command {
    DataBase database;

    SelectCommand(DataBase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
