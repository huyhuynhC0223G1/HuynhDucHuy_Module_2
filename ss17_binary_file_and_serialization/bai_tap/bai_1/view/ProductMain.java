package ss17_binary_file_and_serialization.bai_tap.bai_1.view;

import ss17_binary_file_and_serialization.bai_tap.bai_1.controller.ProductController;

import java.io.IOException;

public class ProductMain {
    public static void main(String[] args) throws IOException {
        ProductController productController = new ProductController();
        productController.ProductMenu();
    }
}
