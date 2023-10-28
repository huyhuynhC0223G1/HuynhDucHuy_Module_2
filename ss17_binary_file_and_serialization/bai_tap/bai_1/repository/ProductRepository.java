package ss17_binary_file_and_serialization.bai_tap.bai_1.repository;

import ss17_binary_file_and_serialization.bai_tap.bai_1.common.Serialization;
import ss17_binary_file_and_serialization.bai_tap.bai_1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public final String PATH = "src/ss17_binary_file_and_serialization/bai_tap/Data/product.txt";
    List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getProductList() {
        products = Serialization.readDataFromFile(PATH);
        return products;
    }

    @Override
    public void addNewProduct(Product product) {
        products.add(product);
        Serialization.writeDataToFile(PATH, products);
    }

    @Override
    public boolean searchProduct() {
        return false;
    }
}
