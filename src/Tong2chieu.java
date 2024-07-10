public class Tong2chieu {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 6, 4, 5},
                {4, 5, 9, 7, 5},
                {5, 9, 4, 6, 1}
        };
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tong = tong + arr[i][j];
            }
        }
        System.out.printf("Tổng các phần tử trong mảng là : " + tong);
    }
}
