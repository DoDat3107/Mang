import java.util.Scanner;

public class demKyTu {
    public static void main(String[] args) {
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập chuỗi muốn kiểm tra : ");
        String nh = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        System.out.printf("Nhập ký tự cần kiểm tra : ");
        char kyTu = sc1.next().charAt(0);
        for (int i = 0; i < nh.length(); i++) {
            if (nh.charAt(i) == kyTu) {
                dem++;
            }
        }
        System.out.println("Tổng số ký tự trong chuỗi là : "+ nh.length() );
        System.out.println("Số lần xuất hiện của ký tự '" + kyTu + "' trong chuỗi là: " + dem);
    }

}
