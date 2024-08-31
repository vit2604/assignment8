
package assignment7;

import static assignment7.Assignment7.deleteOddNumber;
import static assignment7.Assignment7.findMax2;
import static assignment7.Assignment7.importData;
import static assignment7.Assignment7.printData;
import java.util.Scanner;

public class Process {
    public static void menu() {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        int[] arrays = null;
        while (true) {
            System.out.println("1. Nhap mang so nguyen.");
            System.out.println("2. Xuat mang ra man hinh.");
            System.out.println("3. Tim gia tri lon thu 2 trong mang.");
            System.out.println("4. Xoa cac phan tu le ra khoi mang.");
            System.out.println("5. Thoat chuong trinh.");
            System.out.print("== Vui long nhap lua chon: ");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhap so phan tu trong mang: ");
                    int n = keyboard.nextInt();
                    arrays = new int[n];
                    importData(arrays);
                    break;
                case 2:
                    printData(arrays);
                    break;
                case 3:
                    System.out.println("Phan tu lon thu 2 trong mang la: " + findMax2(arrays));
                    break;
                case 4:
                    deleteOddNumber(arrays);
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le, vui long thu lai.");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
    

