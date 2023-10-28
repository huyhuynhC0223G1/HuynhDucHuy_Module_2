package ss12_java_collection_framework.bai_tap.product_management.service;

import ss12_java_collection_framework.bai_tap.product_management.model.Product;

public interface IProductService {
    void dislayProduct();

    void addNewProduct();

    void editProduct();

    void deleteProductByID();

    void searchProduct();

    void arrangeProduct();
}
