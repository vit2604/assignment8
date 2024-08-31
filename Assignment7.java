package assignment7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Assignment7 {

    public static int[] importData(int[] mangsothuc) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < mangsothuc.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            mangsothuc[i] = keyboard.nextInt();
        }
        return mangsothuc;
    }

    public static void printData(int[] mangsothuc) {
        System.out.println("Mang vua nhap la: " + Arrays.toString(mangsothuc));
    }

    public static int findMax2(int[] mangsothuc) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < mangsothuc.length; i++) {
            if (mangsothuc[i] > max1) {
                max2 = max1;
                max1 = mangsothuc[i];
            } else if (mangsothuc[i] > max2 && mangsothuc[i] < max1) {
                max2 = mangsothuc[i];
            }
        }
        return max2;
    }

    public static void deleteOddNumber(int[] mangsothuc) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < mangsothuc.length; i++) {
            if (mangsothuc[i] % 2 == 0) {
                list.add(mangsothuc[i]);
            }
        }
        System.out.println("Mang sau khi xoa cac so le la: " + list);
    }
}

    
