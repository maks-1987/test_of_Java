package Generic_Обобщения.Generic_Tkach;

import java.util.List;

public class TestingGenerics {
    public static void main(String[] args) {
        Product p = new Product();
        Container<Product> product = new Container<>();
        Container<Camera> camera = new Container<>();
        Container<Phone> phone = new Container<>();;
        //Container<String> c4 = new Container<>(); // Error:(10, 19) java: type argument java.lang.String is not within bounds of type-variable T

        Phone phone1 = new Phone("Nokia");
        product.add(phone1);
        Camera camera1 = new Camera("Nokia");
        product.add(camera1);

        //p.find(camera, new Camera()); // Error:(14, 16) java: incompatible types: Container<Camera> cannot be converted to java.util.List<Product>
        //p.find(cameraList, new Camera()); // Error:(14, 16) java: incompatible types: Container<Camera> cannot be converted to java.util.List<Product>

    }
}
