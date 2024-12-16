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
