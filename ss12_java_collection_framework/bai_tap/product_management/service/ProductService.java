package ss12_java_collection_framework.bai_tap.product_management.service;

import ss12_java_collection_framework.bai_tap.product_management.model.Product;
import ss12_java_collection_framework.bai_tap.product_management.repository.ProductRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    private ProductRepository productRepository = new ProductRepository();
    int size = productRepository.getProductList().size();
    boolean flag = false;
    int index = 0;

    @Override
    public void dislayProduct() {
        List<Product> productList = productRepository.getProductList();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void addNewProduct() {
        System.out.println("Nhập mã sản phẩm:");
        int productID = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm:");
        String productName = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        int productPrice = Integer.parseInt(scanner.nextLine());
        Product newProduct = new Product(productID, productName, productPrice);
        productRepository.addNewProduct(newProduct);
        System.out.println("Thêm mới thành công sản phẩm: " + newProduct.getProductName());
    }

    @Override
    public void editProduct() {
        this.dislayProduct();
        System.out.println("Nhập mã sản phẩm muốn sửa:");
        int productEditID = Integer.parseInt(scanner.nextLine());
        List<Product> productList = ProductRepository.products;
        for (int i = 0; i <= size; i++) {
            if (productEditID == productList.get(i).getiD()) {
                flag = true;
            }
            if (flag) {
                Product product = productList.get(i);
                System.out.println("Nhập tên sản phẩm muốn sửa:");
                String productEditName = scanner.nextLine();
                product.setProductName(productEditName);
                System.out.println("Nhập giá sản phẩm muốn sửa:");
                int productEditPrice = Integer.parseInt(scanner.nextLine());
                product.setProductPrice(productEditPrice);
                productRepository.editProductByID(productEditID,product);
                break;
            } else {
                System.out.println("Không tìm thấy sản phẩm cần sửa");
                break;
            }
        }
        this.dislayProduct();
    }

    @Override
    public void deleteProductByID() {
        this.dislayProduct();
        System.out.println("Nhập mã sản phẩm bạn muốn xóa: ");
        int iDProductDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= size; i++) {
            if (iDProductDelete == ProductRepository.products.get(i).getiD()) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            ProductRepository.products.remove(index);
            System.out.println("Xoá sản phẩm thành công");
        } else {
            System.out.println("Không tìm thấy sản phẩm");
        }
        this.dislayProduct();
    }

    @Override
    public void searchProduct() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
        String searchNameProduct = scanner.nextLine();
        for (int i = 0; i <= size; i++) {
            if (searchNameProduct == ProductRepository.products.get(i).getProductName()) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            ProductRepository.products.get(index);
            System.out.println("Thông tin sản phẩm bạn tìm kiếm là: ");
            this.dislayProduct();
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }

    @Override
    public void arrangeProduct() {
        System.out.println("Bạn muốn sắp xếp:\n" +
                "1. Tăng dần\n" +
                "2. Giảm dần\n" +
                "Mời bạn chọn: ");
        int a = Integer.parseInt(scanner.nextLine());
        if (a == 1) {
            sortUpAscending();
        } else if (a == 2) {
            sortDescending();
        }
    }

    public void sortDescending() {
        List<Product> productList = productRepository.getProductList();
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getProductPrice() > o2.getProductPrice()) {
                    return -1;
                } else if (o1.getProductPrice() < o2.getProductPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        productList.forEach(e -> System.out.println(e));
    }

    public void sortUpAscending() {
        List<Product> productList = productRepository.getProductList();
        Collections.sort(productList);
        productList.forEach(e -> System.out.println(e));
    }
}

