package ss17_binary_file_and_serialization.bai_tap.bai_1.controller;

import ss17_binary_file_and_serialization.bai_tap.bai_1.service.ProductService;

import java.io.IOException;
import java.util.Scanner;

public class ProductController {
    private  ProductService productService = new ProductService();

    public void ProductMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        boolean flag =true;
        do {
            System.out.println("-------------Danh sách sản phẩm-----------\n" +
                    "1. Thêm mới sản phẩm\n" +
                    "2. Hiển thị sản phẩm\n" +
                    "3. Tìm kiếm sản phẩm\n" +
                    "0. thoát\n" +
                    "Mời bạn chọn chức năng: ");
            String choice = input.nextLine();
            switch (choice){
                case "1":
                    productService.addNewProduct();
                    break;
                case "2":
                    productService.dislayProduct();
                    break;
                case "3":
                    productService.searchProduct();
                    break;
                case "0":
                    flag = false;
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Bạn chọn không đúng chức năng");
            }
        }
        while (flag);
    }
}
