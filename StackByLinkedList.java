import java.util.Scanner;

public class StackByLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add to the first (push operation for stack)
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Print stack
    public void printList() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node currNode = head;
        System.out.print("Stack elements: ");
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Remove the first (pop operation for stack)
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Stack underflow! The stack is empty.");
            return;
        }
        System.out.println("Popped element: " + head.data);
        head = head.next;
    }

    public static void main(String[] args) {
        StackByLinkedList stack = new StackByLinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1) Push");
            System.out.println("2) Pop");
            System.out.println("3) Display Stack");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");

            if (sc.hasNextInt()) {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1: // Push
                        System.out.print("Enter the value to push: ");
                        if (sc.hasNextInt()) {
                            int value = sc.nextInt();
                            stack.addFirst(value);
                            System.out.println(value + " pushed onto the stack.");
                        } else {
                            System.out.println("Invalid input! Please enter an integer.");
                            sc.next(); // Clear invalid input
                        }
                        break;

                    case 2: // Pop
                        stack.deleteFirst();
                        break;

                    case 3: // Display
                        stack.printList();
                        break;

                    case 4: // Exit
                        System.out.println("Exiting program. Goodbye!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice! Please choose a valid option.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Clear invalid input
            }
        }
    }
}
