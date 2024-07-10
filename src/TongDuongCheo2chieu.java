import java.util.Scanner;

public class TongDuongCheo2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số chiều của ma trận vuông: ");
        int n = scanner.nextInt();
        double[][] matrix = new double[n][n];
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhập phần tử thứ [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextDouble();
            }
        }
        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += matrix[i][i];
        }
        System.out.println("Tổng các số ở đường chéo chính của ma trận là: " + tong);
    }
}