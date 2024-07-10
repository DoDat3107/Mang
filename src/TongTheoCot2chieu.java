import java.util.Scanner;

public class TongTheoCot2chieu {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 6, 4, 5},
                {4, 5, 9, 7, 5},
                {5, 9, 4, 6, 1}
        };
        int tong = 0;
        Scanner n = new Scanner(System.in);
        System.out.printf("Nhập số cột muốn tính tổng : ");
        int cot = n.nextInt();
        if (cot > arr.length+1) {
            System.out.printf("Số nhập vào lớn hơn cột hiện có trong mảng");
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j == cot) {
                        tong = tong + arr[i][j];
                    }
                }
            }
            System.out.printf("Tổng của cột " + cot + " là : " + tong);
        }
    }
}
