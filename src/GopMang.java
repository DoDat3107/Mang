import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int []arr1 = {2,3,5,43,6,7,5};
        int []arr2 = {4,68,6,4,3,6,7};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.print("Mảng arr3 sau khi gộp từ arr1 và arr2: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ",");
        }
        System.out.println();
    }
    }


