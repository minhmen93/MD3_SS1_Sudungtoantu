package rikkei.Academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width; // Khai báo biến chiều rộng
        float height; // Khai báo biến chiều cao
        Scanner scanner = new Scanner(System.in); // Khai báo đối tượng Scanner để thực hiện các chức năng nhap liệu trong JAVA CORE
        System.out.println("Enter width: ");
        width= scanner.nextFloat(); // nhập chiều rộng
        System.out.println("Enter height: ");
        height= scanner.nextFloat(); // nhap chiều cao
        float area = width*height; // khai báo biến area đồng thời tính diện tích
        System.out.println("Area is "+area); // In ra kết quả tính diện tích

    }
}
