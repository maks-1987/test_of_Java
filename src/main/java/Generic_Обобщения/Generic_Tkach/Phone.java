package Generic_Обобщения.Generic_Tkach;

class Phone extends Product {
    String model;

    Phone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
