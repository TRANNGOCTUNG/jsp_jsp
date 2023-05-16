package test;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<Product>();
        products.add((new Product("Iphone X",999.99)));
        products.add((new Product("Samsung galaxy S9",899.99)));
        products.add((new Product("Google pixel 2",799.99)));
        return products;
    }
}
