import java.util.Scanner;

public class LinearSearch {
    // Array Declaration
    int size;
    int[] arr;

    // Constructor
    LinearSearch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array: ");
        this.size = sc.nextInt();
        this.arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            this.arr[i] = sc.nextInt();
        }
        System.out.println();
    }

    // Array Display Function
    public void arrayDisplay() {
        System.out.print("Elements of the array are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    // Linear Search Function
    public void linearSearch(int num) {
        int flag = 0, index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = 1;
                index = i;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Element found at " + (index + 1) + " position");
        } else {
            System.out.println("Element not found in the array");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinearSearch obj1 = new LinearSearch();
        obj1.arrayDisplay();
        System.out.println("Enter the number you want to search: ");
        int num = sc.nextInt();
        obj1.linearSearch(num);
    }
}
