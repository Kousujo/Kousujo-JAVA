//Viết chương trình kiểm tra các phần tử của mảng cho trước có được sắp thứ tự tăng (giảm) hay không.
package baitap_coban;
public class Bai17 { 
    public int[] arr;

    public Bai17() {
        this.arr = new int[100];
    }

    public boolean isIncreasing(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return false; 
        }
    }
    return true; 
}

    public boolean isDecreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Bai17 a = new Bai17();
        int[] data = {64, 25, 12, 22, 11};
        if (a.isIncreasing(data)) {
            System.out.println("Mang tang dan.");
        } else if (a.isDecreasing(data)) {
            System.out.println("Mang giam dan.");
        } else {
            System.out.println("Mang chua duoc sap xep.");
        }
    }
}
