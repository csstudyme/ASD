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

