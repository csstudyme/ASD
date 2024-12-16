Linear Search

package Searching; 
import java.util.Scanner; 
public class LinearSearch { 
//Array Declaration 
int size; 
int[] arr; 
LinearSearch() { 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the number of elements of array: "); 
this.size = sc.nextInt(); 
this.arr = new int[size]; 
System.out.println("Enter the elements of array:\n"); 
for (int i = 0; i < size; i++) { 
this.arr[i] = sc.nextInt(); 
} 
System.out.println("\n\n"); 
} 
//Array Display Function  
public void arrayDisplay() { 
System.out.print("Elements of the array are: "); 
for (int i = 0; i < size; i++) { 
System.out.print(arr[i] + " "); 
} 
System.out.println("\n\n"); 
} 
//Linear Search

public void linearSearch(int num) { 
int flag=0,index=1; 
for (int i = 0; i < arr.length; i++) { 
if(arr[i] == num) { 
flag = 1; 
index += i; 
break;  
} 
} 
if (flag == 1) { 
System.out.println("Element found at " + index + " position"); 
} 
else { 
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


*************************************************************************************************************

Binary Search

package Searching; 
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
 System.out.println("Number found at " + (mid + 1) + " position.");  return; 
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

 ****************************************************************************************
Bubble Sort
 
package Sorting; 
import java.util.Scanner; 
public class BubbleSort { 
//Array Declaration 
int size; 
int[] arr; 
BubbleSort() { 
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
//Bubble Sort 
public void bubbleSort() { 
for (int i = 0; i < size; i++){ 
 for(int j = 0; j < size-i-1; j++){
 if (arr[j]>arr[j+1]){ 
 int temp=arr[j]; 
 arr[j]=arr[j+1]; 
 arr[j+1]=temp; 
 } 
 } 
 } 
} 
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in); 
BubbleSort obj1 = new BubbleSort(); 
System.out.println("Array before sort: "); 
obj1.arrayDisplay(); 
obj1.bubbleSort(); 
System.out.println("Array after sort: "); 
obj1.arrayDisplay(); 
} 
} 

**************************************************************************

Selection Sort 

package Sorting; 
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

*********************************************************************************************
Insertion Sort

 
package Sorting; 
import java.util.Scanner; 
public class InsertionSort { 
//Array Declaration 
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
//Array Display Function  
public void arrayDisplay() { 
for (int i = 0; i < size; i++) { 
System.out.print(arr[i] + " "); 
} 
System.out.println("\n"); 
} 
//Insertion Sort 
public void insertionSort() { 
int i,j; 
for(i = 1; i < size; i++){
 int x=arr[i]; 
 for(j = i-1;j >= 0 && x < arr[j]; j--){ 
 arr[j+1]=arr[j]; 
 } 
 arr[j+1]=x; 
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

*********************************************************************************
Shell Sort 


package Sorting; 
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

*********************************************************************************************
StackByArray 
package Stack; 
import java.util.Scanner;

public class StackByArray {
    int[] arr = new int[100];
    int top = -1, size = 100;

    public void push(Scanner sc) {
        if (top == size - 1) {
            System.out.println("Stack overflow.\n\n");
            return;
        }
        System.out.print("Enter the number you want to push: ");
        if (sc.hasNextInt()) {
            int val = sc.nextInt();
            top++;
            arr[top] = val;
            System.out.println("Item pushed successfully.\n\n");
        } else {
            System.out.println("Invalid input! Please enter an integer.\n");
            sc.next(); 
        }
    }

    public void pop() {
        if (top <= -1) {
            System.out.println("Stack underflow.\n\n");
            return;
        }
        System.out.println(arr[top] + " popped.\n\n");
        top--;
    }

    public void disp() {
        if (top <= -1) {
            System.out.println("Stack is empty.\n\n");
            return;
        }
        System.out.println("Stack Elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("\n\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackByArray s1 = new StackByArray();

        while (true) {
            System.out.println("Operations: \n1) Push\n2) Pop\n3) Display\n4) Exit\n");
            System.out.print("Enter the operation: ");

            if (sc.hasNextInt()) {
                int opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        s1.push(sc); 
                        break;

                    case 2:
                        s1.pop();
                        break;

                    case 3:
                        s1.disp();
                        break;

                    case 4:
                        System.out.println("Exiting");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Option.\nTry Again.\n");
                        break;
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.\n");
                sc.next(); 
            }
        }
    }
}

************************************************************************************
StackByLinkedList 

package Stack; 
public class StackByLinkedList { 
 Node head; 
 class Node { 
 int data; 
 Node next; 
 Node (int data) { 
 this.data = data; 
 this.next = null; 
 } 
 } 
 //Add by the first 
 public void addFirst(int data){ 
 Node newNode = new Node(data); 
 if (head == null) { 
 head = newNode; 
 return; 
 } 
 newNode.next = head; 
 head = newNode; 
 } 
 public void addLast(int data) { 
 Node newNode = new Node(data); 
 if (head == null) { 
 head = newNode; 
 return; 
 } 
 Node currNode = head; 
 while (currNode.next != null) { 
 currNode = currNode.next;  
 }

 currNode.next = newNode;  
 } 
 public void printList() { 
 if (head == null) { 
 System.out.println("List is empty"); 
 return; 
 } 
 Node currNode = head; 
 while (currNode != null) { 
 System.out.print(currNode.data + " -> "); 
 currNode = currNode.next;  
 }  
 System.out.println("NULL"); 
 } 
 public void deleteFirst() { 
 if (head == null) { 
 System.out.println("List is empty"); 
 return; 
 } 
 head = head.next; 
 } 
 public void deleteLast() { 
 if (head == null) { 
 System.out.println("List is empty"); 
 return; 
 } 
 Node currNode = head; 
 Node prNode = currNode; 
 while (currNode.next != null) { 
 prNode = currNode;

currNode = currNode.next; 
 } 
 prNode.next = null; 
 } 
 public static void main(String[] args) { 
 StackByLinkedList list = new StackByLinkedList(); 
 list.addLast(3); 
 list.printList(); 
 list.addLast(4); 
 list.printList(); 
 list.addFirst(2); 
 list.printList(); 
 list.addFirst(1); 
 list.printList(); 
 list.addFirst(1); 
 list.printList(); 
 list.deleteFirst(); 
 list.printList(); 
 list.deleteLast(); 
 list.printList(); 
 list.printList(); 
 } 
}

*************************************************************************************
 
QueueByLinkedList 


Aim: Write a program to implement Queue using Linked List


package Ads;

import java.util.Scanner; 
public class QueueByLinkedList { 
 Node head = null; 
 class Node { 
 int data; 
 Node next; 
 public Node(int data) { 
 this.data = data; 
 this.next = null; 
 } 
 } 
 //Adding the element at the last 
 public void addLast() { 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter the number you want to add to queue: ");  int data = sc.nextInt(); 
 Node newNode = new Node(data); 
 if(head == null) { 
 head = newNode; 
 System.out.println("Inserted.\n"); 
 return; 
 } 
 Node curNode = head; 
 while(curNode.next!=null){
 curNode = curNode.next; 
 } 
 curNode.next = newNode; 
 System.out.println("Inserted.\n"); 
 } 
 //Deleting the element 
 public void deleteNode() {  
 if (head == null) { 
 System.out.println("queue is empty.\n"); 
 return; 
 } 
  
 System.out.println("Deleted node with value: " + head.data); 
 head = head.next; 
 } 
  
 //Displaying the List 
 public void dispLL() { 
 if(head == null) { 
 System.out.println("queue is empty.\n"); 
 return; 
 } 
 Node curNode = head; 
 System.out.println("front -> ") ;
 while (curNode != null) { 
 System.out.print(curNode.data + " -> ");  
 curNode = curNode.next;  
 } 
 System.out.println("null\n"); 
 } 
  
 public static void main(String[] args) { 
 QueueByLinkedList ll = new QueueByLinkedList();

 while (1 != 0) { 
 Scanner sc = new Scanner(System.in); 
 System.out.print("1) enqueue\n2) dequeue\n3) Display\n4) Exit\n\nEnter your  option (1,2,3,4): "); 
 int opt = sc.nextInt(); 
 switch (opt) { 
 case 1: 
 ll.addLast(); 
 continue; 
  
 case 2: 
 ll.deleteNode();  
 continue; 
 case 3: 
 ll.dispLL(); 
 continue; 
 case 4: 
 break; 
 default: 
 System.out.println("Invalid option."); 
 continue; 
 } 
 } 
  
 } 
}

**************************************************************************************************

LinkedList 

Aim: Write a program to implement Functions on Linked List (Creation, Deletion, Addition  of Node, Searching, Traversal) 

package LinkedList; 
import java.util.Scanner; 
public class SinglyLinkedList { 
 Node head = null; 
 class Node { 
 int data; 
 Node next; 
 public Node(int data) { 
 this.data = data; 
 this.next = null; 
 } 
 } 
  
 //Adding the element at the first 
 public void addFirst() { 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter the number you want to add: "); 
 int data = sc.nextInt(); 
 Node newNode = new Node(data); 
 if(head == null) { 
 head = newNode; 
 System.out.println("Inserted.\n"); 
 return; 
 } 
 newNode.next = head; 
 head = newNode; 
 System.out.println("Inserted.\n");
 } 
 //Adding the element at the last 
 public void addLast() { 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter the number you want to add: "); 
 int data = sc.nextInt(); 
 Node newNode = new Node(data); 
 if(head == null) { 
 head = newNode; 
 System.out.println("Inserted.\n"); 
 return; 
 } 
 Node curNode = head; 
 while(curNode.next!=null){ 
 curNode = curNode.next; 
 } 
 curNode.next = newNode; 
 System.out.println("Inserted.\n"); 
 } 
 //Deleting the element 
 public void deleteNode() { 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter the number you want to delete: "); 
 int data = sc.nextInt(); 
  
 if (head == null) { 
 System.out.println("List is empty.\n"); 
 return; 
 } 
  
 Node curNode = head; 
 Node prNode = null; 
 
 // If the deleting node is the head 
 if (curNode != null && curNode.data == data) { 
 head = curNode.next; 
 System.out.println("Deleted head node with value: " + data); 
 return; 
 } 
 while (curNode != null && curNode.data != data) { 
 prNode = curNode; 
 curNode = curNode.next; 
 } 
  
 // If the node was not found 
 if (curNode == null) { 
 System.out.println("Node with value " + data + " not found.\n");  return; 
 } 
  
 prNode.next = curNode.next; 
 System.out.println("Deleted node with value: " + data); 
 } 
  
 //Displaying the List 
 public void dispLL() { 
 if(head == null) { 
 System.out.println("List is empty.\n"); 
 return; 
 } 
 Node curNode = head; 
  
 System.out.print("head -> "); 
 while (curNode != null) { 
 System.out.print(curNode.data + " -> ");  
 curNode = curNode.next;  
 } 
 System.out.print("null\n"); 
 System.out.println("Traversal Complete."); 
 }
//Searching for the element 
 public void searchLL(){ 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter the number you want to search: "); 
 int data = sc.nextInt(); 
 int count = 0; 
 if(head == null) { 
 System.out.println("List is empty.\n"); 
 return; 
 } 
 Node crNode = head; 
 while(crNode != null){ 
 if(crNode.data == data) { 
 break; 
 } 
 count++; 
 crNode = crNode.next; 
 } 
 if (crNode == null) { 
 System.out.println("Element not found.\n"); 
 } 
 else { 
 System.out.println("Element found at the " + count + " position.\n");  } 
 } 
 public static void main(String[] args) { 
 SinglyLinkedList ll = new SinglyLinkedList(); 
 while (1 != 0) { 
 Scanner sc = new Scanner(System.in); 
 System.out.print("1) Add First\n2) Add Last\n3) Delete\n4) Search\n5) Display\n6)  Exit\n\nEnter your option (1,2,3,4,5): "); 
 int opt = sc.nextInt();
 switch (opt) { 
 case 1: 
 ll.addFirst(); 
 continue; 
  
 case 2: 
 ll.addLast();  
 continue; 
 case 3: 
 ll.deleteNode(); 
 continue; 
 case 4: 
 ll.searchLL(); 
 continue; 
 case 5: 
 ll.dispLL(); 
 continue; 
 case 6: 
 break; 
 default: 
 System.out.println("Invalid option."); 
 continue; 
 } 
 } 
  
 } 
}

***************************************************************************************************
InfixToPostFix  using stack

package Stack;
import java.util.Scanner; 
public class InfixToPostfix { 
    // Stack to hold operators 
    char[] arr = new char[100]; 
    int top = -1, size = 100; 
    
    // Push Function 
    public void push(char val) { 
        if (top == size - 1) { 
            System.out.println("Stack overflow.\n\n"); 
            return; 
        } 
        top++; 
        arr[top] = val; 
    } 
    
    // Pop Function 
    public void pop() { 
        if (top <= -1) { 
            System.out.println("Stack underflow.\n\n"); 
            return; 
        } 
        top--; 
    } 
    
    // Check Precedence of Operators 
    public int checkPrec(char val) { 
        switch (val) { 
            case '^': 
                return 5;
            case '/': 
                return 4; 
            case '*': 
                return 3; 
            case '+': 
                return 2; 
            case '-': 
                return 1; 
            default: 
                return -1; 
        } 
    } 
    
    // Main function to perform Infix to Postfix conversion 
    public static void main(String[] args) { 
        InfixToPostfix obj = new InfixToPostfix(); 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the expression:"); 
        String str = sc.nextLine(); 
        int index = 0; 
        String expString = ""; 
        
        while (index < str.length()) { 
            char strChar = str.charAt(index); 
            
            // If operand, add it to the output 
            if (strChar >= '0' && strChar <= '9') { 
                expString += strChar; 
            } 
            // If '(', push it to the stack 
            else if (strChar == '(') { 
                obj.push(strChar); 
            } 
            // If ')', pop from stack to output until '(' is found 
            else if (strChar == ')') { 
                while (obj.arr[obj.top] != '(') { 
                    expString += obj.arr[obj.top]; 
                    obj.pop();
                } 
                obj.pop(); // Pop the '(' 
            } 
            // If operator, handle precedence 
            else { 
                // While the precedence of the operator on top of the stack is greater than or equal to the current operator 
                while (obj.top > -1 && obj.checkPrec(obj.arr[obj.top]) >= obj.checkPrec(strChar)) {  
                    expString += obj.arr[obj.top]; 
                    obj.pop(); 
                } 
                obj.push(strChar); // Push the current operator to the stack  
            } 
            index++; 
        } 
        
        // Pop all remaining operators from the stack 
        while (obj.top != -1) { 
            expString += obj.arr[obj.top]; 
            obj.pop(); 
        } 
        System.out.println("The postfix expression is: " + expString); 
    } 
}

***********************************************************************************


PostFix 

Aim: Write a program to evaluate the Postfix expression using Stack 

package Ads;

import java.util.Scanner; 
import java.util.Stack; 
public class PostFix { 
 int[] arr = new int[100]; 
 int top = -1, size = 100; 
 // Push function for stack 
 public void push(int val) { 
 if (top == size - 1) { 
 System.out.println("Stack overflow.\n\n"); 
 return; 
 } 
 top++; 
 arr[top] = val; 
 } 
 // Pop function for stack 
 public int pop() { 
 if (top <= -1) { 
 System.out.println("Stack underflow.\n\n"); 
 return -1; 
 } 
 int val = arr[top]; 
 top--; 
 return val; 
 } 
 // Method to evaluate value of a postfix expression 
 public int evaluatePostfix(String exp) {
// Scan all characters one by one 
 for (int i = 0; i < exp.length(); i++) { 
 char c = exp.charAt(i); 
 // If the scanned character is an operand 
 // (number here), push it to the stack. 
 if (Character.isDigit(c)) 
 push(c - '0'); 
 // If the scanned character is an operator, pop 
 // two elements from stack apply the operator 
 else { 
 int val1 = pop(); 
 int val2 = pop(); 
 switch (c) { 
 case '+': 
 push(val2 + val1); 
 break; 
 case '-': 
 push(val2 - val1); 
 break; 
 case '/': 
 push(val2 / val1); 
 break; 
 case '*': 
 push(val2 * val1); 
 break; 
 } 
 } 
 } 
 return pop(); 
 } 
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 PostFix obj = new PostFix(); 
 System.out.println("Enter the postfix expression:"); 
 String expression = sc.nextLine();

 int result = obj.evaluatePostfix(expression); 
 System.out.println("The result of the postfix expression is: " + result);  } 
} 

**************************************************************************************
BalancingParentheses 

Aim: Write a program for balancing the parentheses using Stack 

package Stack; 
import java.util.Scanner; 
public class BalancingParenthesis { 
 char[] arr = new char[100]; 
 int top = -1, size = 100; 
 //Push Function 
 public void push(char val) { 
 if (top == size-1) { 
 System.out.println("Stack overflow.\n\n"); 
 return; 
 } 
 top++; 
 arr[top] = val; 
 } 
 //Pop Function 
 public void pop() { 
 if (top <= -1) { 
 System.out.println("Stack underflow.\n\n"); 
 return; 
 } 
 top--;  
 } 
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 BalancingParenthesis b1 = new BalancingParenthesis();
 System.out.println("Enter the expression to check: "); 
 String str = sc.nextLine(); 
 sc.close(); 
 char[] charArray = str.toCharArray(); 
 for (int i=0; i<charArray.length; i++) { 
 if (charArray[i] == '{' || charArray[i] == '[' || charArray[i] == '(') {  b1.push(charArray[i]);  
 } 
 else if (charArray[i] == '}' || charArray[i] == ']' || charArray[i] == ')') {  b1.pop(); 
 } 
 } 
 if (b1.top > -1) { 
 System.out.println("The expression is not balanced."); 
 } 
 else { 
 System.out.println("The expression is balanced."); 
 } 
 }  
} 


output :
Enter the expression to check: 
[()]()[()]
The expression is balanced.

*********************************************************************************************
CircularQueue 

Aim: Write a program to implement Circular Queue 

package Queue; 
import java.util.Scanner;  
class CircularQueue {  
 private int[] queue;  
 private int front, rear, size, capacity;  
 public CircularQueue(int capacity) {  
 this.capacity = capacity;  
 queue = new int[capacity];  
 front = -1;  
 rear = -1;  
 size = 0;  
 } 
 public boolean isEmpty() {  
 return size == 0;  
 } 
 public boolean isFull() {  
 return size == capacity;  
 } 
 public void enqueue(int value) {  
 if (isFull()) {  
 System.out.println("Queue is full. Cannot enqueue " + value);  
 return;  
 }  
 if (front == -1) {  
 front = 0;  
 }  
 rear = (rear + 1) % capacity;  
 queue[rear] = value;  
 size++;  
 System.out.println(value + " enqueued.");  
 } 
 public int dequeue() {  
 if (isEmpty()) {  
 System.out.println("Queue is empty. Cannot dequeue.");  
 return -1;  
 }  
 int value = queue[front];  
 front = (front + 1) % capacity;  
 size--;  
 return value;  
 }  
 public int peek() {  
 if (isEmpty()) {  
 System.out.println("Queue is empty. No front element.");  
 return -1;  
 }  
 return queue[front];  
 }  
 public void display() {  
 if (isEmpty()) {  
 System.out.println("Queue is empty.");  
 return;  
 }  
 System.out.print("Queue elements: ");  
 for (int i = 0; i < size; i++) {  
 System.out.print(queue[(front + i) % capacity] + " ");  
 }  
 System.out.println();  
 }  
 public static void main(String[] args) {  
 Scanner scanner = new Scanner(System.in);  
 System.out.print("Enter the capacity of the circular queue: ");  
 int capacity = scanner.nextInt();  
 CircularQueue queue = new CircularQueue(capacity);  
 while (true) {  
 System.out.println("\nMenu:");  
 System.out.println("1. Enqueue"); 
System.out.println("2. Dequeue");  
 System.out.println("3. Peek");  
 System.out.println("4. Display");  
 System.out.println("5. Exit");  
 System.out.print("Enter your choice: ");  
 int choice = scanner.nextInt();  
 switch (choice) {  
 case 1:  
 System.out.print("Enter a value to enqueue: ");  
 int value = scanner.nextInt();  
 queue.enqueue(value);  
 break;  
 case 2:  
 int dequeuedValue = queue.dequeue();  
 if (dequeuedValue != -1) {  
 System.out.println("Dequeued value: " + dequeuedValue);   }  
 break;  
 case 3:  
 int frontValue = queue.peek();  
 if (frontValue != -1) {  
 System.out.println("Front value: " + frontValue);  
 }  
 break;  
 case 4:  
 queue.display();  
 break;  
 case 5:  
 System.out.println("Exiting...");  
 scanner.close();  
 System.exit(0);  
 break;  
 default:  
 System.out.println("Invalid choice. Please try again.");  
 }  
 }  
 }  
} 

*****************************************************************************************
PriorityQueue 

Aim: Write a program to implement Priority Queue 

package Queue; 
import java.util.Scanner;  
class PriorityQueue {  
 private int[] elements;  
 private int[] priorities;  
 private int size;  
 private int capacity;  
 public PriorityQueue(int capacity) {  
 this.capacity = capacity;  
 elements = new int[capacity];  
 priorities = new int[capacity];  
 size = 0;  
 }  
 public boolean isEmpty() {  
 return size == 0;  
 }  
 public boolean isFull() {  
 return size == capacity;  
 }  
 public void enqueue(int value, int priority) {  
 if (isFull()) {  
 System.out.println("Priority Queue is full. Cannot enqueue " + value);   return;  
 }  
 int i;  
 for (i = size - 1; i >= 0 && priorities[i] > priority; i--) {  
 elements[i + 1] = elements[i];  
 priorities[i + 1] = priorities[i];  
 }  
 elements[i + 1] = value;  
 priorities[i + 1] = priority;  
 size++;  
 System.out.println(value + " enqueued with priority " + priority + ".");   } 

 public int dequeue() {  
 if (isEmpty()) {  
 System.out.println("Priority Queue is empty. Cannot dequeue.");   return -1;  
 }  
 int value = elements[0];  
 for (int i = 1; i < size; i++) {  
 elements[i - 1] = elements[i];  
 priorities[i - 1] = priorities[i];  
 }  
 size--;  
 return value;  
 } 
 public void display() {  
 if (isEmpty()) {  
 System.out.println("Priority Queue is empty.");  
 return;  
 }  
 System.out.println("Elements in Priority Queue:");  
 for (int i = 0; i < size; i++) {  
 System.out.println("Value: " + elements[i] + ", Priority: " + priorities[i]);   }  
 } 
  
 public static void main(String[] args) {  
 Scanner scanner = new Scanner(System.in);  
 System.out.print("Enter the capacity of the Priority Queue: ");  
 int capacity = scanner.nextInt();  
 PriorityQueue pq = new PriorityQueue(capacity);  
 while (true) {  
 System.out.println("\nMenu:");  
 System.out.println("1. Enqueue");  
 System.out.println("2. Dequeue");  
 System.out.println("3. Display");  
 System.out.println("4. Exit");  
 System.out.print("Enter your choice: ");  
 int choice = scanner.nextInt();  
 switch (choice) {  
 case 1: 
 System.out.print("Enter value to enqueue: ");  
 int value = scanner.nextInt();  
 System.out.print("Enter its priority: ");  
 int priority = scanner.nextInt();  
 pq.enqueue(value, priority);  
 break;  
 case 2:  
 int dequeuedValue = pq.dequeue();  
 if (dequeuedValue != -1) {  
 System.out.println("Dequeued value: " + dequeuedValue);   }  
 break;  
 case 3:  
 pq.display();  
 break;  
 case 4:  
 System.out.println("Exiting...");  
 scanner.close();  
 System.exit(0);  
 default:  
 System.out.println("Invalid choice. Please try again.");  
 }  
 }  
 }  
}  

*********************************************************************************************

DoubleEndedQueue 

Aim: Write a program to implement Double ended Queue 

package Queue; 
import java.util.Scanner;  
class Deque {  
 private int[] deque;  
 private int front, rear, size, capacity;  
 public Deque(int capacity) {  
 this.capacity = capacity;  
 deque = new int[capacity];  
 front = -1;  
 rear = -1;  
 size = 0;  
 }  
 public boolean isEmpty() {  
 return size == 0;  
 }  
 public boolean isFull() {  
 return size == capacity;  
 }  
 public void insertFront(int value) {  
 if (isFull()) {  
 System.out.println("Deque is full. Cannot insert " + value + " at the front.");   return;  
 }  
 if (front == -1) {  
 front = 0;  
 rear = 0;  
 } else {  
 front = (front - 1 + capacity) % capacity;  
 }  
 deque[front] = value;  
 size++;  
 System.out.println(value + " inserted at the front.");  
 }  
 public void insertRear(int value) { 

 if (isFull()) {  
 System.out.println("Deque is full. Cannot insert " + value + " at the rear.");   return;  
 }  
 if (front == -1) {  
 front = 0;  
 rear = 0;  
 } else {  
 rear = (rear + 1) % capacity;  
 }  
 deque[rear] = value;  
 size++;  
 System.out.println(value + " inserted at the rear.");  
 }  
 public int deleteFront() {  
 if (isEmpty()) {  
 System.out.println("Deque is empty. Cannot delete from front.");   return -1;  
 }  
 int value = deque[front];  
 if (front == rear) {  
 front = rear = -1;  
 } else {  
 front = (front + 1) % capacity;  
 }  
 size--;  
 return value;  
 }  
 public int deleteRear() {  
 if (isEmpty()) {  
 System.out.println("Deque is empty. Cannot delete from rear.");   return -1;  
 }  
 int value = deque[rear];  
 if (front == rear) {  
 front = rear = -1;  
 } else {  
 rear = (rear - 1 + capacity) % capacity;  
 }  
 size--; 
 return value;  
 }  
 public void display() {  
 if (isEmpty()) {  
 System.out.println("Deque is empty.");  
 return;  
 }  
 System.out.print("Deque elements: ");  
 for (int i = 0; i < size; i++) {  
 System.out.print(deque[(front + i) % capacity] + " ");  
 }  
 System.out.println();  
 }  
 public static void main(String[] args) {  
 Scanner scanner = new Scanner(System.in);  
 System.out.print("Enter the capacity of the Deque: ");  
 int capacity = scanner.nextInt();  
 Deque deque = new Deque(capacity);  
 while (true) {  
 System.out.println("\nMenu:");  
 System.out.println("1. Insert at Front");  
 System.out.println("2. Insert at Rear");  
 System.out.println("3. Delete from Front");  
 System.out.println("4. Delete from Rear");  
 System.out.println("5. Display");  
 System.out.println("6. Exit");  
 System.out.print("Enter your choice: ");  
 int choice = scanner.nextInt();  
 switch (choice) {  
 case 1:  
 System.out.print("Enter value to insert at front: ");  
 int frontValue = scanner.nextInt();  
 deque.insertFront(frontValue);  
 break;  
 case 2:  
 System.out.print("Enter value to insert at rear: ");  
 int rearValue = scanner.nextInt();  
 deque.insertRear(rearValue);  
 break; 
 case 3:  
 int frontDeleted = deque.deleteFront();  
 if (frontDeleted != -1) {  
 System.out.println("Deleted from front: " + frontDeleted);   }  
 break;  
 case 4:  
 int rearDeleted = deque.deleteRear();  
 if (rearDeleted != -1) {  
 System.out.println("Deleted from rear: " + rearDeleted);   }  
 break;  
 case 5:  
 deque.display();  
 break;  
 case 6:  
 System.out.println("Exiting...");  
 scanner.close();  
 System.exit(0);  
 break;  
 default:  
 System.out.println("Invalid choice. Please try again.");  
 }  
 }  
 }  
} 

********************************************************************************************

DoublyLinkedList 

Aim: Write a program to implement Doubly Linked List 


package Ads;

import java.util.Scanner; 
public class DoublyLinkedList { 
 Node head = null; 
 class Node { 
 int data; 
 Node prev,next; 
 public Node(int data) { 
 this.data = data; 
 this.next = null; 
 this.prev = null; 
 } 
 } 
  
 //Adding the element at the first 
 public void addFirst() { 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter the number you want to add: "); 
 int data = sc.nextInt(); 
 Node newNode = new Node(data); 
 if(head == null) { 
 head = newNode; 
 System.out.println("Inserted.\n"); 
 return; 
 } 
 newNode.next = head; 
 head.prev = newNode; 
 head = newNode;

 System.out.println("Inserted.\n"); 
 } 
 //Adding the element at the last 
 public void addLast() { 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter the number you want to add: "); 
 int data = sc.nextInt(); 
 Node newNode = new Node(data); 
 if(head == null) { 
 head = newNode; 
 System.out.println("Inserted.\n"); 
 return; 
 } 
 Node curNode = head; 
 while(curNode.next!=null){ 
 curNode = curNode.next; 
 } 
 newNode.prev = curNode; 
 curNode.next = newNode; 
 System.out.println("Inserted.\n"); 
 } 
 //Deleting the element 
 public void deleteNode() { 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter the number you want to delete: "); 
 int data = sc.nextInt(); 
  
 if (head == null) { 
 System.out.println("List is empty.\n"); 
 return; 
 } 
  
 Node curNode = head;

 Node prNode = null; 
  
 // If the deleting node is the head 
 if (curNode != null && curNode.data == data) { 
 head = curNode.next; 
 if (head != null) { 
 head.prev = null; 
 } 
 System.out.println("Deleted head node with value: " + data); 
 return; 
 } 
 while (curNode != null && curNode.data != data) { 
 curNode = curNode.next; 
 } 
  
 // If the node was not found 
 if (curNode == null) { 
 System.out.println("Node with value " + data + " not found.\n");  return; 
 } 
 if (curNode.prev != null) { 
 curNode.prev.next = curNode.next; 
 } 
 if (curNode.next != null) { 
 curNode.next.prev = curNode.prev; 
 } 
 } 
  
 //Displaying the List 
 public void dispLL() { 
 if(head == null) { 
 System.out.println("List is empty.\n"); 
 return; 
 } 
 Node curNode = head; 
 

 System.out.print("head -> "); 
 while (curNode != null) { 
 System.out.print(curNode.data + " -> ");  
 curNode = curNode.next;  
 } 
 System.out.println("null\n"); 
 } 
 //Searching for the element 
 public void searchLL(){ 
 Scanner sc = new Scanner(System.in); 
 System.out.print("Enter the number you want to search: "); 
 int data = sc.nextInt(); 
 int count = 0; 
 if(head == null) { 
 System.out.println("List is empty.\n"); 
 return; 
 } 
 Node crNode = head; 
 while(crNode != null){ 
 if(crNode.data == data) { 
 break; 
 } 
 count++; 
 crNode = crNode.next; 
 } 
 if (crNode == null) { 
 System.out.println("Element not found.\n"); 
 } 
 else { 
 System.out.println("Element found at the " + count + " position.\n");  } 
 } 
 public static void main(String[] args) { 
	    DoublyLinkedList ll = new DoublyLinkedList(); // Use the correct class name
	    while (1 != 0) { 
	        Scanner sc = new Scanner(System.in); 
	        System.out.print("1) Add First\n2) Add Last\n3) Delete\n4) Search\n5) Display\n6) Exit\n\nEnter your option (1,2,3,4,5): "); 
	        int opt = sc.nextInt(); 
	        switch (opt) { 
	            case 1: 
	                ll.addFirst(); 
	                continue; 

	            case 2: 
	                ll.addLast();  
	                continue; 
	            case 3: 
	                ll.deleteNode(); 
	                continue; 
	            case 4: 
	                ll.searchLL(); 
	                continue; 
	            case 5: 
	                ll.dispLL(); 
	                continue; 
	            case 6: 
	                System.exit(0); // Exit the program
	                break; 
	            default: 
	                System.out.println("Invalid option."); 
	                continue; 
	        } 
	    } 
	} 
}


*****************************************************************************************************


AdjacencyMatrix 

package Ads;

import java.util.Scanner;

class Graph {
    private int[][] adjacencyMatrix;
    private int numberOfVertices;

    public Graph(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        adjacencyMatrix = new int[numberOfVertices][numberOfVertices];
    }

    public void addEdge(int vertex1, int vertex2) {
        if (vertex1 < numberOfVertices && vertex2 < numberOfVertices) {
            adjacencyMatrix[vertex1][vertex2] = 1; // Directed graph
            adjacencyMatrix[vertex2][vertex1] = 1; // Undirected graph
            System.out.println("Edge added between vertex " + vertex1 + " and vertex " + vertex2);
        } else {
            System.out.println("Invalid vertex numbers.");
        }
    }

    public void removeEdge(int vertex1, int vertex2) {
        if (vertex1 < numberOfVertices && vertex2 < numberOfVertices) {
            adjacencyMatrix[vertex1][vertex2] = 0;
            adjacencyMatrix[vertex2][vertex1] = 0;
            System.out.println("Edge removed between vertex " + vertex1 + " and vertex " + vertex2);
        } else {
            System.out.println("Invalid vertex numbers.");
        }
    }

    public void display() {
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < numberOfVertices; i++) {
            for (int j = 0; j < numberOfVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isEdge(int vertex1, int vertex2) {
        if (vertex1 < numberOfVertices && vertex2 < numberOfVertices) {
            return adjacencyMatrix[vertex1][vertex2] == 1;
        } else {
            System.out.println("Invalid vertex numbers.");
            return false;
        }
    }
}

public class AdjacencyMatrixGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        Graph graph = new Graph(vertices);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add an edge");
            System.out.println("2. Remove an edge");
            System.out.println("3. Display the adjacency matrix");
            System.out.println("4. Check if there is an edge");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter vertex 1: ");
                    int vertex1 = scanner.nextInt();
                    System.out.print("Enter vertex 2: ");
                    int vertex2 = scanner.nextInt();
                    graph.addEdge(vertex1, vertex2);
                    break;
                case 2:
                    System.out.print("Enter vertex 1: ");
                    int vertex1ToRemove = scanner.nextInt();
                    System.out.print("Enter vertex 2: ");
                    int vertex2ToRemove = scanner.nextInt();
                    graph.removeEdge(vertex1ToRemove, vertex2ToRemove);
                    break;
                case 3:
                    graph.display();
                    break;
                case 4:
                    System.out.print("Enter vertex 1: ");
                    int vertex1Check = scanner.nextInt();
                    System.out.print("Enter vertex 2: ");
                    int vertex2Check = scanner.nextInt();
                    boolean isEdge = graph.isEdge(vertex1Check, vertex2Check);
                    if (isEdge) {
                        System.out.println("There is an edge between vertex " + vertex1Check + " and vertex " + vertex2Check);
                    } else {
                        System.out.println("No edge between vertex " + vertex1Check + " and vertex " + vertex2Check);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

*****************************************************************************************************

DFS and BFS 
Aim: Write a menu driven program to implement DFS and BFS 

package Ads;

import java.util.*;  
class DFSnBFS {  
 private int numberOfVertices;  
 private List<LinkedList<Integer>> adjacencyList;  
 public DFSnBFS(int numberOfVertices) {  
 this.numberOfVertices = numberOfVertices;  
 adjacencyList = new ArrayList<>();  
 for (int i = 0; i < numberOfVertices; i++) {  
 adjacencyList.add(new LinkedList<Integer>());  
 }  
 }  
 public void addEdge(int vertex1, int vertex2) {  
 adjacencyList.get(vertex1).add(vertex2);
 }// Directed edge from vertex1 to vertex2   adjacencyList.get(vertex2).add(vertex1); // Since it's an undirected graph   System.out.println("Edge added between " + vertex1 + " and " + vertex2);   }  
 public void dfs(int startVertex) {  
 boolean[] visited = new boolean[numberOfVertices];  
 System.out.print("DFS Traversal starting from vertex " + startVertex + ": ");   dfsUtil(startVertex, visited);  
 System.out.println();  
 }  
 private void dfsUtil(int vertex, boolean[] visited) {  
 visited[vertex] = true;  
 System.out.print(vertex + " ");  
 for (int adjacent : adjacencyList.get(vertex)) {  
 if (!visited[adjacent]) {  
 dfsUtil(adjacent, visited);  
 }  
 }  
 }  
 public void bfs(int startVertex) {  
 boolean[] visited = new boolean[numberOfVertices];  
 LinkedList<Integer> queue = new LinkedList<>(); // Using LinkedList as a queue 
 visited[startVertex] = true;  
 queue.add(startVertex);  
 System.out.print("BFS Traversal starting from vertex " + startVertex + ": ");   while (!queue.isEmpty()) {  
 int vertex = queue.poll();  
 System.out.print(vertex + " ");  
 for (int adjacent : adjacencyList.get(vertex)) {  
 if (!visited[adjacent]) {  
 visited[adjacent] = true;  
 queue.add(adjacent);  
 }  
 }  
 }  
 System.out.println();  
 }  
 public void display() {  
 System.out.println("\nAdjacency List:");  
 for (int i = 0; i < numberOfVertices; i++) {  
 System.out.print(i + ": ");  
 for (int vertex : adjacencyList.get(i)) {  
 System.out.print(vertex + " ");  
 }  
 System.out.println();  
 }  
 }  
 public static void main(String[] args) {  
 Scanner scanner = new Scanner(System.in);  
 System.out.print("Enter the number of vertices: ");  
 int vertices = scanner.nextInt();  
 DFSnBFS graph = new DFSnBFS(vertices);  
 while (true) {  
 System.out.println("\nMenu:");  
 System.out.println("1. Add an edge");  
 System.out.println("2. Display the graph");  
 System.out.println("3. Perform DFS");  
 System.out.println("4. Perform BFS");  
 System.out.println("5. Exit");  
 System.out.print("Enter your choice: "); 
 int choice = scanner.nextInt();  
 switch (choice) {  
 case 1:  
 System.out.print("Enter vertex 1: ");  
 int vertex1 = scanner.nextInt();  
 System.out.print("Enter vertex 2: ");  
 int vertex2 = scanner.nextInt();  
 graph.addEdge(vertex1, vertex2);  
 break;  
 case 2:  
 graph.display();  
 break;  
 case 3:  
 System.out.print("Enter the starting vertex for DFS: ");  
 int dfsStart = scanner.nextInt();  
 graph.dfs(dfsStart);  
 break;  
 case 4:  
 System.out.print("Enter the starting vertex for BFS: ");  
 int bfsStart = scanner.nextInt();  
 graph.bfs(bfsStart);  
 break;  
 case 5:  
 System.out.println("Exiting...");  
 scanner.close();  
 System.exit(0);  
 break;  
 default:  
 System.out.println("Invalid choice. Please try again.");  
 }  
 }  
 }  
} 

***************************************************************************************************
BinarySearchTree 

Aim: Write a program to implement different operations on Binary Search Tree (BST) 

package Tree; 
import java.util.Scanner;  
class BinarySearchTree {  
 static class Node {  
 int key;  
 Node left, right;  
 public Node(int item) {  
 key = item;  
 left = right = null;  
 }  
 }  
 Node root;  
 BinarySearchTree() {  
 root = null;  
 }  
 void insert(int key) {  
 root = insertRec(root, key);  
 }  
 Node insertRec(Node root, int key) {  
 if (root == null) {  
 root = new Node(key);  
 return root;  
 }  
 if (key < root.key)  
 root.left = insertRec(root.left, key);  
 else if (key > root.key)  
 root.right = insertRec(root.right, key);  
 return root;  
 }  
 void deleteKey(int key) {  
 root = deleteRec(root, key);  
 }  
 Node deleteRec(Node root, int key) { 
 if (root == null)  
 return root;  
 if (key < root.key)  
 root.left = deleteRec(root.left, key);  
 else if (key > root.key)  
 root.right = deleteRec(root.right, key);  
 else {  
 if (root.left == null)  
 return root.right;  
 else if (root.right == null)  
 return root.left;  
 root.key = minValue(root.right); 
 root.right = deleteRec(root.right, root.key);  
 }  
 return root;  
 }  
 int minValue(Node root) {  
 int minValue = root.key;  
 while (root.left != null) {  
 minValue = root.left.key;  
 root = root.left;  
 }  
 return minValue;  
 }  
 boolean search(int key) {  
 return searchRec(root, key);  
 }  
 boolean searchRec(Node root, int key) {  
 if (root == null)  
 return false;  
 if (root.key == key)  
 return true;  
 return key < root.key ? searchRec(root.left, key) : searchRec(root.right, key);   }  
 void inorder() {  
 inorderRec(root);  
 System.out.println();  
 }  
 void inorderRec(Node root) {  
 if (root != null) { 
 inorderRec(root.left);  
 System.out.print(root.key + " ");  
 inorderRec(root.right);  
 }  
 }  
 void preorder() {  
 preorderRec(root);  
 System.out.println();  
 }  
 void preorderRec(Node root) {  
 if (root != null) {  
 System.out.print(root.key + " ");  
 preorderRec(root.left);  
 preorderRec(root.right);  
 }  
 }  
 void postorder() {  
 postorderRec(root);  
 System.out.println();  
 }  
 void postorderRec(Node root) {  
 if (root != null) {  
 postorderRec(root.left);  
 postorderRec(root.right);  
 System.out.print(root.key + " ");  
 }  
 }  
 public static void main(String[] args) {  
 Scanner scanner = new Scanner(System.in);  
 BinarySearchTree bst = new BinarySearchTree();  
 while (true) {  
 System.out.println("\nMenu:");  
 System.out.println("1. Insert a key");  
 System.out.println("2. Delete a key");  
 System.out.println("3. Search for a key");  
 System.out.println("4. In-order traversal");  
 System.out.println("5. Pre-order traversal");  
 System.out.println("6. Post-order traversal");  
 System.out.println("7. Exit"); 

 System.out.print("Enter your choice: ");  
 int choice = scanner.nextInt();  
 switch (choice) {  
 case 1:  
 System.out.print("Enter key to insert: ");  
 int keyToInsert = scanner.nextInt();  
 bst.insert(keyToInsert);  
 System.out.println("Key inserted.");  
 break;  
 case 2:  
 System.out.print("Enter key to delete: ");  
 int keyToDelete = scanner.nextInt();  
 bst.deleteKey(keyToDelete);  
 System.out.println("Key deleted (if it existed).");  
 break;  
 case 3:  
 System.out.print("Enter key to search: ");  
 int keyToSearch = scanner.nextInt();  
 if (bst.search(keyToSearch))  
 System.out.println("Key found.");  
 else  
 System.out.println("Key not found.");  
 break;  
 case 4:  
 System.out.println("In-order traversal:");  
 bst.inorder();  
 break;  
 case 5:  
 System.out.println("Pre-order traversal:");  
 bst.preorder();  
 break;  
 case 6:  
 System.out.println("Post-order traversal:");  
 bst.postorder();  
 break;  
 case 7:  
 System.out.println("Exiting...");  
 scanner.close();  
 System.exit(0);  
 break; 

 default:  
 System.out.println("Invalid choice. Please try again.");  
 }  
 }  
 }  
}  


******************************************************************************************************
Hashing 

Aim: Write a menu driven program for implementing various Hashing techniques with  Linear Probing 

package Tree; 
import java.util.Scanner;  
class Hashing {  
 private int[] table;  
 private int size;  
 private static final int DELETED = Integer.MIN_VALUE;  
 public Hashing(int size) {  
 this.size = size;  
 table = new int[size];  
 for (int i = 0; i < size; i++) {  
 table[i] = -1; // Initialize table with -1 (empty slots)  
 }  
 }  
 private int hashFunction(int key) {  
 return key % size;  
 }  
 public void insert(int key) {  
 int index = hashFunction(key);  
 int originalIndex = index;  
 boolean inserted = false;  
 do {  
 if (table[index] == -1 || table[index] == DELETED) { // Empty or deleted slot   table[index] = key;  
 inserted = true;  
 System.out.println("Key " + key + " inserted at index " + index);   break;  
 }  
 index = (index + 1) % size; // Linear probing  
 } while (index != originalIndex);  
 if (!inserted) {  
 System.out.println("Hash table is full. Cannot insert key " + key); 
 }  
 }  
 public boolean search(int key) {  
 int index = hashFunction(key);  
 int originalIndex = index;  
 do {  
 if (table[index] == key) {  
 System.out.println("Key " + key + " found at index " + index);   return true;  
 } else if (table[index] == -1) {  
 break; // Stop if an empty slot is found  
 }  
 index = (index + 1) % size; // Linear probing  
 } while (index != originalIndex);  
 System.out.println("Key " + key + " not found.");  
 return false;  
 }  
 public void delete(int key) {  
 int index = hashFunction(key);  
 int originalIndex = index;  
 do {  
 if (table[index] == key) {  
 table[index] = DELETED; // Mark the slot as deleted  
 System.out.println("Key " + key + " deleted from index " + index);   return;  
 } else if (table[index] == -1) {  
 break; // Stop if an empty slot is found  
 }  
 index = (index + 1) % size; // Linear probing  
 } while (index != originalIndex);  
 System.out.println("Key " + key + " not found. Cannot delete.");  
 }  
 public void display() {  
 System.out.println("\nHash Table:");  
 for (int i = 0; i < size; i++) {  
 if (table[i] == -1) {  
 System.out.println(i + ": EMPTY");  
 } else if (table[i] == DELETED) {  
 System.out.println(i + ": DELETED"); 

 } else {  
 System.out.println(i + ": " + table[i]);  
 }  
 }  
 }  
 public static void main(String[] args) {  
 Scanner scanner = new Scanner(System.in);  
 System.out.print("Enter the size of the hash table: ");  
 int size = scanner.nextInt();  
 Hashing hashTable = new Hashing(size);  
 while (true) {  
 System.out.println("\nMenu:");  
 System.out.println("1. Insert a key");  
 System.out.println("2. Search for a key");  
 System.out.println("3. Delete a key");  
 System.out.println("4. Display the hash table");  
 System.out.println("5. Exit");  
 System.out.print("Enter your choice: ");  
 int choice = scanner.nextInt();  
 switch (choice) {  
 case 1:  
 System.out.print("Enter key to insert: ");  
 int keyToInsert = scanner.nextInt();  
 hashTable.insert(keyToInsert);  
 break;  
 case 2:  
 System.out.print("Enter key to search: ");  
 int keyToSearch = scanner.nextInt();  
 hashTable.search(keyToSearch);  
 break;  
 case 3:  
 System.out.print("Enter key to delete: ");  
 int keyToDelete = scanner.nextInt();  
 hashTable.delete(keyToDelete);  
 break;  
 case 4:  
 hashTable.display();  
 break;  
 case 5: 
 System.out.println("Exiting...");  
 scanner.close();  
 System.exit(0);  
 default:  
 System.out.println("Invalid choice. Please try again.");  
 }  
 }  
 }  
}  

******************************************************************************************
Heap

Aim: Write a program to implement Heap with different operations (Create, Insert, Delete) 
 
package Tree; 
import java.util.Scanner;  
class Heap {  
 private int[] heap;  
 private int size;  
 private int capacity;  
 public Heap(int capacity) {  
 this.capacity = capacity;  
 this.size = 0;  
 this.heap = new int[capacity];  
 }  
 private int parent(int i) {  
 return (i - 1) / 2;  
 }  
 private int leftChild(int i) {  
 return 2 * i + 1;  
 }  
 private int rightChild(int i) {  
 return 2 * i + 2;  
 }  
 private void swap(int i, int j) {  
 int temp = heap[i];  
 heap[i] = heap[j];  
 heap[j] = temp;  
 }  
 public void insert(int value) {  
 if (size == capacity) {  
 System.out.println("Heap is full. Cannot insert.");  
 return;  
 }  
 heap[size] = value;  
 size++;  
 int current = size - 1;  
 while (current != 0 && heap[current] > heap[parent(current)]) { 

 swap(current, parent(current));  
 current = parent(current);  
 }  
 System.out.println("Inserted " + value + " into the heap.");  
 }  
 public int delete() {  
 if (size == 0) {  
 System.out.println("Heap is empty. Cannot delete.");  
 return -1;  
 }  
 int root = heap[0];  
 heap[0] = heap[size - 1];  
 size--;  
 heapify(0);  
 System.out.println("Deleted root: " + root);  
 return root;  
 }  
 private void heapify(int i) {  
 int largest = i;  
 int left = leftChild(i);  
 int right = rightChild(i);  
 if (left < size && heap[left] > heap[largest]) {  
 largest = left;  
 }  
 if (right < size && heap[right] > heap[largest]) {  
 largest = right;  
 }  
 if (largest != i) {  
 swap(i, largest);  
 heapify(largest);  
 }  
 }  
 public void display() {  
 if (size == 0) {  
 System.out.println("Heap is empty.");  
 return;  
 }  
 System.out.print("Heap elements: ");  
 for (int i = 0; i < size; i++) {  
 System.out.print(heap[i] + " "); 
 }  
 System.out.println();  
 }  
 public static void main(String[] args) {  
 Scanner scanner = new Scanner(System.in);  
 System.out.print("Enter the capacity of the heap: ");  
 int capacity = scanner.nextInt();  
 Heap heap = new Heap(capacity);  
 while (true) {  
 System.out.println("\nMenu:");  
 System.out.println("1. Insert a value");  
 System.out.println("2. Delete the root");  
 System.out.println("3. Display the heap");  
 System.out.println("4. Exit");  
 System.out.print("Enter your choice: ");  
 int choice = scanner.nextInt();  
 switch (choice) {  
 case 1:  
 System.out.print("Enter the value to insert: ");  
 int value = scanner.nextInt();  
 heap.insert(value);  
 break;  
 case 2:  
 heap.delete();  
 break;  
 case 3:  
 heap.display();  
 break;  
 case 4:  
 System.out.println("Exiting...");  
 scanner.close();  
 System.exit(0);  
 default:  
 System.out.println("Invalid choice. Please try again.");  
 }  
 }  
 } 
} 

*************************************************************************************************
Kruskals algorithm
Aim: Write a program to implement Heap with different operations (Create, Insert, Delete) 


package Ads;




import java.util.*;

class Edge implements Comparable<Edge> {
    int source, destination, weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

class DisjointSet {
    private int[] parent, rank;

    public DisjointSet(int vertices) {
        parent = new int[vertices];
        rank = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int vertex) {
        if (parent[vertex] != vertex) {
            parent[vertex] = find(parent[vertex]); // Path compression
        }
        return parent[vertex];
    }

    public void union(int root1, int root2) {
        if (rank[root1] > rank[root2]) {
            parent[root2] = root1;
        } else if (rank[root1] < rank[root2]) {
            parent[root1] = root2;
        } else {
            parent[root2] = root1;
            rank[root1]++;
        }
    }
}

public class KruskalsAlgorithm {
    private int vertices;
    private List<Edge> edges;

    public KruskalsAlgorithm(int vertices) {
        this.vertices = vertices;
        edges = new ArrayList<>();
    }

    public void addEdge(int source, int destination, int weight) {
        edges.add(new Edge(source, destination, weight));
    }

    public void findMST() {
        Collections.sort(edges); // Sort edges by weight

        DisjointSet disjointSet = new DisjointSet(vertices);
        List<Edge> mst = new ArrayList<>();
        int mstWeight = 0;

        for (Edge edge : edges) {
            int root1 = disjointSet.find(edge.source);
            int root2 = disjointSet.find(edge.destination);

            // If including this edge does not form a cycle
            if (root1 != root2) {
                mst.add(edge);
                mstWeight += edge.weight;
                disjointSet.union(root1, root2);
            }

            // If MST is complete (contains V-1 edges), break
            if (mst.size() == vertices - 1) {
                break;
            }
        }

        // Print the MST
        System.out.println("Edges in the Minimum Spanning Tree:");
        for (Edge edge : mst) {
            System.out.println(edge.source + " -- " + edge.destination + " == " + edge.weight);
        }
        System.out.println("Total weight of MST: " + mstWeight);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();

        KruskalsAlgorithm graph = new KruskalsAlgorithm(vertices);

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        System.out.println("Enter the edges (source destination weight):");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            int weight = scanner.nextInt();
            graph.addEdge(source, destination, weight);
        }

        graph.findMST();
        scanner.close();
    }
}






