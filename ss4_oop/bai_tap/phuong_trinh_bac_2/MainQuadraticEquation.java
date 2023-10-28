package ss4_oop.bai_tap.phuong_trinh_bac_2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cho phương trình ax2 + bx + x = 0, nhập giá trị a");
        double a = Integer.parseInt(input.nextLine());
        System.out.println("Cho phương trình ax2 + bx + x = 0, nhập giá trị b");
        double b = Integer.parseInt(input.nextLine());
        System.out.println("Cho phương trình ax2 + bx + x = 0, nhập giá trị c");
        double c = Integer.parseInt(input.nextLine());
        QuadraticEquation result = new QuadraticEquation(a, b, c);
        double delta = result.getDiscriminant();
        if (delta >= 0) {
            System.out.println("Phương trình có 2 nghiệm là: ");
            System.out.println("x1=" + result.getRoot1());
            System.out.println("x2=" + result.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có 2 nghiệm bằng nhau là: ");
            System.out.println("x1=x2= " + (-b / (2 * a)));
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
