package ss12_java_collection_framework.bai_tap.product_management.controller;

import ss12_java_collection_framework.bai_tap.product_management.service.ProductService;

import java.util.Scanner;

public class ProductList {
    //    Thêm sản phẩm
//Sửa thông tin sản phẩm theo id
//Xoá sản phẩm theo id
//Hiển thị danh sách sản phẩm
//Tìm kiếm sản phẩm theo tên
//Sắp xếp sản phẩm tăng dần, giảm dần theo giá
    private ProductService productService = new ProductService();

    public void productListMenu() {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("--------Quản lí sản phẩm--------- \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Xóa sản phẩm \n" +
                    "3. Sửa sản phẩm \n" +
                    "4. Hiển thị sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm \n" +
                    "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá \n" +
                    "0. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    productService.addNewProduct();
                    break;
                case "2":
                    productService.deleteProductByID();
                    break;
                case "3":
                    productService.editProduct();
                    break;
                case "4":
                    productService.dislayProduct();
                    break;
                case "5":
                    productService.searchProduct();
                    break;
                case "6":
                    productService.arrangeProduct();
                    break;
                case "0":
                    flag = false;
                    System.out.println("Thoát chương trình");
                default:
                    System.out.println("Bạn chọn không phải chức năng của chương trình");
            }
        } while (flag);
    }
}
