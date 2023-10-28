package ss12_java_collection_framework.bai_tap.product_management.model;

public class Product implements Comparable<Product> {
    private int iD;
    private String productName;
    private int productPrice;

    public Product() {
    }

    public Product(int iD, String productName, int productPrice) {
        this.iD = iD;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product: " +
                "iD=" + iD +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice;
    }

    @Override
    public int compareTo(Product o) {
        return this.productPrice - (o.productPrice);
    }
}
