import java.util.Scanner;

public class InsertionSort {

    int size;
    int[] arr;

    InsertionSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of array: ");
        this.size = sc.nextInt();
        this.arr = new int[size];
        System.out.println("Enter the elements of array:\n");
        for (int i = 0; i < size; i++) {
            this.arr[i] = sc.nextInt();
        }
        System.out.println("\n");
    }

    // Array Display Function
    public void arrayDisplay() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    // Insertion Sort
    public void insertionSort() {
        int i, j;
        for (i = 1; i < size; i++) {
            int x = arr[i];
            for (j = i - 1; j >= 0 && x < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = x;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        InsertionSort obj1 = new InsertionSort();
        System.out.println("Array before sort: ");
        obj1.arrayDisplay();
        obj1.insertionSort();
        System.out.println("Array after sort: ");
        obj1.arrayDisplay();
    }
}
