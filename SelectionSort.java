import java.util.Scanner; 
public class SelectionSort { 
//Array Declaration 
int size; 
int[] arr; 
SelectionSort() { 
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
//Array Display Function  
public void arrayDisplay() { 
for (int i = 0; i < size; i++) { 
System.out.print(arr[i] + " "); 
} 
System.out.println("\n"); 
} 
//Selection Sort 
public void selectionSort() { 
for (int i = 0; i < size - 1; i++){ 
 int min_value = i; 
 for (int j = i + 1; j < size; j++){ 
 if (arr[j] < arr[min_value]){ 
 min_value = j;

 } 
 } 
 if(min_value != i){ 
 int temp = arr[min_value]; 
 arr[min_value] = arr[i]; 
 arr[i] = temp; 
 } 
 }  
} 
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in); 
SelectionSort obj1 = new SelectionSort(); 
System.out.println("Array before sort: "); 
obj1.arrayDisplay(); 
obj1.selectionSort(); 
System.out.println("Array after sort: "); 
obj1.arrayDisplay(); 
} 
} 
