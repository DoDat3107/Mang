import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        int size;
        int[] array;
        int max;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Nhập size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước không vượt quá 20");
        } while (size > 20);

        array = new int[size];

        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập giá trị " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        max = array[0];

        for (int j = 1; j < array.length; j++) {
            if (array[j] > max)
                max = array[j];
        }

        System.out.println("Giá trị lớn nhất trong mảng là : " + max);
    }
}