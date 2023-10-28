package ss17_binary_file_and_serialization.bai_tap.bai_1.repository;

import ss17_binary_file_and_serialization.bai_tap.bai_1.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getProductList();

    void addNewProduct(Product product);

    boolean searchProduct();
}
