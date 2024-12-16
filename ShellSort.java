import java.util.Scanner; 
public class ShellSort { 
//Array Declaration 
int size; 
int[] arr; 
ShellSort() { 
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
//Shell Sort 
public void shellSort() { 
for (int i = size/2; i > 0; i=i/2){ 
 int flag = 0; 
 while (flag == 0){ 
 flag = 1; 
 for(int j = 0; j < size - i; j++){ 
 if (arr[j] > arr[j+1]){ 
 int temp = arr[j];
 arr[j] = arr[j+1]; 
 arr[j+1] = temp; 
 flag = 0; 
 } 
 } 
 } 
 } 
} 
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in); 
ShellSort obj1 = new ShellSort(); 
System.out.println("Array before sort: "); 
obj1.arrayDisplay(); 
obj1.shellSort(); 
System.out.println("Array after sort: "); 
obj1.arrayDisplay(); 
} 
} 
