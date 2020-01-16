package Generic_Обобщения.Generic_Tkach;

import java.util.List;

class Product {
    String name;
    int price;
    boolean isSameProduct;
    // будет "типа" сравнивать полученный Продукт из списка Продуктов
    boolean find(List<? extends Product> all, Product p) {
        for (Product product : all) {
            if (product.isSameProduct(p)) return true;
        }
        return false;
    }

    boolean isSameProduct(Product p) {
        return isSameProduct;
    }
}
