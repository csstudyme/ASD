import java.util.Scanner; 
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
