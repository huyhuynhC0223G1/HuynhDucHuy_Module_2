package ss17_binary_file_and_serialization.bai_tap.bai_1.service;

import java.io.IOException;

public interface IProductService {
    void dislayProduct();

    void addNewProduct() throws IOException;

    void searchProduct();
}
