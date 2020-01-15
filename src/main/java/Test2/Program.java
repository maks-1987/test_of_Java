package Test2;

class Base {
    String name = "Base";
    String getName() {
        return name;
    }
}

class Sub extends Base {
    String name = "Sub";
    String getName() {
        return name;
    }
}

class Program {
    public static void main(String[] args) {
        Sub s = new Sub();
        Base b = s;
        System.out.println(b.name);
    }
}

// --> "Base"
