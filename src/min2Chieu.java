public class min2Chieu {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 6, 4, 5},
                {4, 5, 9, 7, 5},
                {5, 9, 4, 6, 1}
        };
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.printf("Số nhỏ nhất trong mảng 2 chiều là: " + min);

    }
}
