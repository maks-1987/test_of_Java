package Patterns.Behavioral.Command;

class Developer {
    Command insert;
    Command update;
    Command select;
    Command delete;

    Developer(Command insert, Command update,
              Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    void insertRecord() {
        insert.execute();
    }

    void updateRecord() {
        update.execute();
    }

    void selectRecord() {
        select.execute();
    }

    void deleteRecord() {
        delete.execute();
    }

}
