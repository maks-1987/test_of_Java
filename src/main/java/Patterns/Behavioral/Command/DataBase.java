package Patterns.Behavioral.Command;

class DataBase {
    void insert() {
        System.out.println("Inserting record...");
    }

    void update() {
        System.out.println("Updating record...");
    }

    void select() {
        System.out.println("Reading record...");
    }

    void delete() {
        System.out.println("Deleting record...");
    }
}
