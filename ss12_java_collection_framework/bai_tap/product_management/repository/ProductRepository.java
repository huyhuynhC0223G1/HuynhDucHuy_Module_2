package ss12_java_collection_framework.bai_tap.product_management.repository;

import ss12_java_collection_framework.bai_tap.product_management.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepositor {
    public static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Bút bi", 3000));
        products.add(new Product(2, "Bút lông", 12000));
        products.add(new Product(3, "Bút chì", 5000));
    }

    @Override
    public List<Product> getProductList() {
        return products;
    }

    @Override
    public boolean editProductByID(int id, Product product) {
        products.add(product);
        return false;
    }

    @Override
    public void addNewProduct(Product product) {
        products.add(product);
    }

    @Override
    public boolean deleteProduct(double price) {
        return false;
    }

    @Override
    public boolean searchProductByName(String name) {
        return false;
    }

    @Override
    public boolean arrangeProductByPrice(int price) {
        return false;
    }
}
