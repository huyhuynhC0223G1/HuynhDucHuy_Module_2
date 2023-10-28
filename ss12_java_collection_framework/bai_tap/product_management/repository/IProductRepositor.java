package ss12_java_collection_framework.bai_tap.product_management.repository;

import ss12_java_collection_framework.bai_tap.product_management.model.Product;

import java.util.List;

public interface IProductRepositor {
    List<Product> getProductList();

    boolean editProductByID(int id, Product product);

    void addNewProduct(Product product);

    boolean deleteProduct(double price);

    boolean searchProductByName(String name);

    boolean arrangeProductByPrice(int price);
}
