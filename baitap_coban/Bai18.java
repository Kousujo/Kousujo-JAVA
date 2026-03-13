/*Viết chương trình tìm phần tử đầu tiên lớn nhất và nhỏ nhất trong mảng các số nguyên, hiển thị khoảng
cách giữa hai phần tử đó. Viết chương trình cho phép người dùng thực hiện các chức năng sau qua một
Menu:
- Nhập mảng số nguyên
- In mảng số nguyên ra màn hình
- Sắp xếp mảng tăng dần
- Sắp xếp mảng giảm dần
- Tìm 1 phần tử trong mảng
- Thêm 1 phần tử vào mảng
- Xoá 1 phần tử khỏi mảng */
package baitap_coban;
import java.util.Scanner;

class Bai18 { 
    private int[] arr;
    private int n;

    public void populateData(Scanner sc) {
        System.out.print("Nhap so luong phan tu n : ");
        this.n = sc.nextInt();
        this.arr = new int[n];
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.printf("Index %d : ",i);
            this.arr[i] = sc.nextInt();
        }
    }

    public void displayData() {
        System.out.print("Mang hien tai: [");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public void sortIncreasing() {
        for (int i = 1 ; i < arr.length ; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key ) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public void sortDecreasing() {
        for (int i = 1 ; i < arr.length ; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key ) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public boolean isSorted() {
        if (arr.length <= 1) return true;
        for (int i = 1 ; i < arr.length ; i++) {
            if (arr[i - 1] > arr[i]) return false;
        }
        return true;
    }

    public int linearSearch(int target) {
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public int searchElement(int target) {
        if (arr == null) return -2;
        if (isSorted()) {
            int low = 0, high = arr.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (target == arr[mid]) return mid;
                else if (target > arr[mid]) low = mid + 1;
                else high = mid - 1;
            }
            return -1;
        }
        else return linearSearch(target);
    }

    public void addElement(int newValue) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0 ; i < arr.length ; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = newValue; 
        arr = newArr; 
    }

    public void deleteElement(int deleteIndex) {
        deleteIndex = searchElement(deleteIndex);
        if (deleteIndex == -1) System.out.println("Khong tim thay phan tu can xoa!");
        else {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0 ; i < deleteIndex ; i++) {
                newArr[i] = arr[i];
            }
            for (int i = deleteIndex + 1 ; i < arr.length ; i++) {
                newArr[i - 1] = arr[i];
            }
            arr = newArr;
        }
    }

    public void distanceMaxMin() {
        if (arr == null || arr.length == 0) return;
    
        int indexMax = 0;
        int indexMin = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[indexMax]) indexMax = i;
            if (arr[i] < arr[indexMin]) indexMin = i;
        }
        
        int distance = Math.abs(indexMax - indexMin);
        System.out.printf("Max dau tien: %d (index %d)\n", arr[indexMax], indexMax);
        System.out.printf("Min dau tien: %d (index %d)\n", arr[indexMin], indexMin);
        System.out.println("Khoang cach index giua Max va Min: " + distance);
    }

    public void clearScreen() {
        for (int i = 0; i <= 50; i++) System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Bai18 program = new Bai18();

            System.out.println("=== KHOI TAO DU LIEU BAN DAU ===");
            program.populateData(sc);
            
            System.out.println("\n=== PHAN TICH DU LIEU ===");
            program.displayData();
            program.distanceMaxMin();

            int choice;
            do {
                System.out.println("\n================ MENU TUONG TAC ================");
                System.out.println("| 1. Nhap lai mang moi                         |");
                System.out.println("| 2. In mang hien tai                          |");
                System.out.println("| 3. Sap xep mang TANG dan                     |");
                System.out.println("| 4. Sap xep mang GIAM dan                     |");
                System.out.println("| 5. Tim mot phan tu                           |");
                System.out.println("| 6. Them mot phan tu                          |");
                System.out.println("| 7. Xoa mot phan tu                           |");
                System.out.println("| 0. Ket thuc chuong trinh                     |");
                System.out.println("================================================");
                System.out.print("Moi ban chon (0-7): ");

                try {
                    choice = sc.nextInt();
                    program.clearScreen();

                    switch (choice) {
                        case 1:
                            program.populateData(sc);
                            System.out.println("=========================");
                            program.distanceMaxMin();
                            break;
                        case 2:
                            program.displayData();
                            break;
                        case 3:
                            program.sortIncreasing();
                            System.out.println("Mang da duoc sap xep!");
                            System.out.println("=========================");
                            program.displayData();
                            break;
                        case 4:
                            program.sortDecreasing();
                            System.out.println("Mang da duoc sap xep!");
                            System.out.println("=========================");
                            program.displayData();
                            break;
                        case 5:
                            System.out.print("Nhap phan tu can tim: ");
                            int found = program.searchElement(sc.nextInt());
                            System.out.println("=========================");
                            if (found == -1) System.out.println("Khong tim thay phan tu!");
                            else System.out.println("Phan tu o vi tri : " + found);
                            break;
                        case 6:
                            System.out.print("Nhap phan tu muon them: ");
                            int add = sc.nextInt();
                            System.out.println("=========================");
                            program.addElement(add);
                            program.displayData();
                            program.distanceMaxMin();
                            break;
                        case 7:
                            System.out.print("Nhap phan tu muon xoa: ");
                            int del = sc.nextInt();
                            System.out.println("=========================");
                            program.deleteElement(del);
                            program.displayData();
                            program.distanceMaxMin();
                            break;
                        case 0:
                            System.out.println("=== CHUONG TRINH KET THUC ===");
                            break;
                        default:
                            System.out.println("Lua chon khong hop le!");
                            break;
                    }
                    if (choice != 0) {
                        System.out.println("\n\n[Bam Enter de tiep tuc...]");
                        sc.nextLine();
                        sc.nextLine();
                        program.clearScreen();
                    }
                } catch (Exception e) {
                    System.out.println("\nERROR: Chi duoc nhap so!");
                    System.out.println("\n\n[Bam Enter de tiep tuc...]");
                    sc.nextLine();
                    sc.nextLine();
                    program.clearScreen();
                    choice = -1;
                }
            } while (choice != 0); 
        }
    }
}
