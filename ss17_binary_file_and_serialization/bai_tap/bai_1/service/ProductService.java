package ss17_binary_file_and_serialization.bai_tap.bai_1.service;

import ss17_binary_file_and_serialization.bai_tap.bai_1.model.Product;
import ss17_binary_file_and_serialization.bai_tap.bai_1.repository.ProductRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    private ProductRepository productRepository = new ProductRepository();

    @Override
    public void dislayProduct() {
        List<Product> list = productRepository.getProductList();
        for (Product s : list) {
            System.out.println(s);
        }
    }

    @Override
    public void addNewProduct() throws IOException {
        System.out.println("Nhập id sản phẩm: ");
        int idProduct = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double priceProduct = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất sản phẩm: ");
        String exportProduct = scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm: ");
        String describeProduct = scanner.nextLine();
        Product newProduct = new Product(idProduct, nameProduct, priceProduct, exportProduct, describeProduct);
        productRepository.addNewProduct(newProduct);
        System.out.println("Thêm mới sản phẩm" + newProduct.getName() + "thành công.");
    }

    @Override
    public void searchProduct() {
        int index = 0;
        boolean flag = false;
        System.out.println("Nhập tên sản phẩm bạn muốn tìm:");
        String search = scanner.nextLine();
        List<Product> productList = productRepository.getProductList();
        int sizeproduct = productList.size();
        for (int i = 0; i <= sizeproduct; i++) {
            if (search.equals(productList.get(i).getName())) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Thông tin sản phẩm bạn tìm kiếm là: ");
            System.out.println(productList.get(index));
            ;
        } else {
            System.out.println("Không tìm thấy sản phẩm");
        }
    }
}
