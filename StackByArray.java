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
