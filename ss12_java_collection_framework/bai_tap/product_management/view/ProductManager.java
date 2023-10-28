package ss12_java_collection_framework.bai_tap.product_management.view;

import ss12_java_collection_framework.bai_tap.product_management.controller.ProductList;
import ss12_java_collection_framework.bai_tap.product_management.service.ProductService;

public class ProductManager {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        productList.productListMenu();
    }
}
