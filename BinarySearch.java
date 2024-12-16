import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
   // Array Declaration
   int size;
   int[] arr;
   BinarySearch() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of elements of array: ");
       this.size = sc.nextInt();
       // Ensure that the size is greater than 0 to avoid errors
       if (size <= 0) {
           System.out.println("Array size should be greater than 0.");
           System.exit(0);
       }
       this.arr = new int[size];
       System.out.println("Enter the elements of array:\n");
       for (int i = 0; i < size; i++) {
           this.arr[i] = sc.nextInt();
       }
       // Sort the array to ensure binary search works correctly
       Arrays.sort(arr);
       System.out.println("\nArray after sorting:");
       arrayDisplay();
   }
   // Array Display Function
   public void arrayDisplay() {
       System.out.print("Elements of the array are: ");
       for (int i = 0; i < size; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println("\n");
}
// Binary Search
public void binarySearch(int num) {
    int mid, st = 0, end = size - 1;
    while (st <= end) {
        mid = (st + end) / 2;
        // If num is found
        if (arr[mid] == num) {
            System.out.println("Number found at " + (mid + 1) + " position.");
            return;
        }
        // If num is greater, ignore the left half
        else if (arr[mid] < num) {
            st = mid + 1;
        }
        // If num is smaller, ignore the right half
        else {
            end = mid - 1;
        }
    }
    // If we reach here, element was not found
    System.out.println("Element not found in the array.");
}
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // Create an object of BinarySearch
    BinarySearch obj1 = new BinarySearch();
    obj1.arrayDisplay();
     // Ask for the number to search
     System.out.println("Enter the number you want to search: ");
     int num = sc.nextInt();
     // Perform binary search
     obj1.binarySearch(num);
     // Close the scanner object after use
     sc.close();
 }
}